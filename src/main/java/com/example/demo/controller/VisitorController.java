package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.VisitorService;
@RestController
public class VisitorController{
    @Autowired
    VisitorService obj;
    @PostMapping("/")
    public Visitor Visitorcontroller(@RequestBody Visitor visitor){
        return obj.createVisitor(visitor);
    }
    @GetMapping("/")
    public Visitor Visitorcontr(@PathVariable Long id){
        return obj.getVisitor(id);
    }
    @GetMapping("/{id}")
    List<Visitor> getAllVisitor();
}
