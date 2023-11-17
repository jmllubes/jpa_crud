import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Pregunta;
import model.Respuesta;
import model.Tema;
import model.TemaHasPregunta;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class main {

    public static void main( String[ ] args ) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "default" );
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        Tema tema = new Tema();
        tema.setIdtema(100);
        tema.setTema("Tema 100");
        entitymanager.persist(tema);

        Pregunta pregunta = new Pregunta();
        pregunta.setIdpregunta(100);
        pregunta.setPregunta("Pregunta 100");
        pregunta.setCorrecta(1);
        entitymanager.persist(pregunta);

        TemaHasPregunta temaHasPregunta = new TemaHasPregunta();
        temaHasPregunta.setTemaIdtema(100);
        temaHasPregunta.setPreguntaIdpregunta(100);
        entitymanager.persist(temaHasPregunta);

        Respuesta respuesta = new Respuesta();
        respuesta.setPreguntaIdpregunta(100);
        respuesta.setIdrespuesta(100);
        respuesta.setRespuesta("Respuesta 100");
        entitymanager.persist(respuesta);

        Respuesta respuesta2 = new Respuesta();
        respuesta2.setPreguntaIdpregunta(100);
        respuesta2.setIdrespuesta(101);
        respuesta2.setRespuesta("Respuesta 101");
        entitymanager.persist(respuesta2);


        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();


    }

}
