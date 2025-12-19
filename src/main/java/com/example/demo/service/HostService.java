package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.Host;
@Service
public interface HostService{
    Host createHost(Host host);
    Host getHost(Long id);
    Host getAllHosts();
}