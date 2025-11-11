import java.util.Scanner;

public class Multiple 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int first;
        int second;
        
        System.out.print("Enter first integer: ");
        first= input.nextInt();
        
         System.out.print("Enter second integer: ");
        second= input.nextInt();
        
        if (isMultiple(first, second)==0)
        System.out.println("\n" + second + " is a multiple of " + first); 
        else 
        System.out.println("\n" + second + " is not a multiple of " + first);
    }
    public static int isMultiple(int a, int b)
    {
       return b%a;
    }
}
