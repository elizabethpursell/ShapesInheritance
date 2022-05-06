/* 
Name:Elizabeth Pursell
Date: 4/29/2022
CSE 007 Spring 2022: Lab 11
Produce Rectangle program that will be a subclass to shape and will hold data for a rectangle (length, width, area, perimeter)
IDE Used: Visual Studio Code
*/
public class Rectangle extends Shape{       //Rectangle class is a subclass of Shape class
    //private class members for each Rectangle object; also inherits private class members for Shape class
    private double length;
    private double width;
    private static int numRectangles = 0;
    public Rectangle(){     //default Rectangle constructor
        super("Rectangle", "blue");
        numRectangles++;        //increments numRectangles whenever constructor is called to keep track of number of rectangle objects
    }
    public Rectangle(double length, double width){      //2 arg constructor
        this();     //calls no arg constructor in current class (Rectangle class)
        this.length = length;
        this.width = width;
    }
    public Rectangle(String name, String color, double length, double width){       //4 arg constructor
        super(name, color);     //calls 2 arg constructor of super/parent class (Shape class)
        this.length = length;
        this.width = width;
        numRectangles++;        //increments numRectangles whenever constructor is called to keep track of number of rectangle objects
    }
    public double getLength(){      //getter method to get private Rectangle member length
        return length;
    }
    public void setLength(double length){       //setter method to set private Rectangle member length
        this.length = length;
    }
    public double getWidth(){       //getter method to get private Rectangle member width
        return width;
    }
    public void setWidth(double width){     //setter method to set private Rectangle member width
        this.width = width;
    }
    public static int getNumRectangles(){       //getter method to get private static Rectangle member numRectangles
        return numRectangles;
    }
    @Override
    public double computeArea(){        //method to override Shape's abstract computeArea() method; calculates area
        double area = length * width;
        return area;
    }
    @Override
    public double computePerimeter(){       //method to override Shape class's abstract computePerimeter() method; calculates perimeter
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
    @Override       //method to override Object class's toString() method; used for printing; refers to parent class's toString() method
    public String toString(){
        return super.toString() + "\t Length: " + (Math.round(length * 100.0) / 100.0) + "; Width: " + (Math.round(width * 100.0) / 100.0) + "; Area: " + (Math.round(computeArea() * 100.0) / 100.0) + "; Perimeter: " + (Math.round(computePerimeter() * 100.0) / 100.0);
    }
}
