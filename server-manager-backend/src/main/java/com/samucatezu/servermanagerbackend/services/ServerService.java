package com.samucatezu.servermanagerbackend.services;


import com.samucatezu.servermanagerbackend.model.ServerModel;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    ServerModel create(ServerModel serverModel);
    ServerModel ping(String ipAddress) throws IOException;
    Collection<ServerModel> list(int limit);
    ServerModel get(Long id);
    ServerModel update(ServerModel serverModel);
    Boolean delete(Long id);
}
