package com.example.demo.model;
@Entity
public class Visitor{
    @Id-primary key
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String idProofNumber;
    private String createdAt;
    
    public Long  getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(string fullName){
        this.fullName=fullName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String Phone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String IdProofNumber(){
        return idProofNumber;
    }
    public void setIdproofNumber(String IdProofNumber){
        this.idProofNumber=idProofNumber;
    }
    public String CreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String CreatedAt){
        this.createdAt=createdAt;
    }

}