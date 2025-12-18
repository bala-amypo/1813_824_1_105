package com.example.demo.service.impl;
import java.util.List;
import com.example.demo.service.VisitorService;

import org.springframework.stereotype.Service;
import com.example.demo.repository.Visitorrepository;
import com.example.demo.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class Visitorimpl implements VisitorService {
    @Autowired
    Visitorrepository obj;
    public Visitor createVisitor(Visitor visitor){
        return obj.save(visitor);
    }
    public Visitor getVisitor(Long id){
      return obj.findById(id);
    }
    public List<Visitor> getAllVisitors(){
        return obj.findAll();
    }
}