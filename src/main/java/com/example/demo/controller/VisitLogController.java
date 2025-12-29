package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitlogs")
public class VisitLogController {

    private VisitLogService visitLogService;

    public VisitLogController(VisitLogService service) {
        this.visitLogService = service;
    }

    @PostMapping("/checkin/{vId}/{hId}")
    public VisitLog checkIn(@PathVariable Long vId,
                            @PathVariable Long hId,
                            @RequestParam String purpose) {
        return visitLogService.checkInVisitor(vId, hId, purpose);
    }

    @PostMapping("/checkout/{id}")
    public VisitLog checkOut(@PathVariable Long id) {
        return visitLogService.checkOutVisitor(id);
    }

    @GetMapping("/active")
    public List<VisitLog> getActive() {
        return visitLogService.getActiveVisits();
    }

    @GetMapping("/{id}")
    public VisitLog getVisitLog(@PathVariable Long id) {
        return visitLogService.getVisitLog(id);
    }
}
