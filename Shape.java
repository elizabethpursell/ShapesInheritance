/* 
Name:Elizabeth Pursell
Date: 4/29/2022
CSE 007 Spring 2022: Lab 11
Produce Shape program that will be the abstract superclass for all shape data
IDE Used: Visual Studio Code
*/
public abstract class Shape {       //abstract Shape class; parent class for all shapes; abstract means that it cannot be its own object
    //private class members for each Shape object
    private String name;
    private String color;
    private static int numShapes = 0;
    protected Shape(){      //default Shape constructor
        //this("Shape", "red");
        name = "Shape";
        color = "red";
        numShapes++;        //increments numShapes whenever constructor is called to keep track of number of shape objects
    }
    protected Shape(String name, String color){     //2 arg constructor
        this.name = name;
        this.color = color;
        numShapes++;        //increments numShapes whenever constructor is called to keep track of number of shape objects
    }
    public String getName(){        //getter method to get private Shape member name
        return name;
    }
    public String getColor(){       //getter method to get private Shape member color
        return color;
    }
    public void setName(String name){       //setter method to set private Shape member name
        this.name = name;
    }
    public void setColor(String color){     //setter method to set private Shape member color
        this.color = color;
    }
    public static int getNumShapes(){       //getter method to get private static Shape member numShapes
        return numShapes;
    }
    public abstract double computeArea();       //abstract methods for subclasses to override
    public abstract double computePerimeter();
    @Override
    public String toString(){       //toString method to override object class method; used for printing
        return "Name: " + name + "; Color: " + color;
    }
}
