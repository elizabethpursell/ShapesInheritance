/* 
Name:Elizabeth Pursell
Date: 4/29/2022
CSE 007 Spring 2022: Lab 11
Produce ShapeTest program that will test the Shape base class with the circle, triangle, rectangle subclasses
IDE Used: Visual Studio Code
*/
import java.util.Scanner;       //import Scanner for user input
public class ShapeTest {
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);        //create scanner for user input
        Shape [] shapes = new Shape[5];     //create array for shape objects
        for(int index = 0; index < shapes.length; index++){
            String userShape = getUserShape(myScan);        //gets the user's shape with method; creates objects with random values
            if(userShape.equals("circle")){
                shapes[index] = new Circle("Circle", getRandomColor(), getRandomDouble());       //String name, String color, double radius
            }
            else if(userShape.equals("triangle")){
                shapes[index] = new Triangle("Triangle", getRandomColor(), getRandomDouble(), getRandomDouble(), getRandomDouble(), getRandomDouble());     //String name, String color, double base, double height, double x, double y
            }
            else if(userShape.equals("rectangle")){
                shapes[index] = new Rectangle("Rectangle", getRandomColor(), getRandomDouble(), getRandomDouble());            //String name, String color, double length, double width
            }
        }
        System.out.println();
        displayShapes(shapes);      //calls method to print shapes in array
        System.out.printf("\nTotal Perimeter: %.2f\n", calculateTotalPerimeter(shapes));    //prints total perimeter
        System.out.printf("Total Area: %.2f\n", calculateTotalArea(shapes));        //prints total area
        System.out.printf("Average Perimeter: %.2f\n", (calculateTotalPerimeter(shapes) / Shape.getNumShapes()));  //prints avg perimeter
        System.out.printf("Average Area: %.2f\n", (calculateTotalArea(shapes) / Shape.getNumShapes()));     //prints avg area
    }
    public static void displayShapes(Shape [] list){        //method to print all shape objects in array
        for(int index = 0; index < list.length; index++){
            System.out.println(list[index]);
        }
    }
    public static String getRandomColor(){      //method to get random color from array
        String [] colors = {"red", "blue", "purple", "yellow", "green", "black", "brown", "pink", "white", "orange"};
        return colors[(int) (Math.random() * (colors.length))];
    }
    public static double getRandomDouble(){     //method to get random double between 1 and 20
        return Math.random() * 20 + 1;      //Math.random() * (max - min + 1) + min
    }
    public static String getUserShape(Scanner myScan){      //method to get user's input for a shape
        boolean validString = false;
        String userShape = "";
        do{
            System.out.println("Enter a shape: ");
            userShape = myScan.next().toLowerCase();
            myScan.nextLine();
            if(userShape.equals("circle") || userShape.equals("triangle") || userShape.equals("rectangle")){
                validString = true;
            }
            else{
                validString = false;
                System.out.println("Invalid Input: Must be circle, triangle, or rectangle.");
            }
        }while(!validString);
        return userShape;
    }
    public static double calculateTotalPerimeter(Shape [] shapes){      //method to get total perimeter
        double totalPerimeter = 0;
        for(int index = 0; index < shapes.length; index++){
            totalPerimeter = totalPerimeter + shapes[index].computePerimeter();
        }
        return totalPerimeter;
    }
    public static double calculateTotalArea(Shape [] shapes){       //method to get total area
        double totalArea = 0;
        for(int index = 0; index < shapes.length; index++){
            totalArea = totalArea + shapes[index].computeArea();
        }
        return totalArea;
    }
}
