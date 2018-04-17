/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Student hub=new Student(5,"stac","inf",1,"krzysztof","rogowski","21.02.1997","man");
        System.out.println(hub.getNazwisko());
        System.out.println(hub.getImie());
        Wykladowca nauczyciel=new Wykladowca("informatyka","krzysztof","rogowski","21.02.1997","man");
        System.out.println(nauczyciel.getPrzedmiot());
        System.out.println(nauczyciel.getNazwisko());
        
    }
    
}
