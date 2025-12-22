// package com.example.demo.controller;
// import com.example.demo.model.VisitLog;
// import com.example.demo.service.VisitLogService;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.beans.factory.annotation.Autowired;
// import java.util.List;
// @RestController
// @RequestMapping("/api/Visits")
// public class VisitLogController{
//     @Autowired
//     VisitLogService obj;
//     @PostMapping("/checkin/{visitorId}/{hostId}")
//     public VisitLog hello(@PathVariable Long visitorId,@PathVariable Long hostId,@RequestParam String purpose){
//      return obj.checkInVisitor(visitorId,hostId,purpose);
//     }
//     @PostMapping("/checkout/{visitLogId}")
//     public VisitLog checkOutVisitor(@PathVariable Long visitLogId){
//     return obj.checkOutVisitor(visitLogId);
//     }
//     @GetMapping("/active")
//     public List<VisitLog> hello1(){
//         return obj.getActiveVisits();
//     }
    
//     @GetMapping("/{id}")
//     public VisitLog Appointg(@PathVariable Long id){
//         return obj.getVisitLog(id);
//     }
// }