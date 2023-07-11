/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Issene Halake
 */
public class Book {
     private String bookCode;
    private String title;
    private String author;
    private int quantity;
    private int availableQuantity;
    private List<Reservation> reservations;

    public Book(String bookCode, String title, String author, int quantity) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.availableQuantity = quantity;
        this.reservations = new ArrayList<>();
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public void decreaseAvailableQuantity() {
        availableQuantity--;
    }

    public void increaseAvailableQuantity() {
        availableQuantity++;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " [Code: " + bookCode + "]";
    }
}

