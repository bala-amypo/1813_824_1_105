package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Visitor;
public interface Visitorrepository extends JpaRepository<Visitor,Long>{

}