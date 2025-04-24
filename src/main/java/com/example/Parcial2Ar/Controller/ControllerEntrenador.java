package com.example.Parcial2Ar.Controller;

import com.example.Parcial2Ar.Model.Entrenador;
import com.example.Parcial2Ar.Services.ServicesEntrenador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class ControllerEntrenador {

    @Autowired
    private ServicesEntrenador entrenadorService;

    @PostMapping("/guardar")
    public Entrenador guardar(@RequestBody Entrenador entrenador) {
        return entrenadorService.guardar(entrenador);
    }

    @GetMapping("/listar")
    public List<Entrenador> listar() {
        return entrenadorService.listar();
    }

    @PutMapping("/{id}")
    public Entrenador actualizar(@PathVariable int id, @RequestBody Entrenador entrenador) {
        return entrenadorService.actualizar(id, entrenador);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        entrenadorService.eliminar(id);
    }
}
