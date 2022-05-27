package com.samucatezu.servermanagerbackend.services.implementation;

import com.samucatezu.servermanagerbackend.model.ServerModel;
import com.samucatezu.servermanagerbackend.repository.ServerRepository;
import com.samucatezu.servermanagerbackend.services.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collection;
import java.util.Random;

import static com.samucatezu.servermanagerbackend.enumeration.Status.SERVER_DOWN;
import static com.samucatezu.servermanagerbackend.enumeration.Status.SERVER_UP;
import static java.lang.Boolean.TRUE;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService {

    private final ServerRepository serverRepository;

    @Override
    public ServerModel create(ServerModel serverModel) {
        log.info("Saving new server: {}", serverModel.getName());
        serverModel.setImageUrl(setServerImageUrl());
        return serverRepository.save(serverModel);
    }

    @Override
    public ServerModel ping(String ipAddress) throws IOException {
        log.info("Pinging server IP: {}", ipAddress);
        ServerModel serverModel = serverRepository.findByIpAddress(ipAddress);
        InetAddress address = InetAddress.getByName(ipAddress);
        serverModel.setStatus(address.isReachable(10000) ? SERVER_UP : SERVER_DOWN);
        serverRepository.save(serverModel);
        return serverModel;
    }

    @Override
    public Collection<ServerModel> list(int limit) {
        log.info("Fetching all servers");
        return serverRepository.findAll(of(0, limit)).toList();
    }

    @Override
    public ServerModel get(Long id) {
        log.info("Fetching server by id: {}", id);
        return serverRepository.findById(id).get();
    }

    @Override
    public ServerModel update(ServerModel serverModel) {
        log.info("Updating server: {}", serverModel.getName());
        return serverRepository.save(serverModel);
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Deleting server by ID: {}", id);
        serverRepository.deleteById(id);
        return TRUE;
    }

    private String setServerImageUrl() {
        String[] imageNames = { "server1.png", "server2.png", "server3.png", "server4.png" };
        return ServletUriComponentsBuilder.fromCurrentContextPath().path("/server/image/" + imageNames[new Random().nextInt(4)]).toUriString();
    }

    private boolean isReachable(String ipAddress, int port, int timeOut) {
        try {
            try(Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(ipAddress, port), timeOut);
            }
            return true;
        }catch (IOException exception){
            return false;
        }
    }
}
