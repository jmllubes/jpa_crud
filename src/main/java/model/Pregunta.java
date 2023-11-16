package model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Pregunta {
    @Id
    @Column(name = "idpregunta")
    private int idpregunta;
    @Basic
    @Column(name = "pregunta")
    private String pregunta;
    @Basic
    @Column(name = "correcta")
    private Integer correcta;
    @OneToMany(mappedBy = "preguntaByPreguntaIdpregunta")
    private Collection<Respuesta> respuestasByIdpregunta;
    @OneToMany(mappedBy = "preguntaByPreguntaIdpregunta")
    private Collection<TemaHasPregunta> temaHasPreguntasByIdpregunta;

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getCorrecta() {
        return correcta;
    }

    public void setCorrecta(Integer correcta) {
        this.correcta = correcta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pregunta pregunta1 = (Pregunta) o;

        if (idpregunta != pregunta1.idpregunta) return false;
        if (pregunta != null ? !pregunta.equals(pregunta1.pregunta) : pregunta1.pregunta != null) return false;
        if (correcta != null ? !correcta.equals(pregunta1.correcta) : pregunta1.correcta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpregunta;
        result = 31 * result + (pregunta != null ? pregunta.hashCode() : 0);
        result = 31 * result + (correcta != null ? correcta.hashCode() : 0);
        return result;
    }

    public Collection<Respuesta> getRespuestasByIdpregunta() {
        return respuestasByIdpregunta;
    }

    public void setRespuestasByIdpregunta(Collection<Respuesta> respuestasByIdpregunta) {
        this.respuestasByIdpregunta = respuestasByIdpregunta;
    }

    public Collection<TemaHasPregunta> getTemaHasPreguntasByIdpregunta() {
        return temaHasPreguntasByIdpregunta;
    }

    public void setTemaHasPreguntasByIdpregunta(Collection<TemaHasPregunta> temaHasPreguntasByIdpregunta) {
        this.temaHasPreguntasByIdpregunta = temaHasPreguntasByIdpregunta;
    }
}
