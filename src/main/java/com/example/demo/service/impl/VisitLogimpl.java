package com.example.demo.impl;
import com.example.demo.repository.VisitLogrepository;
import com.example.demo.service.VisitLogService;
import org.springframework.streotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class VisitLogimpl implements VisitLogService{
    @Autowired
    VisitLogrepository obj;
    public VisitorLog checkInVisitor(Long visitorId.Long hostId,String purpose){
        
    }

}