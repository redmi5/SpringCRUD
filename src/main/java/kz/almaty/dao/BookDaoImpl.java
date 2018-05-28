package kz.almaty.dao;

import kz.almaty.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookDaoImpl implements BookDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    public void addBook(Book book) {
        Session session=this.sessionFactory.getCurrentSession();
        session.persist(book);
        System.out.println("book successfully saved. Book details: "+book);
    }

    public void updateBook(Book book) {
        Session session=this.sessionFactory.getCurrentSession();
        session.update(book);
        System.out.println("book successfully updated. Book details: "+book);
    }

    public void removeBook(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        Book book=(Book) session.load(Book.class, new Integer(id));
        if(book!=null){
            session.delete(book);
        }
        System.out.println("book successfully deleted. Book details: "+book);

    }

    public Book getbookById(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        return null;
    }

    public List<Book> listBook() {
        return null;
    }
}
