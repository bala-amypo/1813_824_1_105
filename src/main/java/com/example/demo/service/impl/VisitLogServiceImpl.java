package com.example.demo.service.impl;

import com.example.demo.entity.VisitLog;
import com.example.demo.entity.Visitor;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository visitLogRepository;
    private final VisitorRepository visitorRepository;

    public VisitLogServiceImpl(VisitLogRepository visitLogRepository, VisitorRepository visitorRepository) {
        this.visitLogRepository = visitLogRepository;
        this.visitorRepository = visitorRepository;
    }

    @Override
    public VisitLog createVisitLog(VisitLog visitLog) {
        Long visitorId = visitLog.getVisitor().getId();
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));
        visitLog.setVisitor(visitor);
        return visitLogRepository.save(visitLog);
    }

    @Override
    public VisitLog getVisitLog(Long id) {
        return visitLogRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("VisitLog not found"));
    }

    @Override
    public List<VisitLog> getAllVisitLogs() {
        return visitLogRepository.findAll();
    }

    @Override
    public List<VisitLog> getVisitLogsForVisitor(Long visitorId) {
        return visitLogRepository.findByVisitorId(visitorId);
    }
}
