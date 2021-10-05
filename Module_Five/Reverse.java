import java.util.Scanner;

public class Reverse {

    

    //method to get each type of coin. passes in the cash and price inputd.
    public static int getNumber(int number){

     return number;

    }
    public static void main(String [] args){
        
        Scanner scanner =new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  
        scanner.close();

        int reverse_Number= getNumber(number);

        System.out.println( number+ " reversed is:  " + reverse_Number);
        
    }

    
}
