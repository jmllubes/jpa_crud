package model;

import jakarta.persistence.*;

@Entity
@Table(name = "tema_has_pregunta", schema = "preguntas_test", catalog = "")
@IdClass(TemaHasPreguntaPK.class)
public class TemaHasPregunta {
    @Id
    @Column(name = "tema_idtema")
    private int temaIdtema;
    @Id
    @Column(name = "pregunta_idpregunta")
    private int preguntaIdpregunta;
    @ManyToOne
    @JoinColumn(name = "tema_idtema", referencedColumnName = "idtema",insertable = false, updatable = false, nullable = false)
    private Tema temaByTemaIdtema;
    @ManyToOne
    @JoinColumn(name = "pregunta_idpregunta", referencedColumnName = "idpregunta",insertable = false, updatable = false, nullable = false)
    private Pregunta preguntaByPreguntaIdpregunta;

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

        TemaHasPregunta that = (TemaHasPregunta) o;

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

    public Tema getTemaByTemaIdtema() {
        return temaByTemaIdtema;
    }

    public void setTemaByTemaIdtema(Tema temaByTemaIdtema) {
        this.temaByTemaIdtema = temaByTemaIdtema;
    }

    public Pregunta getPreguntaByPreguntaIdpregunta() {
        return preguntaByPreguntaIdpregunta;
    }

    public void setPreguntaByPreguntaIdpregunta(Pregunta preguntaByPreguntaIdpregunta) {
        this.preguntaByPreguntaIdpregunta = preguntaByPreguntaIdpregunta;
    }

    @Override
    public String toString() {
        return "TemaHasPregunta{" +
                "temaIdtema=" + temaIdtema +
                ", preguntaIdpregunta=" + preguntaIdpregunta +
                '}';
    }
}
