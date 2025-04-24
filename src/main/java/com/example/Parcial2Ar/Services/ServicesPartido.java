package com.example.Parcial2Ar.Services;

import com.example.Parcial2Ar.Model.Partido;
import com.example.Parcial2Ar.Repository.RepositoryPartido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesPartido {

    @Autowired
    private RepositoryPartido partidoRepository;

    public Partido guardar(Partido partido) {
        return partidoRepository.save(partido);
    }

    public List<Partido> listar() {
        return partidoRepository.findAll();
    }

    public Partido actualizar(int id, Partido partido) {
        partido.setIdPartido(id);
        return partidoRepository.save(partido);
    }

    public void eliminar(int id) {
        partidoRepository.deleteById(id);
    }
}
