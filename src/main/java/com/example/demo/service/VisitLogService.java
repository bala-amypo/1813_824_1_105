package com.example.demo.service;

import com.example.demo.model.VisitLog;
import java.util.List;

public interface VisitLogService {
    VisitLog checkInVisitor(Long vId, Long hId, String purpose);
    VisitLog checkOutVisitor(Long id);
    List<VisitLog> getActiveVisits();
    VisitLog getVisitLog(Long id);
}
