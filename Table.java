import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        
        int[][] table= new int [rows][columns];
        
        for (int x=0; x<table.length; x++)
        {
            for (int y=0; y<table[x].length; y++)
            {
                 System.out.print("Enter number for Row " + (x+1) + " Column " + (y+1) + ": ");
                 table[x][y]= input.nextInt();
            }
        }
        
        System.out.println("\nThe numbers you entered are:");
        for (int i=0; i<rows; i++) 
        {
            for (int e=0; e<columns; e++) 
            {
                System.out.print(table[i][e] + "\t\t");
            }
            System.out.println();
        }
    }
}
