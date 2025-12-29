package com.example.demo.service.impl;

import com.example.demo.model.Host;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.HostService;
import java.util.List;

public class HostServiceImpl implements HostService {

    public HostRepository hostRepository;

    public HostServiceImpl() {}

    public HostServiceImpl(HostRepository repo) {
        this.hostRepository = repo;
    }

    public Host createHost(Host h) {
        if (hostRepository.findByEmail(h.getEmail()).isPresent()) {
            throw new RuntimeException("constraint violation");
        }
        return hostRepository.save(h);
    }

    public Host getHost(Long id) {
        return hostRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Host not found"));
    }

    public List<Host> getAllHosts() {
        return hostRepository.findAll();
    }
}
