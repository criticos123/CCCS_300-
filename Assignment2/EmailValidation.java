
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
    
    //method to check if tis a valid prefix character
    public static boolean isValidPrefixChar(char ch){

        if(isAlphanumeric(ch)==true || ch=='_' || ch=='.' || ch=='-' ){

            return true;

        }else{

            return false;
        }
       
    }

    

    //method to check if tis a valid domain character
    public static boolean isValidDomainChar(char ch){


        if(isAlphanumeric(ch)==true || ch=='.' || ch=='-' && ch!='_'){

            return true;

        }else{

            return false;
        }

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

    //method will seperate the string and return the prefix of the email.
    public static String getDomain(String email){

        String[] split_Email= email.split("@");

        String domain_Email=split_Email[1];

        return domain_Email;

    }

    //method to check if the string contains two non alpha or numeric characters in a row
    //An underscore, a period, or a dash must always be followed by one or more alphanumeric characters.
    public static boolean check_For_Next_Char(String email){

        boolean result=true;

        char[]email_Array=email.toCharArray();

        for(int i=0;i<email_Array.length;i++){

            if(isAlphanumeric(email_Array[i])==false && isAlphanumeric(email_Array[i+1])==false){

                result=false;
            }

        }

        return result;
    }

    //method to check if the prefix is valid
    public static boolean isValidPrefix(String prefix){

        boolean result=true;;
        char[]prefix_Array=prefix.toCharArray();

        for(char ch:prefix_Array){

            if(isValidPrefixChar(ch)==false || check_For_Next_Char(prefix)==false){

                result=false;

            }
        }

        return result;

    }

    //method to check if the domain is valid
    public static boolean isValidDomain(String domain){

        boolean result=true;
        char[]domain_Array=domain.toCharArray();
        String []split_Domain=domain.split("\\.");
            
        for(char ch:domain_Array){

            if(isValidDomainChar(ch)==false || check_For_Next_Char(domain)==false || 
               split_Domain[0].length()<1 || split_Domain[1].length()<2) {

                result=false;

            }
        }

        return result;

    }

    //method will seperate the string and return the domain of the email.
    public static boolean isValidEmail(String email){

        String prefix=getPrefix(email);
        String domain= getDomain(email);

        if(exactlyOneAt(email)==true && isValidPrefix(prefix)==true && 
           isValidDomain(domain)==true){

            return true;

        }else{

            return false;
        }
    }

    public static void main(String [] args){

        String print_Email= input_Email();
        boolean part_A=isAlphanumeric('&');
        boolean part_B_One= isValidPrefixChar('.');
        boolean part_B_Two= isValidDomainChar('_');
        boolean part_C=exactlyOneAt(print_Email);
        String part_D=getPrefix(print_Email);
        String part_E=getDomain(print_Email);
        boolean part_F_One=isValidPrefix(part_D);
        boolean part_F_Two=isValidDomain(part_E);
        Boolean part_G=isValidEmail(print_Email);

        System.out.println(" isAlphanumeric(&) returns "+ part_A);
        System.out.println(" isValidPrefixChar(.) returns "+ part_B_One);
        System.out.println(" isValidDomainChar(#) returns "+ part_B_Two);
        System.out.println(" exactlyOneAt("+print_Email+ ") returns "+ part_C);
        System.out.println(" getPrefix("+print_Email+ ") returns "+ part_D);
        System.out.println(" getDomain("+print_Email+ ") returns "+ part_E);
        System.out.println(" isValidPrefix("+part_D+ ") returns "+ part_F_One);
        System.out.println(" isValidDomain("+part_E+ ") returns "+ part_F_Two);
        System.out.println(" isValidEmail("+print_Email+ ") returns "+ part_G);
     
    }
}
