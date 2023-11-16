package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class RespuestaPK implements Serializable {
    @Column(name = "pregunta_idpregunta")
    @Id
    private int preguntaIdpregunta;
    @Column(name = "idrespuesta")
    @Id
    private int idrespuesta;

    public int getPreguntaIdpregunta() {
        return preguntaIdpregunta;
    }

    public void setPreguntaIdpregunta(int preguntaIdpregunta) {
        this.preguntaIdpregunta = preguntaIdpregunta;
    }

    public int getIdrespuesta() {
        return idrespuesta;
    }

    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RespuestaPK that = (RespuestaPK) o;

        if (preguntaIdpregunta != that.preguntaIdpregunta) return false;
        if (idrespuesta != that.idrespuesta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = preguntaIdpregunta;
        result = 31 * result + idrespuesta;
        return result;
    }
}
