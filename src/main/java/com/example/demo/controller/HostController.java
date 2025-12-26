package com.example.demo.controller;

import com.example.demo.model.Host;
import com.example.demo.service.HostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostController {

    private HostService hostService;

    public HostController(HostService hostService) {
        this.hostService = hostService;
    }

    @PostMapping("/hosts")
    public Host create(@RequestBody Host host) {
        return hostService.createHost(host);
    }

    @GetMapping("/hosts/{id}")
    public Host get(@PathVariable Long id) {
        return hostService.getHost(id);
    }
}
