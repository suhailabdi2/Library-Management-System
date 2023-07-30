/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SuhailAbdi
 */
public class Librarymanagement {

   private String Bname;
   private String Bauthor;
   private int Bcode;
   private boolean Bstatus;
  Librarymanagement (){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Books's name");
    Bname =s.next();
    System.out.println("Enter Books's code");
    Bcode =s.nextInt();
    System.out.println("Enter Books's Author");
    Bauthor =s.next();
} 

    public void setBname(String Bname) {
        this.Bname = Bname;
    }

    public void setBauthor(String Bauthor) {
        this.Bauthor = Bauthor;
    }

    public void setBcode(int Bcode) {
        
        this.Bcode = Bcode;
    }

    public void setBstatus(boolean Bstatus) {
        this.Bstatus = Bstatus;
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
/* when can i pass condition in setter or getter method
    Generating a random boolean (public boolean nextBoolean()) */
    public boolean isBstatus() {
    Random rd = new Random(); // creating Random object
    System.out.println(rd.nextBoolean());
        return Bstatus;
    }
  
    public static void main(String[] args) {
        Librarymanagement b1 = new Librarymanagement();
       
        
    }
    
}
