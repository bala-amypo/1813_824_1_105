package com.example.demo.service;

import com.example.demo.model.Host;

public interface HostService {
    Host createHost(Host host);
    Host getHostById(Long id);
}
