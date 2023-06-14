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
    public class Reservation {
        private int reserveId;
        private String bookCode;
        private int userId;
        
        public Reservation(int userId, int reservationId, String bookCode) {
            this.userId= userId;
            this.reservationId=reservationId;
            this.bookCode= bookCode;
        }
        public int getUserId() {
            return userId;
        }
        public void setUserId(int userId) {
            this.userId= userId;
        }
        public int getReservationId(int reservationId) {
            this.reservationId= reservationId;
        }
        public void setReservationId(int reservationId) {
            this.reservationId= reservationId;
        }
        public String getBookCode() {
            return bookCode;
        }
        public void setBookCode(String bookCode) {
            this.bookCode = bookCode;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
