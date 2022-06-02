package com.samucatezu.servermanagerbackend.repository;


import com.samucatezu.servermanagerbackend.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
