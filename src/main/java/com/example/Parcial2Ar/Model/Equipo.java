package com.example.Parcial2Ar.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipo;

    private String nombre;
    private String ciudad;
    private LocalDate fundacion;

    @OneToMany(mappedBy = "equipo")
    private List<Jugador> jugadores;

    @OneToMany(mappedBy = "equipo")
    private List<Entrenador> entrenadores;

    @OneToMany(mappedBy = "equipoLocal")
    private List<Partido> partidosComoLocal;

    @OneToMany(mappedBy = "equipoVisita")
    private List<Partido> partidosComoVisitante;

    public Equipo() {
    }

    public Equipo(String ciudad, int idEquipo, String nombre, LocalDate fundacion, List<Jugador> jugadores, List<Entrenador> entrenadores, List<Partido> partidosComoLocal, List<Partido> partidosComoVisitante) {
        this.ciudad = ciudad;
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.fundacion = fundacion;
        this.jugadores = jugadores;
        this.entrenadores = entrenadores;
        this.partidosComoLocal = partidosComoLocal;
        this.partidosComoVisitante = partidosComoVisitante;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public List<Partido> getPartidosComoLocal() {
        return partidosComoLocal;
    }

    public void setPartidosComoLocal(List<Partido> partidosComoLocal) {
        this.partidosComoLocal = partidosComoLocal;
    }

    public List<Partido> getPartidosComoVisitante() {
        return partidosComoVisitante;
    }

    public void setPartidosComoVisitante(List<Partido> partidosComoVisitante) {
        this.partidosComoVisitante = partidosComoVisitante;
    }
}