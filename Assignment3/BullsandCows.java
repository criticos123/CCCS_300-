import java.util.*;
import java.lang.Math; 


public class BullsandCows {

    //method to see if digit iputted is in array
    public static boolean contains(int[]numberArray,int number){

        boolean result=false;

        for(int i:numberArray){

            if(i==number){

                result=true;
            }

        }


        return result;
    }

    public static int[] generateSecretDigits(){

        int []secretArray=new int[4];
        int min=0;
        int max=9;

        for(int i=0;i<secretArray.length;i++){ 

            secretArray[i]=(int) Math.floor(Math.random()*(max-min+1)+min);


        }

        return secretArray;
    }

    public static int getNumOfBulls(int[]secret,int[]guesses){
        

        return 0;
    }
    public static void main(String[] args) throws Exception {

        //method printout for part 1a
        int[]y={9,0,2,6};
        boolean printOne=contains(y, 2);
        System.out.println(printOne);

        //method for printout for part2a
        int[]printArray=generateSecretDigits();
        for(int i=0;i<printArray.length;i++){ 

            System.out.println(printArray[i]);


        }

        
    }
    
}
