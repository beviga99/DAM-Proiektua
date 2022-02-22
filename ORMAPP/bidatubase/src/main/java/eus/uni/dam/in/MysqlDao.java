package eus.uni.dam.in;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MysqlDao {

    // A través de la anotación @PersistenceContext, se inyectará automáticamente
    // un EntityManager producido desde el entityManagerFactory definido en la clase
    // DatabaseConfig.
    @PersistenceContext
    private EntityManager entityManager;


    @SuppressWarnings("unchecked")
    public List<Departamento> getAllDpto() {
    	return entityManager.createQuery("from Departamento").getResultList();
    }
    @SuppressWarnings("unchecked")
    public List<Estado> getAllEstado() {
    	return entityManager.createQuery("from Estado").getResultList();
    }
    @SuppressWarnings("unchecked")
    public List<Incidencia> getAllIncidencia() {
    	return entityManager.createQuery("from Incidencia").getResultList();
    }
    @SuppressWarnings("unchecked")
    public List<Login> getAllPertsona() {
    	return entityManager.createQuery("from Login").getResultList();
    }

    
}