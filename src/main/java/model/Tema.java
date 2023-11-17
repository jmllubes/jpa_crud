package model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Tema {
    @Id
    @Column(name = "idtema")
    private int idtema;
    @Basic
    @Column(name = "tema")
    private String tema;
    @OneToMany(mappedBy = "temaByTemaIdtema")
    private Collection<TemaHasPregunta> temaHasPreguntasByIdtema;

    public int getIdtema() {
        return idtema;
    }

    public void setIdtema(int idtema) {
        this.idtema = idtema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tema tema1 = (Tema) o;

        if (idtema != tema1.idtema) return false;
        if (tema != null ? !tema.equals(tema1.tema) : tema1.tema != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtema;
        result = 31 * result + (tema != null ? tema.hashCode() : 0);
        return result;
    }

    public Collection<TemaHasPregunta> getTemaHasPreguntasByIdtema() {
        return temaHasPreguntasByIdtema;
    }

    public void setTemaHasPreguntasByIdtema(Collection<TemaHasPregunta> temaHasPreguntasByIdtema) {
        this.temaHasPreguntasByIdtema = temaHasPreguntasByIdtema;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "idtema=" + idtema +
                ", tema='" + tema + '\'' +
                '}';
    }
}
