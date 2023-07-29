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

/**
 *
 * @author @SuhailAbdi
 */
public class LibraryManagementSystem {
  private Library library;
    private List<Student> students;
    private List<Reservation> reservations;

    public LibraryManagementSystem() {
        library = new Library();
        students = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addBookToLibrary(Book book) {
        library.addBook(book);
    }

    public void removeBookFromLibrary(Book book) {
        library.removeBook(book);
    }

    public List<Book> searchBooksByTitle(String title) {
        return library.searchBooksByTitle(title);
    }

    public List<Book> searchBooksByAuthor(String author) {
        return library.searchBooksByAuthor(author);
    }

    public void reserveBook(Student student, Book book) {
        if (book.getAvailableQuantity() > 0) {
            Reservation reservation = new Reservation(generateReservationId(), student, book);
            book.addReservation(reservation);
            book.decreaseAvailableQuantity();
            reservations.add(reservation);
            System.out.println("Book reserved successfully. Reservation ID: " + reservation.getReservationId());
        } else {
            System.out.println("Sorry, the book is currently not available for reservation.");
        }
    }

    public void cancelReservation(Student student, Book book) {
        Reservation reservation = findReservation(student, book);
        if (reservation != null) {
            book.removeReservation(reservation);
            book.increaseAvailableQuantity();
            reservations.remove(reservation);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("No reservation found for the given student and book.");
        }
    }

    public void displayReservations() {
        System.out.println("All Reservations:");
        for (Reservation reservation : reservations) {
            System.out.println("Reservation ID: " + reservation.getReservationId());
            System.out.println("Book: " + reservation.getBook());
            System.out.println("User: " +reservation.getUser().getUsername());
            System.out.println("----------------------");
        }
    }

    private Reservation findReservation(Student student, Book book) {
        for (Reservation reservation : reservations) {
            if (reservation.getUser().equals(student) && reservation.getBook().equals(book)) {
                return reservation;
            }
        }
        return null;
    }

    private String generateReservationId() {
        // Generate a unique reservation ID (e.g., using UUID or any other desired approach)
        return "R" + System.currentTimeMillis();
    }
}  

