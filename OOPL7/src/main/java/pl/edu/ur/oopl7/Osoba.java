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
public class Osoba {
    
    String imie;
    String nazwisko;
    String dataurodzenia;
    String plec;

    public Osoba(String imie, String nazwisko, String dataurodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(String dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
    
    
    
    public void infoosoba()
    {
        System.out.println("imie to"+this.imie);
         System.out.println("nazwisko to"+this.nazwisko);
          System.out.println("imie to"+this.dataurodzenia);
           System.out.println("imie to"+this.plec);
    }
}
