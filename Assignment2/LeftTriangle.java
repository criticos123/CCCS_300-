public class LeftTriangle {

   
   public static void printLeftTRaingle(int number){

        for(int i=0;i<=number;i++){

            for(int j=0;j<=i;j++){

                System.out.print("* ");
            }

            System.out.println("");

        }

   }

    public static void main(String [] args){
        
        //command line inputs first one is cash and then price
            String inputOne= args[0];
            int number=Integer.parseInt(inputOne);

            if(number>=1){

                printLeftTRaingle(number);

            }else{

                System.out.println("Error: input value must be >= 0");
            }
            
    }
    
}

