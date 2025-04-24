package com.example.Parcial2Ar.Repository;


import com.example.Parcial2Ar.Model.EstadisticaJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryEstadisticasJugador  extends JpaRepository<EstadisticaJugador, Integer> {
}
