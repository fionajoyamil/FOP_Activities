import java.util.Scanner;
public class Finals 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //intro
        System.out.print("Welcome to the Final Exam program, choose what mode to do:" + "\nLoop/loop for looping program" + "\nOneD for one dimensional array" + "\nTwoD for two dimensional array");
        System.out.print("\nEnter a mode (enter Exit/exit to exit): ");
        String mode = input.nextLine();
        
    public static String userInput(String a)
    {
       switch (a)
       {
            case Loop:
               System.out.print(printFibonacci(0));
               break;
            case OneD:
               int layer = 5;
               System.out.print(oneDimensional(layer));
               break;
            case TwoD:
               int rows = 3;
               int columns = 3;
               System.out.print(twoDimensional(rows, columns));
               break;
            case Exit:
               System.out.print("Thank you for using the program!");
               break;
       }
    

    }  
        //Loop
           public static int printFibonacci(int a)
           {
               System.out.print("Enter number for Fibonacci (enter Exit/exit to exit to main menu: ");
               int fibo = input.nextInt();
               
               if (fibo == 0)
                   return;
               }
            do 
            {
                for (int x=0; x<=fibo; x--)
                {
                    System.out.print("");
                }
                
            while (x>=1)
            }
    
           }
        //Array 
          public static int oneDimensional(int a)
          {
              System.out.print("Welcome to One Dimensional Array Program!");
              
              int[] array = new int[a];
              for (int x=0; x>a; x++)
              {
                  System.out.print("Enter number for layer " + x + ": ");
                  int[] given = input.nextInt();
                  
                  for (int i= 0; i<=x; i++)
                  {
                      System.out.print("Multiplication value: " +);
                  }
                  
                  int max= array[0];
                  for (int i= 0; i<size; i++)
                  {
                     if(array[i] > max)
                     {
                          max=array[i];
                     }
                  }
                      System.out.print("Max number: " + max);
                  }
                  for (int e=0; e>=x; e++)
                  {
                      for (int p= (System.out.print("Min number: " + min);
                  }
              }
          }
          public static int twoDimensional(int a, int b)
          {
            int[][] twoD = new int[a][b];
            for (int x=0; x< a; x++)
            {
              for (int y= 0; y< b; y++)
              {
                System.out.print("Enter number for Row " + x + " Column " + y + ": ");
                twoD[x][y] = input.nextInt();
              }
            }
            for (int x= 0; x< a; x++)
            {
              for (int y= 0; y< b; y++)
              {
                System.out.print(twoD[x][y] + "\t");
              }
            System.out.println();
            }  
            return 0;
          }
    }
}

