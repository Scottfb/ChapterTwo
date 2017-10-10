import java.util.Scanner;

public class RightTriangle
{
   public static void main (String[] args)
   {
          Scanner keyboard = new Scanner(System.in);
          double side1, side2;  // lengths of the sides of a right triangle
          double hypotenuse;        // length of the hypotenuse
 
          // Get the lengths of the sides as input
          System.out.print ("Please enter the length of the side of a right triangle\n");
        side1 = keyboard.nextDouble();
        side2 = keyboard.nextDouble();
          System.out.print ("Side1 is " + side1 + ", Side2 is " + side2);
     
 
          // Compute the length of the hypotenuse
          hypotenuse = Math.pow(side1, 2) + Math.pow(side2, 2);
          hypotenuse = Math.sqrt(hypotenuse);
 
     
 
          // Print the result
          System.out.println ("Length of the hypotenuse: " + hypotenuse);
    }
}