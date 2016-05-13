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
public class ShapeTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cube ob1= new Cube(2,4,5);
        ob1.area();
        ob1.volume();
        Sphere ob2= new Sphere(2);
         ob2.area();
        ob2.volume();
        Triangle ob3= new Triangle (4,5);
        ob3.area();
        
        Rectangle ob4= new Rectangle (4,5);
         ob4.area();
        
        Circle ob5= new Circle(4);
         ob5.area();
        
        
    }
    
}
