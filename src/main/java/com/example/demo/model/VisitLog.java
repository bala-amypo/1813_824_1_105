package com.example.demo.model;
public class VisitLog{
    private Long id;
    private String visitor;
    private String host;
    private String checkInTime;
    private String checkOutTime;
    private String purpose;
    private Boolean accessGranted;
    private Boolean alertSent;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVisitor(){
        return visitor;
    }
    public void setVisitor(String visitor){
        this.visitor=visitor;
    }
    public String getHost(){
        return host;
    }
    public void setHost(String host){
        this.host=host;
    }
    public String getCheckInTime(){
        return checkInTime;
    }
    public void setCheckInTime(String checkInTime){
        this.checkInTime=checInTime;
    }
    public String getCheckOutTime(){
        return checkOutTime;
    }
    public void setCheckOutTime(String fullName){
        this.checkOutTime=checkOutTime;
    }
    public String getPurpose(){
        return purpose;
    }
    public void setPurpose(String purpose){
        this.purpose=purpose;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;

}