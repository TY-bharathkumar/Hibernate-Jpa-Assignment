package com.tyss.manytomany.practise.ManytoManyEx;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyMain {
	public static void main(String[] args) {
		EntityManagerFactory  entityfactoty;
		EntityManager entitymanager;
		EntityTransaction entitytrans;
		Books books1=new Books();
		books1.setBook_id(10);
		books1.setBooks("THEDEATH");

		Books books2=new Books();
		books2.setBook_id(20);
		books2.setBooks("MIND_IS_YOUR_OWN_BUSINESS");

		Author author1=new Author();
		author1.setAuthorId(1);
		author1.setAuthorname("Bharath");

		Author author2=new Author();
		author2.setAuthorId(2);
		author2.setAuthorname("KUMAR");

		ArrayList<Books> book=new ArrayList<Books>();
		book.add(books1);
		book.add(books2);
		ArrayList<Author> author=new ArrayList<Author>();
		author.add(author1);
		author.add(author2);

		author1.setBooks(book);
		author2.setBooks(book);

		try {
			entityfactoty =Persistence.createEntityManagerFactory("AuthorAndBooks");
			entitymanager =entityfactoty.createEntityManager();
			entitytrans =entitymanager.getTransaction();
			entitytrans.begin();
			entitymanager.persist(author1);
			entitytrans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
