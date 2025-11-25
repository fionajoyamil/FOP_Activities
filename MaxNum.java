import java.util.Scanner;
public class MaxNum 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size= input.nextInt();
        int number= 1;
        
        int[] array = new int[size+1];
        
        do 
        {
            System.out.print("Enter number " + number + " : ");
            array[number] = input.nextInt();
            number++;
        }
        while (number<=size);
        
        int max= array[0];
        for (int i= 0; i<size; i++)
        {
            if(array[i] > max)
            {
                max=array[i];
            }
        }
        System.out.print("\nThe maximum number in the array is: " + max);
    }
}

