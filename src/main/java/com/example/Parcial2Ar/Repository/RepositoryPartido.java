package com.example.Parcial2Ar.Repository;

import com.example.Parcial2Ar.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryPartido extends JpaRepository<Partido, Integer> {

    @Query(value = "SELECT SUM(goles_local + goles_visita) FROM partido WHERE equipo_local = ?1 OR equipo_visita = ?1", nativeQuery = true)
    int obtenerTotalGolesPorEquipo(int idEquipo);


    @Query(value = "SELECT p.fecha, p.estadio, el.nombre AS equipo_local, ev.nombre AS equipo_visita, p.goles_local, p.goles_visita " +
            "FROM partido p " +
            "JOIN equipo el ON p.equipo_local = el.id_equipo " +
            "JOIN equipo ev ON p.equipo_visita = ev.id_equipo", nativeQuery = true)
    List<Object[]> obtenerResultadosPartidos();
}
