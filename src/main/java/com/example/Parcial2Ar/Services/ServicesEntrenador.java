package com.example.Parcial2Ar.Services;

import com.example.Parcial2Ar.Model.Entrenador;
import com.example.Parcial2Ar.Repository.RepositoryEntrenador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesEntrenador {

    @Autowired
    private RepositoryEntrenador entrenadorRepository;

    public Entrenador guardar(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public List<Entrenador> listar() {
        return entrenadorRepository.findAll();
    }

    public Entrenador actualizar(int id, Entrenador entrenador) {
        entrenador.setIdEntrenador(id);
        return entrenadorRepository.save(entrenador);
    }

    public void eliminar(int id) {
        entrenadorRepository.deleteById(id);
    }
}
