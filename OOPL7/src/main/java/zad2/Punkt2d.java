/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import java.util.Random;

/**
 *
 * @author krzysztof
 */
public class Punkt2d {
    int x;
    int y;

    public Punkt2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2d() {
    this.x = r.nextInt(20) + -10;
    this.y = r.nextInt(20) + -10;
    }
    Random r=new Random();
   
    public int gen()
    {
       int los=r.nextInt(20)+-10;
       return los;
       
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y ;
    }
    
    
}
