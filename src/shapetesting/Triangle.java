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
public class Triangle extends TwoDShap{
   public  Triangle(int x,int y){
       /* super.setX(x);
       super.setY(y);*/
       super(x,y);
   }
   void area(){
       double d= 0.5*getd1()*getd2();
       System.out.println("area of triangle "+d);
   }

  

   
    
    
}
