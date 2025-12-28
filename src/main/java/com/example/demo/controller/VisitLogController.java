package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/visitlogs")
public class VisitLogController {

    @Autowired
    private VisitLogService visitLogService;

    @PostMapping("/checkin/visitorId/hostId")
    public VisitLog checkInVisitor(@PathVariable Long visitorId, @PathVariable Long hostId,
                                   @RequestParam String purpose) {
        return visitLogService.checkInVisitor(visitorId, hostId, purpose);
    }

    @PostMapping("/checkout/visitLogId")
    public VisitLog checkOutVisitor(@PathVariable Long visitLogId) {
        return visitLogService.checkOutVisitor(visitLogId);
    }

    @GetMapping("/id")
    public VisitLog getVisitLog(@PathVariable Long id) {
        return visitLogService.getVisitLog(id);
    }

    @GetMapping("/active")
    public List<VisitLog> getActiveVisits() {
        return visitLogService.getActiveVisits();
    }
}
