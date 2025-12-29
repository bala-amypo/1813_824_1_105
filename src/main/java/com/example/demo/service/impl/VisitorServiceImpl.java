package com.example.demo.service.impl;

import com.example.demo.model.Visitor;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitorService;
import java.util.List;

public class VisitorServiceImpl implements VisitorService {

    public VisitorRepository visitorRepository;

    public VisitorServiceImpl() {}

    public VisitorServiceImpl(VisitorRepository repo) {
        this.visitorRepository = repo;
    }

    public Visitor createVisitor(Visitor v) {
        return visitorRepository.save(v);
    }

    public Visitor getVisitor(Long id) {
        return visitorRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Visitor not found"));
    }

    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }
}
