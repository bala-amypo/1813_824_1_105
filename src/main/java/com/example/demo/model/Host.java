package com.example.demo.model;
@Entity

public class Host{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String hostName;
    private String fullname;
    private String email;
    private String department;
    private String phone;
    private String createdAt;

    public Long getId(){
        return id;
    }
    public void setId(String id){
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
        return Department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getPhone(){
        return Phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getCreatedAt(){
        return CreatedAt;
    }
    public void setCreateAt(String CreatedAt){
        this.createdAt=createdAt;
    }
    public Host(Long id,)
}