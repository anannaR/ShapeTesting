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
public class Shape {
   /* private  int a;
    private int b;
    private int c;
     public void setX(int x){
        a=x;
        
    }
    public void setY(int y){
        b=y;
        
    }
    public void setZ(int z){
        c=z;
        
    }
    public void volume(int x,int y,int z){
        System.out.println(x*y*z);
    }
    public void volume(int r){
        double v=(4/3)*3.14*r*r*r;
        System.out.println(v);
    }*/
    private double d1;
    private double d2;
    public Shape(double x,double y){
        d1= x;
        d2= y;
        
        
    }
    public double getd1(){
        return d1;
    }
    public double getd2(){
        return d2;
    }
    
    
    
}
