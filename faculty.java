/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library1;

/**
 *
 * @author Richard Ngabo
 */
public class faculty extends User{
     private String Fdepartment;

        public faculty(String Fdepartment , String username, String password) {
            super(username, password);
            this.Fdepartment = Fdepartment;
        }

        public String getFdepartment() {
            return Fdepartment;
        }

        public void setFdepartment(String Fdepartment) {
            this.Fdepartment = Fdepartment;
        }
     
 }  
