package it.uniroma3.db.products;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();

		Product product = new Product();
		product.setName("CASCa");
		product.setPrice(3.5F);
		product.setDescription("A wonderful bla bla");
		product.setCode("9781853262715-AA");

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(product);
		tx.commit();

		em.close();
		emf.close();
	}
}
