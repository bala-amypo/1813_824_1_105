package com.example.demo.controller;

import com.example.demo.model.Visitor;
import com.example.demo.service.VisitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitors")
public class VisitorController {

    private VisitorService visitorService;

    public VisitorController(VisitorService service) {
        this.visitorService = service;
    }

    @PostMapping
    public Visitor createVisitor(@RequestBody Visitor v) {
        return visitorService.createVisitor(v);
    }

    @GetMapping("/{id}")
    public Visitor getVisitor(@PathVariable Long id) {
        return visitorService.getVisitor(id);
    }

    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorService.getAllVisitors();
    }
}
