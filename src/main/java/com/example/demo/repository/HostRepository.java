package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.repository.HostRepository;
import com.example.demo.model.Host;
import java.util.Optional;
public interface HostRepository {
    Host save(Host h);
    Optional<Host> findById(Long id);
    Optional<Host> findByEmail(String email);
}
