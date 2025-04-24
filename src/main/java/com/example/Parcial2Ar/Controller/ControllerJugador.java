package com.example.Parcial2Ar.Controller;

import com.example.Parcial2Ar.Model.Jugador;
import com.example.Parcial2Ar.Services.ServicesJugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class ControllerJugador {

    @Autowired
    private ServicesJugador jugadorService;

    @PostMapping("/guardar")
    public Jugador guardar(@RequestBody Jugador jugador) {
        return jugadorService.guardar(jugador);
    }

    @GetMapping("/listar")
    public List<Jugador> listar() {
        return jugadorService.listar();
    }

    @PutMapping("/{id}")
    public Jugador actualizar(@PathVariable int id, @RequestBody Jugador jugador) {
        return jugadorService.actualizar(id, jugador);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        jugadorService.eliminar(id);
    }
}
