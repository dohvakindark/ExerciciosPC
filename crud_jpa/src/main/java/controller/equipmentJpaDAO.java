package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.equipment;

public class equipmentJpaDAO {
	private static equipmentJpaDAO instance;
	protected EntityManager entityManager;
	
	public static equipmentJpaDAO getInstance() {
		
		if (instance == null){
            instance = new equipmentJpaDAO();
   }
		return instance;
		
	}
	private equipmentJpaDAO() {
        entityManager = getEntityManager();
	}
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
                 entityManager = factory.createEntityManager();
        }

        return entityManager;
	}
	public equipment getById(final int id) {
        return entityManager.find(equipment.class, id);
	}
	@SuppressWarnings("unchecked")
    public List<equipment> findAll() {
              return entityManager.createQuery("FROM " + equipment.class.getName()).getResultList();
    }
    public void persist(equipment Equipment) {
        try {
                 entityManager.getTransaction().begin();
                 entityManager.persist(Equipment);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
    }
    public void merge(equipment Equipment) {
        try {
                 entityManager.getTransaction().begin();
                 entityManager.merge(Equipment);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
    }
    public void remove(equipment Equipment) {
        try {
                 entityManager.getTransaction().begin();
                 Equipment = entityManager.find(equipment.class, Equipment.getId());
                 entityManager.remove(Equipment);
                 entityManager.getTransaction().commit();
        } catch (Exception ex) {
                 ex.printStackTrace();
                 entityManager.getTransaction().rollback();
        }
    }
    public void removeById(final int id) {
        try {
                 equipment Equipment = getById(id);
                 remove(Equipment);
        } catch (Exception ex) {
                 ex.printStackTrace();
        }
    }

}
