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
    public void setVisitor(String fullName){
        this.fullName=fullName;

}