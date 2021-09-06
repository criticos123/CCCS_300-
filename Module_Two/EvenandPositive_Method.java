import java.util.Scanner;

public class EvenandPositive_Method{

//method to dtermine if number is positive

    public String reading_Positive_Number(int number){
        
        String result= "false";

        if(number>0){

            return result="true";

        }
        else{
            
            return result;
           
        }
    }

    //method to dtermine if number is positive

    public String reading_Even_Number(int number){
        
        String result= "false";
       
        if(number%2==0){

           return  result="true";

        }
        else{
            
            return result;
           
        }
    }

    //method to dtermine if number is positive

    public String reading_Positive_Even_Number(int number){
        
        String result= "false";
       
        if(number%2==0 && number>0){

           return  result="true";

        }
        else{
            
            return result;
           
        }
    }

    public void print_Result(){

              
        Scanner scanner =new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  
        scanner.close();

        String result_Positive= reading_Positive_Number(number);
        String result_Even= reading_Even_Number(number);
        String result_Positive_Even= reading_Positive_Even_Number(number);

        System.out.println( number+" "+ " is an positive number:  " + result_Positive);
        System.out.println( number + " " + " is an even number:  " + result_Even);
        System.out.println( number + " " + " is a positive even number:  " + result_Positive_Even);

    }
}