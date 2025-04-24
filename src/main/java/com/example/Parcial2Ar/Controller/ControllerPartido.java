package com.example.Parcial2Ar.Controller;



import com.example.Parcial2Ar.Model.Partido;
import com.example.Parcial2Ar.Services.ServicesPartido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class ControllerPartido {

    @Autowired
    private ServicesPartido partidoService;

    @PostMapping("/guardar")
    public Partido guardar(@RequestBody Partido partido) {
        return partidoService.guardar(partido);
    }

    @GetMapping("/listar")
    public List<Partido> listar() {
        return partidoService.listar();
    }

    @PutMapping("/{id}")
    public Partido actualizar(@PathVariable int id, @RequestBody Partido partido) {
        return partidoService.actualizar(id, partido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        partidoService.eliminar(id);
    }
}
