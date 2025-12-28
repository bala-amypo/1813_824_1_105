package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.model.Visitor;
import com.example.demo.model.Host;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private VisitLogRepository visitLogRepository;
    private VisitorRepository visitorRepository;
    private HostRepository hostRepository;

    @Override
    public VisitLog checkInVisitor(Long visitorId, Long hostId, String purpose) {
        Visitor v = visitorRepository.findById(visitorId).orElseThrow();
        Host h = hostRepository.findById(hostId).orElseThrow();
        VisitLog vl = new VisitLog();
        vl.setVisitor(v);
        vl.setHost(h);
        vl.setCheckInTime(LocalDateTime.now());
        vl.setAccessGranted(true);
        return visitLogRepository.save(vl);
    }

    @Override
    public VisitLog checkOutVisitor(Long visitLogId) {
        VisitLog vl = visitLogRepository.findById(visitLogId).orElseThrow(() -> new RuntimeException("VisitLog not found"));
        if(vl.getCheckInTime() == null) throw new IllegalStateException("Visitor not checked in");
        vl.setCheckOutTime(LocalDateTime.now());
        return visitLogRepository.save(vl);
    }

    @Override
    public VisitLog getVisitLog(Long id) {
        return visitLogRepository.findById(id).orElseThrow(() -> new RuntimeException("VisitLog not found"));
    }

    @Override
    public List<VisitLog> getActiveVisits() {
        return visitLogRepository.findByCheckOutTimeIsNull();
    }
}
