package com.example.Parcial2Ar.Services;

import com.example.Parcial2Ar.Model.EstadisticaJugador;
import com.example.Parcial2Ar.Repository.RepositoryEstadisticasJugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesEstadisticasJugador {

    @Autowired
    private RepositoryEstadisticasJugador estadisticaJugadorRepository;

    public EstadisticaJugador guardar(EstadisticaJugador estadistica) {
        return estadisticaJugadorRepository.save(estadistica);
    }

    public List<EstadisticaJugador> listar() {
        return estadisticaJugadorRepository.findAll();
    }

    public EstadisticaJugador actualizar(int id, EstadisticaJugador estadistica) {
        estadistica.setIdEstadistica(id);
        return estadisticaJugadorRepository.save(estadistica);
    }

    public void eliminar(int id) {
        estadisticaJugadorRepository.deleteById(id);
    }
}
