import java.util.Scanner;

public class Dozen 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int number;
        int dozen= 12;
        
        System.out.print("Enter the number of eggs: ");
        number= input.nextInt();
        
        System.out.println("\nNumber of Dozen: " + determineDozen(number, dozen));
        System.out.println("Egss less than a Dozen: " + showLessDozen(number, dozen));
        
    }
     public static int determineDozen(int a, int b)
     {
         return a/b; 
     }
     public static int showLessDozen(int a, int b)
    {
        return a%b;
    }
}
