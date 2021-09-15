public class CoinMachine {
    
    public static void main(String[] args) throws Exception {
            
        CoinMachine_Methods  method = new CoinMachine_Methods();

        // a catch error statement to detect if user puts the wrong data type
        // call the method printResults from the other class to run the program.
        try{

            method.print_Results();

        }catch(Exception e){

            System.out.println("Incorrect Value.");
            
        }
    }


}
