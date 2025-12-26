package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.VisitLog;
import com.example.demo.repository.VisitLogRepository;
import java.util.List;
import java.util.Optional;
public interface VisitLogRepository {
    VisitLog save(VisitLog v);
    Optional<VisitLog> findById(Long id);
    List<VisitLog> findByCheckOutTimeIsNull();
}
