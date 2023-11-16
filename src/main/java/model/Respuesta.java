package model;

import jakarta.persistence.*;

@Entity
@IdClass(RespuestaPK.class)
public class Respuesta {
    @Id
    @Column(name = "pregunta_idpregunta")
    private int preguntaIdpregunta;
    @Id
    @Column(name = "idrespuesta")
    private int idrespuesta;
    @Basic
    @Column(name = "respuesta")
    private String respuesta;
    @ManyToOne
    @JoinColumn(name = "pregunta_idpregunta", referencedColumnName = "idpregunta", nullable = false, insertable = false, updatable = false)
    private Pregunta preguntaByPreguntaIdpregunta;

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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Respuesta respuesta1 = (Respuesta) o;

        if (preguntaIdpregunta != respuesta1.preguntaIdpregunta) return false;
        if (idrespuesta != respuesta1.idrespuesta) return false;
        if (respuesta != null ? !respuesta.equals(respuesta1.respuesta) : respuesta1.respuesta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = preguntaIdpregunta;
        result = 31 * result + idrespuesta;
        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
        return result;
    }

    public Pregunta getPreguntaByPreguntaIdpregunta() {
        return preguntaByPreguntaIdpregunta;
    }

    public void setPreguntaByPreguntaIdpregunta(Pregunta preguntaByPreguntaIdpregunta) {
        this.preguntaByPreguntaIdpregunta = preguntaByPreguntaIdpregunta;
    }
}
