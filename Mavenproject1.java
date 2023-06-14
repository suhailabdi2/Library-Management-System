/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author suhail
 */
import java.util.ArrayList;
import java.util.List;
public class Mavenproject1 {
 
public class Librarian {
    private List<Book> books;
    private List<Member> members;
    private List<Reservation> reservations;

    public Librarian() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void acceptReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Other methods and business logic can be added here
}


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
