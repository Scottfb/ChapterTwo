import java.util.Random;
 
public class RollingDice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int dice1, dice2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          dice1 = generator.nextInt(6) + 1;
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          dice2 = (int) (generator.nextFloat() * 6) + 1;
 
          System.out.println ("You rolled the numbers " + dice1 + " and " + dice2);
          System.out.println("In total you rolled " + (dice1 + dice2));
        }
}

