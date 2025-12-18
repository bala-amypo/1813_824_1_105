package com.example.demo.service;
import jakarta.persistence.Service;
import com.example.demo.model.Visitor;
import java.util.List;
@Service
public interface VisitorService{
 Visitor createVisitor(Visitor visitor);

 Visitor getVisitor(Long id);
 List<Visitor> getAllVisitor();
}