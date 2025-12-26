package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Visitor;
import com.example.demo.repository.VisitorRepository;
import java.util.Optional;
import java.util.List;

public interface VisitorRepository {
    Visitor save(Visitor v);
    Optional<Visitor> findById(Long id);
    List<Visitor> findAll();
}
