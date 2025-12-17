package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.column;
import jakarta.validation.constraints.NotNull;


@Entity
public class Host{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String createdAt;
    @NotNull(message="This field is required")
    private String hostName;
    @NotNull(message="This field is required")
    private String department;
    @NotNull(message="This field is required")
    private String phone;
    
    @Column(unique=true)
    private String email;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getHostName(){
        return hostName;
    }
    public void setHostName(String hostName){
        this.hostName=hostName;
    }
    public String getFullName(){
        return fullname;
    }
    public void setFullName(String fullName){
        this.fullname=fullname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String CreatedAt){
        this.createdAt=createdAt;
    }
    public Host(Long id,String fullName,String email,String phone,String idProofNumber,String createdAt){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.phone=phone;
        this.idProofNumber=idProofNumber;
        this.createdAt=createdAt;
    }
    public Host(){

    }
    Host obj=new Host();
}