/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_lima5_keyword_this_pada_class;

public class User {

    String username;
    
    public User(String username) {
        this.username = username;
    }

    public void showUsername() {
        System.out.println("Username: " + this.username);
    }

    public static void main(String[] args) {

        User u = new User("Nanang");

        u.showUsername();
    }
}
