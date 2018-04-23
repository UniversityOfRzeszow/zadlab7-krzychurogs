/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poduszkowiec;

/**
 *
 * @author krzysztof
 */
public class Poduszkowiec implements Latajacy,Plywajacy{

    @Override
    public void lata() {
        System.out.println("lata");
        
    }

    @Override
    public void plywa() {
     System.out.println("plywa");  
    }
   public static void main(String[] args) {
        Poduszkowiec monster = new Poduszkowiec();
        System.out.println("nasz poduszkowiec");
        monster.lata();
        System.out.println("a nawet");
        monster.plywa();
    }
    
    
}
