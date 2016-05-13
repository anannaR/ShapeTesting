/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetesting;

/**
 *
 * @author user
 */
public class ThreeDShape extends Shape {
    private double d3;
     public ThreeDShape(double x,double y,double z){
        super(x,y);
        d3= z;
    }
    public double getd3(){
        return d3;
    }

   
    
}
