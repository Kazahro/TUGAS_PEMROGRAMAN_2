/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_lima5_keyword_this_pada_class;

public class Person {
    
    String name;

    public Person(String name) {
        this.name = name;
    }
    
    public void showName() {
        System.out.println("Nama saya: " + this.name);
    }

    public static void main(String[] args) {
        
        Person p = new Person("Rois");
        
        p.showName();
    }
}
