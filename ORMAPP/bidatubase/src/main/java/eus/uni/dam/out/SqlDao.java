package eus.uni.dam.out;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional  
public class SqlDao {
	
    @PersistenceContext
    private EntityManager entityManager;
	
	public void createDp(Departamentua p) {
        entityManager.persist(p);
        return;
    }

    public void deleteDp(Departamentua p) {
        if (entityManager.contains(p))
            entityManager.remove(p);
        else
            entityManager.remove(entityManager.merge(p));
        return;
    }

    @SuppressWarnings("unchecked")
    public List<Departamentua> getAllDepartamentuak() {
    	return entityManager.createQuery("from Produktoak").getResultList();
    }

    public Departamentua getByIdDpd(int id) {
        return entityManager.find(Departamentua.class, id);
    }

    public void updateDp(Departamentua p) {
        entityManager.merge(p);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<Egoera> getAllEgoerak() {
    	return entityManager.createQuery("from Egoera").getResultList();
    }

    public Egoera getByIdEgo(int id) {
        return entityManager.find(Egoera.class, id);
    }

    public void updateEgo(Egoera b) {
        entityManager.merge(b);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<Erabiltzailea> getAllErabiltzaileak() {
    	return entityManager.createQuery("from Erabiltzailea").getResultList();
    }

    public Erabiltzailea getByIdER(int id) {
        return entityManager.find(Erabiltzailea.class, id);
    }

    public void updateEr(Erabiltzailea b) {
        entityManager.merge(b);
        return;
    }
    
    @SuppressWarnings("unchecked")
    public List<Intzidentzia> getAllIntzidentzia() {
    	return entityManager.createQuery("from Intzidentzia").getResultList();
    }

    public Intzidentzia getByIdIz(int id) {
        return entityManager.find(Intzidentzia.class, id);
    }

    public void updateIz(Intzidentzia b) {
        entityManager.merge(b);
        return;
    }
}