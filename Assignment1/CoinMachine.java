public class CoinMachine {


    //rounding method to round up the nearest multiply of 5
    public static int rounding_Change(int number){

        if(number%5<3){

            int rounded_Down_Change= (int) (Math.floor(number / 5d) * 5);
            return rounded_Down_Change;

        }else{

            int rounded_Up_Change= (int) (Math.ceil(number / 5d) * 5);
            return rounded_Up_Change;

        }
    }

    //method to get each type of coin 
    public static void getChange(int cash, int price){

        int change = cash-price;
        int rounded_Change= rounding_Change(change);

        //assign coin values 
        int toonies=200;
        int loonies=100;
        int quarters=25;
        int dimes=10;
        int nickels=5;


        System.out.println("your change is "+change);
        System.out.println("your rounded change is "+rounded_Change);

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
    public static void main(String [] args){
        
    // This method will take in the cash and price to get the cahnge and amount of coins needed.
        String inputOne= args[0];
        String inputTwo= args[1];

        int cash= Integer.parseInt(inputOne);
        int price = Integer.parseInt(inputTwo); 
  
        // condition to make sure user inputs poisitve values and proper cost of the item.
        if(cash>=price && cash>0 && price>0){
 
            System.out.println("money given is  "+cash);
            System.out.println("cost of the item is  "+price);   
        
            getChange(cash ,price);

        }else{

            System.out.println("Invalid value inputted or Not enough cash given.");

        }
        
    }


}
