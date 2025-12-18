package com.example.demo.repository;
import org.springframework.data.jpa.respository.JpaRepository;
import com.example.demo.model.User;
public interface Userrepository extends JpaRepository<User,Long>{

}