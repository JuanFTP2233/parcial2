package com.example.Parcial2Ar.Repository;

import com.example.Parcial2Ar.Model.Equipo;
import com.example.Parcial2Ar.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryEquipo extends JpaRepository<Equipo, Integer> {


    @Query(value = "SELECT * FROM jugador WHERE id_equipo = ?1", nativeQuery = true)
    List<Jugador> obtenerJugadoresPorEquipo(int idEquipo);
}
