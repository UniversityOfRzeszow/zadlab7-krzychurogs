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
public class Student extends Osoba {
     int nrindeksu;
   String typstudiow;
   String kierunek;
   int rok;

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

    public Student(int nrindeksu, String typstudiow, String kierunek, int rok, String imie, String nazwisko, String dataurodzenia, String plec) {
        super(imie, nazwisko, dataurodzenia, plec);
        this.nrindeksu = nrindeksu;
        this.typstudiow = typstudiow;
        this.kierunek = kierunek;
        this.rok = rok;
    }
    
    

}
