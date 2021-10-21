public class LeftTriangle {

   
   public static void printLeftTriangle(int rows){

       
    for(int i=0;i<=rows;i++){

        for(int j=1;j<=i;j++){

            System.out.print("* ");
        }

        System.out.println();

    }

   }

    public static void main(String [] args){
        
        //command line inputs first one is cash and then price
            String inputOne= args[0];
            int number=Integer.parseInt(inputOne);

            if(number>=0){

                printLeftTriangle(number);

            }else{

                System.out.println("Error: input value must be >= 0");
            }
            
    }
    
}

