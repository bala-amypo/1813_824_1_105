package com.example.demo.service;

import com.example.demo.model.Host;
import java.util.List;

public interface HostService {
    Host createHost(Host h);
    Host getHost(Long id);
    List<Host> getAllHosts();
}
