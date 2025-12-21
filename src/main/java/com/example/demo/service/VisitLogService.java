package com.example.demo.service;
import org.springframework.stereotype.Service;
import com.example.demo.model.VisitLog;

public interface VisitLogService{
    public VisitLog checkInVisitor(Long visitorId,Long hostId,String purpose);
    public VisitLog checkOutVisitor(Long visitLogId);
    public VisitLog getActiveVisits();
    public VisitLog getVisitLog(Long id);
}