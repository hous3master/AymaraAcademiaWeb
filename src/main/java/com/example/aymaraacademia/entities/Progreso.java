package com.example.aymaraacademia.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Progreso")
public class Progreso {
    @EmbeddedId
    private GroupAssociationKey id;
    @OneToOne
    @MapsId ("usuario_id")
    @JoinColumn (name = "usuario_id", referencedColumnName = "usuario_id")
    private Usuario usuario;

    @OneToOne
    @MapsId ("modulo_id")
    @JoinColumn (name = "modulo_id", referencedColumnName = "modulo_id")
    private Modulo modulo;

    @Column (name = "Progreso", columnDefinition = "DECIMAL (10,2)")
    private BigDecimal progreso;

    @Embeddable
    public static class GroupAssociationKey implements Serializable {
        private int usuario_id;
        private int modulo_id;
    }
    public Progreso(){
    }

    public Progreso(GroupAssociationKey id, Usuario usuario, Modulo modulo, BigDecimal progreso) {
        this.id = id;
        this.usuario = usuario;
        this.modulo = modulo;
        this.progreso = progreso;
    }

    public GroupAssociationKey getId() {
        return id;
    }

    public void setId(GroupAssociationKey id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public BigDecimal getProgreso() {
        return progreso;
    }

    public void setProgreso(BigDecimal progreso) {
        this.progreso = progreso;
    }
}
