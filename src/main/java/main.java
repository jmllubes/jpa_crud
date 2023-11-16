import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Tema;


public class main {

    public static void main( String[ ] args ) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "default" );
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        Tema t = new Tema();
        t.setIdtema(99);
        t.setTema("JPA");
        entitymanager.persist(t);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();


    }

}
