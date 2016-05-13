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
public class Sphere extends ThreeDShape {
    public Sphere (double x){
      
       super(x,0,0);
    }
    public void area(){
        double a= 4*3.1416*getd1()*getd1();
        System.out.println("area of sphere "+a);
        
    }
    public void volume(){
        double b=(4/3)*3.1416*getd1()*getd1()*getd1();
        System.out.println("volume of sphere "+b);
    }
    
}
