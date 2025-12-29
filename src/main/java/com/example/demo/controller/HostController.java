package com.example.demo.controller;

import com.example.demo.model.Host;
import com.example.demo.service.HostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hosts")
public class HostController {

    private HostService hostService;

    public HostController(HostService service) {
        this.hostService = service;
    }

    @PostMapping
    public Host createHost(@RequestBody Host h) {
        return hostService.createHost(h);
    }

    @GetMapping("/{id}")
    public Host getHost(@PathVariable Long id) {
        return hostService.getHost(id);
    }

    @GetMapping
    public List<Host> getAllHosts() {
        return hostService.getAllHosts();
    }
}
