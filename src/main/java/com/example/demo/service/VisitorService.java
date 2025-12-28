package com.example.demo.service;

import com.example.demo.model.Visitor;

public interface VisitorService {
    Visitor createVisitor(Visitor visitor);
    Visitor getVisitorById(Long id);
}
