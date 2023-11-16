package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class TemaHasPreguntaPK implements Serializable {
    @Column(name = "tema_idtema")
    @Id
    private int temaIdtema;
    @Column(name = "pregunta_idpregunta")
    @Id
    private int preguntaIdpregunta;

    public int getTemaIdtema() {
        return temaIdtema;
    }

    public void setTemaIdtema(int temaIdtema) {
        this.temaIdtema = temaIdtema;
    }

    public int getPreguntaIdpregunta() {
        return preguntaIdpregunta;
    }

    public void setPreguntaIdpregunta(int preguntaIdpregunta) {
        this.preguntaIdpregunta = preguntaIdpregunta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TemaHasPreguntaPK that = (TemaHasPreguntaPK) o;

        if (temaIdtema != that.temaIdtema) return false;
        if (preguntaIdpregunta != that.preguntaIdpregunta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = temaIdtema;
        result = 31 * result + preguntaIdpregunta;
        return result;
    }
}
