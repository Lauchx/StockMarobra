package Products.Model.Repository.JPA;

import Products.Model.Entity.Product;
import interfaces.Dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductDaoJPA implements Dao<Product> {

    private EntityManager eManager;

    public ProductDaoJPA() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        this.eManager = emf.createEntityManager();
    }

    @Override
    public void create(Product product) {
        try {
            this.eManager.getTransaction().begin();
            this.eManager.persist(product);
            this.eManager.getTransaction().commit();
        } catch (Exception e) {
            this.eManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Product product) {
        this.eManager.getTransaction().begin();
        this.eManager.remove(product);
        this.eManager.getTransaction().commit();
    }

    @Override
    public List<Product> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product getByid(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
