// package com.example.demo.model;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.PrePersist;
// import java.time.LocalDateTime;
// @Entity
// public class AlertNotification{
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private Long id;
//     private String visitLog;
//     private String sentTo;
//     private String alertMessage;
//     private LocalDateTime sentAt;
//     @PrePersist
//     public void prepersist(){
//         if(sentAt==null){
//             sentAt=LocalDateTime.now();
//         }
//     }

//     public Long getId(){
//         return id;
//     }
//     public void setId(Long id){
//         this.id=id;
//     }
//     public String getVisitLog(){
//         return visitLog;
//     }
//     public void setVisitLog(String visitLog){
//         this.visitLog=visitLog;
//     }
//     public String getSentTo(){
//         return sentTo;
//     }
//     public void setSentTo(String sentTo){
//         this.sentTo=sentTo;
//     }
//     public String getAlertMessage(){
//         return alertMessage;
//     }
//     public void setAlertMessage(String alertMessage){
//         this.alertMessage=alertMessage;
//     }
//     public LocalDateTime getSentAt(){
//         return sentAt;
//     }
//     public void setSentAt(LocalDateTime sentAt){
//         this.sentAt=sentAt;
//     }
//     public AlertNotification(Long id,String visitLog,String sentTo,String alertMessage,LocalDateTime sentAt){
//         this.id=id;
//         this.visitLog=visitLog;
//         this.sentTo=sentTo;
//         this.alertMessage=alertMessage;
//         this.sentAt=sentAt;
//     }
//     public AlertNotification(){

//     }
    
    
    
    




// }