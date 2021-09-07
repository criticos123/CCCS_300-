import java.util.Scanner;

public class Grading_Methods {
    

    //will read grade inputted and return the string associated

    public String reading_Grade(int number){
        
        String letter="";

        if(number>80){

            return letter="A";
           
        }
        
        else if(number<=80 && number>60){

            return letter="B";

        }

        else if(number<=60 && number>=50){

            return letter="C";

        }

        else if(number<50 && number>=45){

            return letter="D";

        }

        else if(number<45 && number>=25){

            return letter="E";

        }

        else if(number<25 && number>=0){

            return letter="F";

        }
        
        else{

            return letter="Invalid Grade"; 
        }
    }


    public void print_Result(){

              
        Scanner scanner =new Scanner(System.in);  
        System.out.print("Enter a Grade: ");  
        int number = scanner.nextInt();  
        scanner.close();

        String result= reading_Grade(number);

        System.out.println("The student's grade is a "+result);

    }
}
