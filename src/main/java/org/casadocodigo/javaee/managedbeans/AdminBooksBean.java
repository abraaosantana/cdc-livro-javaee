package org.casadocodigo.javaee.managedbeans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.casadocodigo.javaee.daos.BookDAO;
import org.casadocodigo.javaee.models.Book;

@Model
public class AdminBooksBean {
	
	private Book book = new Book();
	@Inject
	private BookDAO bookDAO = new BookDAO();
	
	@Transactional
	public String save() {
		bookDAO.save(book);
		System.out.println(book);
		
		return toString();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
