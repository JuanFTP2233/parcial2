package com.example.Parcial2Ar.Controller;

import com.example.Parcial2Ar.Model.EstadisticaJugador;
import com.example.Parcial2Ar.Services.ServicesEstadisticasJugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class ControllerEstadisticasJugador {

    @Autowired
    private ServicesEstadisticasJugador estadisticaJugadorService;

    @PostMapping("/guardar")
    public EstadisticaJugador guardar(@RequestBody EstadisticaJugador estadisticaJugador) {
        return estadisticaJugadorService.guardar(estadisticaJugador);
    }

    @GetMapping("/listar")
    public List<EstadisticaJugador> listar() {
        return estadisticaJugadorService.listar();
    }

    @PutMapping("/{id}")
    public EstadisticaJugador actualizar(@PathVariable int id, @RequestBody EstadisticaJugador estadisticaJugador) {
        return estadisticaJugadorService.actualizar(id, estadisticaJugador);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        estadisticaJugadorService.eliminar(id);
    }
}
