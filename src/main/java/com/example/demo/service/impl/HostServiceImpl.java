package com.example.demo.service.impl;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.HostService;
import com.example.demo.model.Host;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class HostServiceImpl {

    private HostRepository hostRepository;

    public Host createHost(Host h) {
        return hostRepository.save(h);
    }

    public Host getHost(Long id) {
        return hostRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Host not found"));
    }
}