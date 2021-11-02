import java.util.Scanner;

public class Reverse {

    
    public static void getNumber(int number){

        int reverse = 0;  

        while(number != 0)   
        {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number=number/10;
        }  
        System.out.print(reverse);
       
    }
    public static void main(String [] args){
        
        Scanner scanner =new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  
        scanner.close();

        getNumber(number);
        
    }

    
}
