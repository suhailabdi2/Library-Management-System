/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;


import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Issene Halake
 */
public class Book {
 private String Bname;
   private String Bauthor;
   private int Bcode;
   private String Bstatus;
  Book(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Books's name");
    Bname =s.next();
    System.out.println("Enter Books's code");
    Bcode =s.nextInt();
    System.out.println("Enter Books's Author");
    Bauthor =s.next();
} 

    public void setBstatus(String Bstatus) {
        this.Bstatus = Bstatus;
    }

    public String getBstatus() {
        return Bstatus;
    }
   
    public String getBname() {
        return Bname;
    }

    public String getBauthor() {
        return Bauthor;
    }

    public int getBcode() {
        return Bcode;
    }
    public static void main(String[] args) {
           Book b1 = new Book();
        b1.setBstatus ("Available");
        System.out.println("The book is" + b1.getBstatus());
    }
    
}
