package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	public EntityManager getEntityManager()
	{
	    entityManagerFactory = Persistence.createEntityManagerFactory("dev"); 
	    entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public void save(StudentRecord record)
	{
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(record);
		entityTransaction.commit();
	}
	public StudentRecord findByID(int id)
	{
		entityManager = getEntityManager();
		StudentRecord record = entityManager.find(StudentRecord.class, id);
		return record;
	}
	public List<StudentRecord> find()
	{
		Query query = entityManager.createQuery("select c from StudentRecord c");
		List<StudentRecord> l = query.getResultList();
		return l;
	}
	public void deleteById(int id)
	{
		StudentRecord person = entityManager.find(StudentRecord.class, id);
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
	}
}
