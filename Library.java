/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Issene Halake
 */
public class Library {
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookCode(), book);
    }

    public void removeBook(Book book) {
        books.remove(book.getBookCode());
    }

    public Book getBookByCode(String bookCode) {
        return books.get(bookCode);
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }
}
