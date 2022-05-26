package com.samucatezu.servermanagerbackend.services.implementation;

import com.samucatezu.servermanagerbackend.model.ServerModel;
import com.samucatezu.servermanagerbackend.services.ServerService;

import java.io.IOException;
import java.util.Collection;

public class ServerServiceImpl implements ServerService {
    @Override
    public ServerModel create(ServerModel serverModel) {
        return null;
    }

    @Override
    public ServerModel ping(String ipAddress) throws IOException {
        return null;
    }

    @Override
    public Collection<ServerModel> list(int limit) {
        return null;
    }

    @Override
    public ServerModel get(Long id) {
        return null;
    }

    @Override
    public ServerModel update(ServerModel serverModel) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
