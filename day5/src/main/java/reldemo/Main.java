package reldemo;

import jakarta.persistence.EntityManager;



class Main{
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		Author author=new Author("George Orwell");
		Book book1=new Book("Down and Out in Paris and London");
		Book book2=new Book("The Road to Wigan Pier");
		author.addBook(book1);
		author.addBook(book2);
		em.persist(author);
		em.getTransaction().commit();
		em.close();
		JPAUtil.close();
	}
}