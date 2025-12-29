package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.model.Visitor;
import com.example.demo.model.Host;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.repository.HostRepository;
import com.example.demo.service.VisitLogService;

import java.time.LocalDateTime;
import java.util.List;

public class VisitLogServiceImpl implements VisitLogService {

    public VisitLogRepository visitLogRepository;
    public VisitorRepository visitorRepository;
    public HostRepository hostRepository;

    public VisitLog checkInVisitor(Long vId, Long hId, String purpose) {
        Visitor v = visitorRepository.findById(vId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
        Host h = hostRepository.findById(hId)
                .orElseThrow(() -> new RuntimeException("Host not found"));

        VisitLog vl = new VisitLog();
        vl.setVisitor(v);
        vl.setHost(h);
        vl.setCheckInTime(LocalDateTime.now());
        vl.setAccessGranted(true);

        return visitLogRepository.save(vl);
    }

    public VisitLog checkOutVisitor(Long id) {
        VisitLog vl = visitLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("VisitLog not found"));
        if (vl.getCheckInTime() == null) {
            throw new IllegalStateException("Visitor not checked in");
        }
        vl.setCheckOutTime(LocalDateTime.now());
        return visitLogRepository.save(vl);
    }

    public List<VisitLog> getActiveVisits() {
        return visitLogRepository.findByCheckOutTimeIsNull();
    }

    public VisitLog getVisitLog(Long id) {
        return visitLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("VisitLog not found"));
    }
}
