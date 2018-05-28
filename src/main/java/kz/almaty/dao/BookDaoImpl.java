package kz.almaty.dao;


import kz.almaty.model.Book;
import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BookDaoImpl implements BookDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(book);
        System.out.println("book successfully saved. Book details: " + book);

    }

    public void updateBook(Book book) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(book);
        System.out.println("book successfully updated. Book details: " + book);
    }

    public void removeBook(int id) {

        Session session = this.sessionFactory.getCurrentSession();
        Book book = (Book) session.load(Book.class, new Integer(id));
        if (book != null) {
            session.delete(book);
        }
        System.out.println("book successfully deleted. Book details: " + book);


    }

    public Book getBookById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = (Book) session.load(Book.class, new Integer(id));
        System.out.println("book successfully loaded. Book details: " + book);
        return book;
    }

    public List<Book> listBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Book> bookList = session.createQuery("from book").list();
        for (Book book : bookList) {
            System.out.println("Book list " + book);
        }
        return bookList;
    }
}
