/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import zad2.Punkt2d;

/**
 *
 * @author krzysztof
 */
public class Punkt3d extends Punkt2d {
    int z;

    public Punkt3d() {
    this.z=0;
    }
    
    public Punkt3d(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
     
        
    }

   

    @Override
    public String toString() {
         return "Punkt3d "+super.toString()+"z=" + z + '}';

    }
    


    
    
    

    
    
    
    
    
}
