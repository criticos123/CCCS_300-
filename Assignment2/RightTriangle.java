public class RightTriangle {

    public static void printRightTriangle(int rows){



        for(int i=1;i <= rows;i++){

            //need three loops. one for number of rows. one for spaces and one for stars
            for(int j=1;j <= rows-i;j++){

                System.out.print("  ");
                
            }
            
            for(int k=1;k<=i; k++){

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

                printRightTriangle(number);

            }else{

                System.out.println("Error: input value must be >= 0");
            }
            
    }
    
}
