import java.util.Scanner;


public class CoinMachine_Methods {

    //rounding method to round up the nearest multiply of 5
    public int rounding_Change(int number){

        if(number%5<3){

            int rounded_Down_Change= (int) (Math.floor(number / 5d) * 5);
            return rounded_Down_Change;

        }else{

            int rounded_Up_Change= (int) (Math.ceil(number / 5d) * 5);
            return rounded_Up_Change;
        }
    }

    //method to round up ther
    public void getChange(int cash,int price){

        //will get the amount of change 
        int change = cash-price;
        int rounded_Change= rounding_Change(change);
        //call the rounding methods to round either up or down for my change


        //assign coin values 
        int toonies=200;
        int loonies=100;
        int quarters=25;
        int dimes=10;
        int nickels=5;


        System.out.println("your change is "+change);

        //get the number of each specific coin by dividing the remainder by the value of each coin
        int get_Toonies= rounded_Change/toonies;
        int remainder_One= rounded_Change%toonies;
        System.out.println("toonies: "+get_Toonies);

        int get_Loonies= remainder_One/loonies;
        int remainder_Two= remainder_One%loonies;
        System.out.println("loonies: "+get_Loonies);

        int get_Quarters= remainder_Two/quarters;
        int remainder_Three= remainder_Two%quarters;
        System.out.println("quarters: "+get_Quarters);
         
        int get_Dimes= remainder_Three/dimes;
        int remainder_Four= remainder_Three%dimes;
        System.out.println("dimes: "+get_Dimes);

        int get_Nickels= remainder_Four/nickels;
        System.out.println("nickels: "+get_Nickels);

        
    }

    
    public void print_Results(){

        // create scanner to allow user inputs
        Scanner scanner =new Scanner(System.in);  

        System.out.print("Input your amount of money given: ");  
        int cash = scanner.nextInt(); 

        System.out.print("Input the cost of the item: ");  
        int price= scanner.nextInt(); 

        scanner.close();

        if(cash>=price && cash>0 && price>0){
 
        System.out.println("money given is  "+cash);
        System.out.println("cost of the item is  "+price);   
        
        getChange(cash ,price);

        }else{

            System.out.println("Invalid value inputted or Not enough cash given.");

        }
    }

}
