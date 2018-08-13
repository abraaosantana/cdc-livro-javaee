package org.casadocodigo.javaee.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.casadocodigo.javaee.models.Book;

public class BookDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Book book) {
		manager.persist(book);
	}

}
