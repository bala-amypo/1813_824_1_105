package com.example.demo.service.impl;
import com.example.demo.repository.Hostrepository;
import com.example.demo.service.HostService;
import com.example.demo.model.Host;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class  Hostimpl implements HostService{
    @Autowired
    Hostrepository obj;
    public Host createHost(Host host){
      return obj.save(host);
    }
    public Host getHost(Long id){
        return obj.findById(id).orElse(null);
    }
    public List<Host> getAllHost(){
        return obj.findAll();
    }
}