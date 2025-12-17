package com.example.demo.model;
@Entity
public class Visitor{
    @Id
    @GeneratedValue=
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
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getIdProofNumber(){
        return idProofNumber;
    }
    public void setIdproofNumber(String idProofNumber){
        this.idProofNumber=idProofNumber;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
    

}