package almaty.dao;

import almaty.model.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getbookById(int id);
    public List<Book> listBook();
}
