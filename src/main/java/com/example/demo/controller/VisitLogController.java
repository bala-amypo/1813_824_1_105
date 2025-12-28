package com.example.demo.controller;

import com.example.demo.entity.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visit-logs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping
    public ResponseEntity<VisitLog> createVisitLog(@RequestBody VisitLog visitLog) {
        VisitLog createdLog = visitLogService.createVisitLog(visitLog);
        return ResponseEntity.ok(createdLog);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisitLog> getVisitLog(@PathVariable Long id) {
        VisitLog log = visitLogService.getVisitLog(id);
        return ResponseEntity.ok(log);
    }

    @GetMapping
    public ResponseEntity<List<VisitLog>> getAllVisitLogs() {
        List<VisitLog> logs = visitLogService.getAllVisitLogs();
        return ResponseEntity.ok(logs);
    }

    @GetMapping("/visitor/{visitorId}")
    public ResponseEntity<List<VisitLog>> getLogsForVisitor(@PathVariable Long visitorId) {
        List<VisitLog> logs = visitLogService.getVisitLogsForVisitor(visitorId);
        return ResponseEntity.ok(logs);
    }
}
