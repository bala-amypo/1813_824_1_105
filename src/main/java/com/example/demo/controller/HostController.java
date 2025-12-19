package com.example.demo.controller;
import com.example.demo.service.HostService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Host;
import java.util.List;
@RestController
public class HostController{
    @Autowired
    HostService obj;
    @PostMapping
    public Host Hostcontroller(@RequestBody Host host){
        return obj.createHost(host);
    }
    @GetMapping("/{id}")
    public Host Hostcontr(@PathVariable Long id){
        return obj.getHost(id);
    }
    @GetMapping
    public List<Host> getHost(){
        return obj.getAllHost();
    }


}