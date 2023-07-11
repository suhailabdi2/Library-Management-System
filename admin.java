/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library1;

/**
 *
 * @author Issene Halake
 */
public class admin  extends User {
  private String adminId;

    public admin(String adminId, String username, String password) {
        super(username, password);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    } 
}
