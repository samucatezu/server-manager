package com.samucatezu.servermanagerbackend.repository;


import com.samucatezu.servermanagerbackend.model.ServerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<ServerModel, Long> {
    ServerModel findByIpAddress(String ipAddress);
}
