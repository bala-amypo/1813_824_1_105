package com.example.demo.model;
import jakarta.presistence.Entity;
import jakarta.presistence.GeneratedValue;
import jakarta.presistence.GenerationType;
import jakarta.presistence.Id;
import jakarta.presistence.constraints.NotNull;
@Entity
public class Visitor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull("This field is required")
    private String fullName;
    private String email;
    private String phone;
    @NotNull("This field is required")
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
    public Visitor(Long id,String fullname,String email,String phone,String idProofNumber,String LocalDateTime){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.phone=phone;
        this
    }
    

}