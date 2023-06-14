/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.library;

/**
 *
 * @author ngari
 */

public class Library {
    public static void main(String[] args) {
        Reservation reserve1 = new Reservation(1, 1001, "Book1");
        Reservation reserve2 = new Reservation(2, 1002, "Book2");

        reserve1.setUserId(3);
        reserve2.setBookCode("Book3");

        System.out.println("Reservation1:");
        System.out.println("User Id: " + reserve1.getUserId());
        System.out.println("Reserve Id: " + reserve1.getReservationId());
        System.out.println("Book Code: " + reserve1.getBookCode());
    }
}

class Reservation {
    private int reserveId;
    private String bookCode;
    private int userId;

    public Reservation(int userId, int reservationId, String bookCode) {
        this.userId = userId;
        this.reserveId = reservationId;
        this.bookCode = bookCode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReservationId() {
        return reserveId;
    }

    public void setReservationId(int reservationId) {
        this.reserveId = reservationId;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
}
