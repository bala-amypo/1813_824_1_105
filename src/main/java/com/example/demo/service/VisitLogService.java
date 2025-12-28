package com.example.demo.service;

import com.example.demo.model.VisitLog;
import java.util.List;

public interface VisitLogService {
    VisitLog createVisitLog(VisitLog visitLog);
    VisitLog getVisitLog(Long id);
    List<VisitLog> getAllVisitLogs();
    List<VisitLog> getVisitLogsForVisitor(Long visitorId);
}
