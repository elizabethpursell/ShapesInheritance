/* 
Name:Elizabeth Pursell
Date: 4/29/2022
CSE 007 Spring 2022: Lab 11
Produce Triangle program that will be a subclass to shape and will hold data for a triangle (base, height, area, perimeter)
IDE Used: Visual Studio Code
*/
public class Triangle extends Shape{        //Triangle class is a subclass of Shape class
    //private class members for each Triangle object; also inherits private class members for Shape class
    private double base;
    private double height;
    private double x;
    private double y;
    private static int numTriangles = 0;
    public Triangle(){      //default Triangle constructor
        super("Triangle", "yellow");        //calls 2 arg constructor of super/parent class (Shape class)
        numTriangles++;     //increments numTriangles whenever constructor is called to keep track of number of triangle objects
    }
    public Triangle(double base, double height, double x, double y){        //4 arg constructor
        this();     //calls no arg constructor in current class (Triangle class)
        this.base = base;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    public Triangle(String name, String color, double base, double height, double x, double y){     //6 arg constructor
        super(name, color);     //calls 2 arg constructor of super/parent class (Shape class)
        this.base = base;
        this.height = height;
        this.x = x;
        this.y = y;
        numTriangles++;     //increments numTriangles whenever constructor is called to keep track of number of triangle objects
    }
    public double getBase(){        //getter method to get private Triangle member base
        return base;
    }
    public void setBase(double base){       //setter method to set private Triangle member base
        this.base = base;
    }
    public double getHeight(){      //getter method to get private Triangle member height
        return height;
    }
    public void setHeight(double height){       //setter method to set private Triangle member height
        this.height = height;
    }
    public double getX(){       //getter method to get private Triangle member x
        return x;
    }
    public void setX(double x){     //setter method to set private Triangle member x
        this.x = x;
    }
    public double getY(){       //getter method to get private Triangle member y
        return y;
    }
    public void setY(double y){     //setter method to set private Triangle member y
        this.y = y;
    }
    public static int getNumTriangles(){        //getter method to get private static Triangle member numTriangles
        return numTriangles;
    }
    @Override
    public double computeArea(){        //method to override Shape's abstract computeArea() method; calculates area
        double area = 0.5 * base * height;
        return area;
    }
    @Override
    public double computePerimeter(){       //method to override Shape class's abstract computePerimeter() method; calculates perimeter
        double perimeter = x + y + base;
        return perimeter;
    }
    @Override       //method to override Object class's toString() method; used for printing; refers to parent class's toString() method
    public String toString(){
        return super.toString() + "\t Base: " + (Math.round(base * 100.0) / 100.0) + "; Height: " + (Math.round(height * 100.0) / 100.0) + "; Side x: " + (Math.round(x * 100.0) / 100.0) + "; Side y: " + (Math.round(y * 100.0) / 100.0) + "; Area: " + (Math.round(computeArea() * 100.0) / 100.0) + "; Perimeter: " + (Math.round(computePerimeter() * 100.0) / 100.0);
    }
}
