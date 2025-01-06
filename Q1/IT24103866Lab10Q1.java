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

        char grade;
        
        if (mark>=75)
        {
            grade ='A';
        
           
        }
        else if (mark>=60)
        {
             grade ='B';
            
        }
        else if (mark>=50)
        {
            
             grade ='C';
        }
        else if(mark>=40)
        {
             grade ='D';
        }
            
        else 
        {
             grade ='F';
            
        }

        assert (mark >= 75 && grade == 'A') || 
       (mark >= 60 && grade == 'B') || 
       (mark >= 50 && grade == 'C') || 
       (mark >= 40 && grade == 'D') || 
       (grade == 'F') : "Incorrect Grade Assigned";


        System.out.println("The Grade for the Entered Mark is; "+grade);


    }
}
    

