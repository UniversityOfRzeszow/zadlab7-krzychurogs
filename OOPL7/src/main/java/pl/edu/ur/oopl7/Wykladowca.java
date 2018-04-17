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
public class Wykladowca extends Osoba {
    String przedmiot;

    
    public Wykladowca(String przedmiot,String imie,String nazwisko, String dataurodzenia, String plec) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.przedmiot = przedmiot;
       
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
 
 
}
