package com.example.demo.service.impl;
import com.example.demo.repository.AlertNotificationrepository;
import com.example.demo.service.AlertNotificationService;
import com.example.demo.model.AlertNotification;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class  AlertNotificationimpl implements AlertNotificationService{
    @Autowired
    AlertNotificationrepository obj;
    public AlertNotification sendAlert(Host host){
      return obj.save(host);
    }
    public Host getHost(Long id){
        return obj.findById(id).orElse(null);
    }
    public List<Host> getAllHost(){
        return obj.findAll();
    }
}