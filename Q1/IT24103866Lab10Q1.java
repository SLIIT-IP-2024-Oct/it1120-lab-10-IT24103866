import java.util.Scanner;
public class IT24103866Lab10Q1 {
    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println();
        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();


        assert(mark <=100 && mark >=0): "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

        if (mark>=75)
        {
            System.out.println("The Grade for the Entered Mark is: A");
            return;
           
        }
        else if (mark>=60)
        {
            System.out.println("The Grade for the Entered Mark is: B");
            return;
            
        }
        else if (mark>=50)
        {
            System.out.println("The Grade for the Entered Mark is: C");
            return;
            
        }
        else if(mark>=40)
        {
            System.out.println("The Grade for the Entered Mark is: D");
            return;
        }
            
        else 
        {
            System.out.println("The Grade for the Entered Mark is: F");
            return;
            
        }


    }
}