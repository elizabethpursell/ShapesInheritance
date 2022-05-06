/* 
Name:Elizabeth Pursell
Date: 4/29/2022
CSE 007 Spring 2022: Lab 11
Produce Circle program that will be a subclass to shape and will hold data for a circle (radius, area, perimeter. etc.)
IDE Used: Visual Studio Code
*/
public class Circle extends Shape{      //Circle class is a subclass of Shape class
    //private class members for each Circle object; also inherits private class members for Shape class
    private double radius;
    private static int numCircles = 0;
    public Circle(){        //default Circle constructor
        super("Circle", "purple");      //calls 2 arg constructor of super/parent class (Shape class)
        numCircles++;       //increments numCircles whenever constructor is called to keep track of number of circle objects
    }
    public Circle(double radius){       //1 arg constructor
        this();     //calls no arg constructor in current class (Circle class)
        this.radius = radius;
    }
    public Circle(String name, String color, double radius){        //3 arg constructor
        super(name, color);     //calls 2 arg constructor of super/parent class (Shape class)
        this.radius = radius;
        numCircles++;       //increments numCircles whenever constructor is called to keep track of number of circle objects
    }
    public double getRadius(){      //getter method to get private Circle member radius
        return radius;
    }
    public void setRadius(double radius){       //setter method to set private Circle member radius
        this.radius = radius;
    }
    public static int getNumCircles(){      //getter method to get private static Circle member numCircles
        return numCircles;
    }
    @Override
    public double computeArea(){            //method to override Shape's abstract computeArea() method; calculates area
        double area = Math.PI * radius * radius;
        return area;
    }
    @Override
    public double computePerimeter(){       //method to override Shape class's abstract computePerimeter() method; calculates perimeter
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    @Override       //method to override Object class's toString() method; used for printing; refers to parent class's toString() method
    public String toString(){
        return super.toString() + "\t Radius: " + (Math.round(radius * 100.0) / 100.0) + "; Area: " + (Math.round(computeArea() * 100.0) / 100.0) + "; Perimeter: " + (Math.round(computePerimeter() * 100.0) / 100.0);
    }
}
