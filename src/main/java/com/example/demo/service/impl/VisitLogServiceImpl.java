package com.example.demo.service.impl;

import com.example.demo.model.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import com.example.demo.service.VisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    @Autowired
    private VisitLogRepository visitLogRepository;

    @Override
    public List<VisitLog> findByVisitorId(Long visitorId) {
        return visitLogRepository.findByVisitorId(visitorId);
    }
}
