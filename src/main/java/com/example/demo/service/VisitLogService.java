package com.example.demo.service;

import com.example.demo.model.VisitLog;

public interface VisitLogService {
    VisitLog checkIn(Long visitorId, Long hostId);
    VisitLog checkOut(Long visitLogId);
}
