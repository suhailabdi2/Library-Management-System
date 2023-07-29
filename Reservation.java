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
 * @author RichardNgabo
 */
public class Reservation {
    
 private String reservationId;
    private User user;
    private Book book;

    public Reservation(String reservationId, User user, Book book) {
        this.reservationId = reservationId;
        this.user = user;
        this.book = book;
    }

    public String getReservationId() {
        return reservationId;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }
}
