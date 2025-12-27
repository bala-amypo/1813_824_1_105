package com.example.demo.controller;

import com.example.demo.model.Host;
import com.example.demo.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hosts")
public class HostController {

    @Autowired
    private HostService hostService;

    @PostMapping
    public Host createHost(@RequestBody Host host) {
        return hostService.createHost(host);
    }

    @GetMapping("/id")
    public Host getHost(@PathVariable Long id) {
        return hostService.getHost(id);
    }
}
