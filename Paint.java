//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length;
            int width;
            int height;
            int windows;
            int doors;
            int windowsSqFt = 15;
            int doorsSqFt = 20;
           
            //declare double totalSqFt;
            double totalSqFt = 0;
            //declare double paintNeeded;
            double paintNeeded = 0;
            

            length = 15;
            width = 11;
            height = 8;
            windows = 5;
            doors = 2;
 
            //Compute the total square feet to be painted--think
            totalSqFt = ((length * height) * 2) + ((width * height) * 2) + (length * width);
            System.out.println("Total square feet is " + totalSqFt);
            totalSqFt = totalSqFt - ((windowsSqFt * windows) + (doorsSqFt * doors));
            System.out.println("Total square feet with windows and doors is " + totalSqFt);
 
            //Compute the amount of paint needed
            paintNeeded = (totalSqFt / COVERAGE);
            paintNeeded = Math.ceil(paintNeeded);

            //Print the length, width, and height of the room and the
            System.out.println("Length = " + length + " Width = " + width + " Height = " + height);
            //number of gallons of paint needed.
            System.out.println("The amount of paint needed is " + paintNeeded);
        }
}