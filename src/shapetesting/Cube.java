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
public class Cube extends ThreeDShape{
    public Cube(double x,double y,double z){
     
        super(x,y,z);
    }
     void area(){
        double a= 2*getd1()*getd2()+2*getd2()*getd3()+2*getd3()*getd1() ;
        System.out.println("area of cube "+a);
      }
      void volume(){
          double b= getd1()*getd2()*getd3();
          System.out.println("volume of cube "+b);
      }

    
    
    
}
