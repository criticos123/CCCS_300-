
import java.util.*;

public class EmailValidation {
    
    //method to get email input from the user
    public static String input_Email(){

        Scanner scanner =new Scanner(System.in);  
        System.out.print("Enter a email: ");  
        String email = scanner.next();  
        scanner.close();

        return email;

    }

    //will detect if there is an invalid character and return false
    public static boolean isAlphanumeric(char ch){


        boolean result=Character.isLetterOrDigit(ch);

        return result;

    }


    //method checks to see if there is only one '@' in te email if it does return true
    public static boolean exactlyOneAt(String email){

        int counter=0;
        char[]email_Array=email.toCharArray();
        boolean result=true;

        for (int i=0;i<email_Array.length;i++) {

            if (email_Array[i] == '@') {

                counter++;

            }

        }
        
        if(counter!=1){

            result=false;

        }
        return result;
    }

    public static String getPrefix(String email){

        String[] split_Email= email.split("@");

        String prefix_Email=split_Email[0];

        return prefix_Email;

    }

    public static String getDomain(String email){

        String[] split_Email= email.split("@");

        String domain_Email=split_Email[1];

        return domain_Email;

    }

    public static void main(String [] args){

        String inputOne= args[0];
        char ch= inputOne.charAt(0);

        String print_Email= input_Email();
        boolean result_One=isAlphanumeric(ch);
        boolean result_Two=exactlyOneAt(print_Email);
        String result_Three=getPrefix(print_Email);
        String result_Four=getDomain(print_Email);

        System.out.println(" isAlphanumeric("+ch+ ") returns "+ result_One);
        System.out.println(" exactlyOneAt("+print_Email+ ") returns "+ result_Two);
        System.out.println(" getPrefix("+print_Email+ ") returns "+ result_Three);
        System.out.println(" getPrefix("+print_Email+ ") returns "+ result_Four);
     
    }
}
