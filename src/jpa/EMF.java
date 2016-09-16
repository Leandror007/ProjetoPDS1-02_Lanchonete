package jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("Lanchonete");
	
	public static EntityManagerFactory get() {
		return emf;
	}
}
