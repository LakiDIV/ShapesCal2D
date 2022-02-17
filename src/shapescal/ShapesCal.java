package shapescal;

import java.util.Scanner;

public class ShapesCal {


    public static void main(String[] args) {
        
        selectShape();
    }
    
    public static void selectShape(){
        Scanner input = new Scanner(System.in);
        double radious, x , y;
        String condition;
        
        System.out.println("How many sides your shape has ...? ");
        System.out.println("If it is a Circle or an Ellipse just put \'0\' and press enter,");
        int sides = input.nextInt();
        
        if (sides == 0){
            System.out.println("Is it a Circle or an Elipse ...? ");
            condition = input.next().toLowerCase(); // User Inputs converts to lowercase to prevent errors 
            
            // Circle
            if (("circle".equals(condition))||("c".equals(condition))||("1".equals(condition))||("o".equals(condition))) {
                
                System.out.println("What is the radious of your circle ...? ");
                radious = input.nextDouble();
                System.out.println("Area of the circle is " + circleArea(radious) + ".");
                System.out.println("Perimeter of the circle is " + circlePeri(radious) + ".");
            }
            
            // Ellipse
            if (("ellipse".equals(condition))||("e".equals(condition))||("0".equals(condition))) {
                
                System.out.println("What is the length of Semi-major Axis ...? ");
                x = input.nextDouble();
                System.out.println("What is the length of Semi-minor Axis ...? ");
                y = input.nextDouble();
                System.out.println("Area of the ellips is " + ellipseArea(x,y) + ".");
                System.out.println("Perimeter of a ellips is freaking hard to calculate ! Hope I will implement it soon :b ");
            }
        }
    }
    
    
    public static void Circle(){
        // Need to know how to access a variable that inside another class
    }
    
    
    // Circle Staff
    public static double circleArea(double someRadious){
        return Math.PI * (someRadious*someRadious);
    }
    public static double circlePeri(double someRadious){
        return 2 * Math.PI * someRadious;
    }
    
    // Ellips Staff
    public static double ellipseArea(double majorAxis, double minorAxis){
        return Math.PI * majorAxis * minorAxis;
    }
}
