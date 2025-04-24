package com.example.Parcial2Ar.Controller;

import com.example.Parcial2Ar.Model.Equipo;
import com.example.Parcial2Ar.Services.ServicesEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class ControllerEquipo {

    @Autowired
    private ServicesEquipo equipoService;

    @PostMapping("/guardar")
    public Equipo guardar(@RequestBody Equipo equipo) {
        return equipoService.guardar(equipo);
    }

    @GetMapping("/listar")
    public List<Equipo> listar() {
        return equipoService.listar();
    }

    @PutMapping("/{id}")
    public Equipo actualizar(@PathVariable int id, @RequestBody Equipo equipo) {
        return equipoService.actualizar(id, equipo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        equipoService.eliminar(id);
    }
}
