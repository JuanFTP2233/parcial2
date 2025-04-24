package com.example.Parcial2Ar.Repository;

import com.example.Parcial2Ar.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryJugador extends JpaRepository<Jugador, Integer> {


    @Query(value = "SELECT * FROM jugador WHERE id_equipo = ?1", nativeQuery = true)
    List<Jugador> obtenerJugadoresPorEquipo(int idEquipo);

    // Obtener los jugadores que han marcado más de X goles
    @Query(value = "SELECT * FROM jugador j JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador WHERE e.goles > ?1", nativeQuery = true)
    List<Jugador> obtenerJugadoresPorGoles(int goles);
}
