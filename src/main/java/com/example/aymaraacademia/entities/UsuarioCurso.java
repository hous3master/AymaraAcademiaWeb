package com.example.aymaraacademia.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UsuarioCurso")
public class UsuarioCurso {
    @EmbeddedId
    UsuarioCursoKey id;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(name = "usuario_id")
    Usuario usuario;

    @ManyToOne
    @MapsId("cursoId")
    @JoinColumn(name = "curso_id")
    Curso curso;

    public UsuarioCurso(){
    }

    public UsuarioCurso(UsuarioCursoKey id, Usuario usuario, Curso curso) {
        this.id = id;
        this.usuario = usuario;
        this.curso = curso;
    }

    public UsuarioCursoKey getId() {
        return id;
    }

    public void setId(UsuarioCursoKey id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

@Embeddable
class UsuarioCursoKey implements Serializable {

    @Column (name = "curso_id")
    int cursoId;

    @Column (name = "usuario_id")
    int usuarioId;

    public UsuarioCursoKey(){
    }
    public UsuarioCursoKey(int cursoId, int usuarioId) {
        this.cursoId = cursoId;
        this.usuarioId = usuarioId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}


