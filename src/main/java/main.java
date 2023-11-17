import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
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
        Query query = entitymanager.createQuery("SELECT t FROM Tema t");
        List<Tema> list = query.getResultList();
        for (Tema t : list) {
            System.out.println(t.toString());
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Tria un idtema:");
        Scanner sc = new Scanner(System.in);
        int idTema = sc.nextInt();
        Tema tema = entitymanager.find(Tema.class, idTema);
        Collection<TemaHasPregunta> temaHasPreguntas = tema.getTemaHasPreguntasByIdtema();
        for (TemaHasPregunta thp : temaHasPreguntas) {
            System.out.println(thp.getPreguntaByPreguntaIdpregunta().getPregunta());
            System.out.println("--------------------------------------------------");
            Collection<Respuesta> llr = thp.getPreguntaByPreguntaIdpregunta().getRespuestasByIdpregunta();
            for (Respuesta r : llr) {
                System.out.println(r.toString());

            }
            System.out.println("--------------------------------------------------");

        }
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();


    }

}
