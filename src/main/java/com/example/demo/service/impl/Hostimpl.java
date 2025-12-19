package com.example.demo.service.impl;
import com.example.demo.repository.Hostrepository;
import com.example.demo.controller.Hostcontroller;
import com.example.demo.model.Host;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
public class  Hostimpl extends HostService{
    @Autowired
    Hostrepository obj;
    public Host createHost(Host host){
      return obj.save(Host);
    }
    public Host getHost(Long id){
        return obj.findById(id).orElse(null);
    }
    public Host getAllHosts(){
        return obj.findAll();
    }
}