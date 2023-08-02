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
public abstract class User {
    
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public abstract String getUserType();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}

