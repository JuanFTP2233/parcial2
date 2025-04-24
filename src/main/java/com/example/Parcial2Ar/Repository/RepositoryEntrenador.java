package com.example.Parcial2Ar.Repository;

import com.example.Parcial2Ar.Model.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryEntrenador extends JpaRepository<Entrenador, Integer> {
}
