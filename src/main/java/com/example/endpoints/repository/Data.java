package com.example.endpoints.repository;

import com.example.endpoints.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Data extends JpaRepository<Usuarios, Long> {
    List<Usuarios> findByNombre(String nombre);
}
