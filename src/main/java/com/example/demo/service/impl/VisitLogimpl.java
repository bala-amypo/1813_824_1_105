package com.example.demo.service.impl;
import com.example.demo.repository.VisitLogrepository;
import com.example.demo.model.VisitLog;
import java.util.List;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class VisitLogimpl implements VisitLogService{
    @Autowired
    VisitLogrepository obj;
    public VisitLog checkInVisitor(Long visitorId,Long hostId,String purpose){
          VisitLog log=new VisitLog();
          log.setVisitor(visitorId.toString());
          log.setHost(hostId.toString());
          log.setPurpose(purpose);
          log.setAccessGranted(true);
          return obj.save(log);
    }
    public VisitLog checkOutVisitor(Long visitLogId){
        VisitLog log=obj.findById(visitLogId).orElse(null);
        log.setCheckOutTime(LocalDateTime.now());
        return obj.save(log);
    }
    public List<VisitLog> getActiveVisits(){
        return obj.findBycheckOutTimeIsNull();
    }
    public VisitLog getVisitLog(Long id) {
    return obj.findById(id).orElse(null);
}


}