package com.example.Parcial2Ar.Services;

import com.example.Parcial2Ar.Model.Jugador;
import com.example.Parcial2Ar.Repository.RepositoryJugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesJugador {

    @Autowired
    private RepositoryJugador jugadorRepository;

    public Jugador guardar(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public List<Jugador> listar() {
        return jugadorRepository.findAll();
    }

    public Jugador actualizar(int id, Jugador jugador) {
        jugador.setIdJugador(id);
        return jugadorRepository.save(jugador);
    }

    public void eliminar(int id) {
        jugadorRepository.deleteById(id);
    }
}
