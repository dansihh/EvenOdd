
package even_odd;
import java.util.Scanner;
import java.util.Arrays;


public class Even_odd {

   
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        
      int n;
        System.out.println("Enter the number of elements:");
        
        n= in.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the integers:");
        
        
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
            
        }
        for(int i: array){ //to print the array that has been input

            System.out.println("Array:" + i);
        }
        
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(array[i] % 2 == 0)
            {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("");
        
        System.out.print("Odd numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(array[i] % 2 != 0)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
        
}

