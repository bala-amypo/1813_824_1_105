package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.Host;
@Service
public interface HostService{
    public Host createHost(Host host);
    public Host getHost(Long id);
    public Host getAllHosts();
}