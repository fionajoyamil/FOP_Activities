import java.util.Scanner;
public class Pyramid 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number for pyramid: ");
        int number = input.nextInt();
        
        for (int x=number; x>=1; x--)
        {
            for (int y=1; y<= x; y++)
            {
               System.out.print(" ");
            }
            for (int z=1; z<=1; z++)
            {
                System.out.print("#\n");
            }
        }   
    }
}
