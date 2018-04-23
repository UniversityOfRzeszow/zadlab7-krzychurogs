/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author student
 */
public class NewMain {

    
    public static void main(String[] args) {
       
      Punkt2d test=new Punkt2d();
      
      System.out.println(test.toString());
      Punkt3d test1=new Punkt3d();
      
        System.out.println(test1.toString());
      
       Punkt2d[] array2D = new Punkt2d[100];
        Punkt3d[] array3D = new Punkt3d[100];
        for (int i = 0; i < 100; i++) {
            array2D[i] = new Punkt2d();
            array3D[i] = new Punkt3d();
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(array2D[i].x==array3D[j].x && array2D[i].y==array3D[j].y){
                    System.out.println(array2D[i].toString());
                    System.out.println(array3D[j].toString());
                }
            }

        }

      
    }
    
}
