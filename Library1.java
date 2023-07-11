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

/*
 *
 * @author Issene Halake
 */
public class Library1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           // Create a library management system
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();

        // Create and add books to the library
        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", 5);
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee", 3);
        librarySystem.addBookToLibrary(book1);
        librarySystem.addBookToLibrary(book2);

        // Create and add students to the library system
        Student student1 = new Student("student1", "password1", "S001","APPLIED COMPUTER TECHNOLOGY");
        Student student2 = new Student("student2", "password2", "S002","INTERNATIONAL RELATION");
        librarySystem.addStudent(student1);
        librarySystem.addStudent(student2);
        
        
      
       
        
        admin a1 = new admin("admin1", "password1", "S001");
        
      

        // Search books by title and author
        List<Book> searchResultsByTitle = librarySystem.searchBooksByTitle("The Great Gatsby");
        List<Book> searchResultsByAuthor = librarySystem.searchBooksByAuthor("Harper Lee");

        // Display search results
        System.out.println("Search Results by Title:");
        for (Book book : searchResultsByTitle) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Search Results by Author:");
        for (Book book : searchResultsByAuthor) {
            System.out.println(book);
        }
        System.out.println();

        // Reserve a book for a student
        librarySystem.reserveBook(student1, book1);
        librarySystem.reserveBook(student2, book1);

        // Display all reservations
        librarySystem.displayReservations();

        // Cancel a reservation
        librarySystem.cancelReservation(student1, book1);

        // Display all reservations after cancellation
        librarySystem.displayReservations();
    }
    }
    

