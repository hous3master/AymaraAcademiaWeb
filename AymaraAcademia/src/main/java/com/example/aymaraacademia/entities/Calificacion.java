package com.example.aymaraacademia.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Calificacion")
public class Calificacion {
    @Column (name = "Acumulado", columnDefinition = "DECIMAL (10,2)")
    private BigDecimal Acumulado;
    @Column(name = "Contador", nullable = false)
    private int Contador;

    @EmbeddedId
    CalificacionKey id;

    @ManyToOne
    @MapsId ("usuarioId")
    @JoinColumn (name = "usuario_id")
    Usuario usuario;

    @ManyToOne
    @MapsId ("proyectoId")
    @JoinColumn (name = "proyecto_id")
    Proyecto proyecto;

    public Calificacion() {
    }

    public Calificacion(BigDecimal acumulado, int contador, CalificacionKey id, Usuario usuario, Proyecto proyecto) {
        Acumulado = acumulado;
        Contador = contador;
        this.id = id;
        this.usuario = usuario;
        this.proyecto = proyecto;
    }

    public BigDecimal getAcumulado() {
        return Acumulado;
    }

    public void setAcumulado(BigDecimal acumulado) {
        Acumulado = acumulado;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int contador) {
        Contador = contador;
    }

    public CalificacionKey getId() {
        return id;
    }

    public void setId(CalificacionKey id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
@Embeddable
class CalificacionKey implements Serializable {

    @Column (name = "proyecto_id")
    int proyectoId;

    @Column (name = "usuario_id")
    int usuarioId;

    public CalificacionKey(){
    }
    public CalificacionKey(int proyectoId, int usuarioId) {
        this.proyectoId = proyectoId;
        this.usuarioId = usuarioId;
    }

    public int getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(int proyectoId) {
        this.proyectoId = proyectoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}

