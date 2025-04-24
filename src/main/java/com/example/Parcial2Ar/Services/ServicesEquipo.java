package com.example.Parcial2Ar.Services;

import com.example.Parcial2Ar.Model.Equipo;
import com.example.Parcial2Ar.Repository.RepositoryEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesEquipo {

    @Autowired
    private RepositoryEquipo equipoRepository;

    public Equipo guardar(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public List<Equipo> listar() {
        return equipoRepository.findAll();
    }

    public Equipo actualizar(int id, Equipo equipo) {
        equipo.setIdEquipo(id);
        return equipoRepository.save(equipo);
    }

    public void eliminar(int id) {
        equipoRepository.deleteById(id);
    }
}
