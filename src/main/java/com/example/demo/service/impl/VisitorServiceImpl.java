package com.example.demo.service.impl;
import java.util.List;
import com.example.demo.service.VisitorService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class VisitorServiceImpl {

    private VisitorRepository visitorRepository;

    public VisitorServiceImpl(VisitorRepository repo) {
        this.visitorRepository = repo;
    }

    public Visitor createVisitor(Visitor v) {
        return visitorRepository.save(v);
    }

    public Visitor getVisitor(Long id) {
        return visitorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
    }

    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }
}