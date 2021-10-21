import java.util.Arrays;

public class Midterm {

        public static int crazySubstraction(String number ){
    
            char[]charArray=number.toCharArray();
            int crazyNumber=0;
            int sum=0;
            int multiply=1;
    
            for(int i=0;i<number.length();i++){
    
                char ch=number.charAt(i);
                int digit= Character.getNumericValue(ch);
    
                sum+=digit;
                multiply=multiply*digit;
                crazyNumber=Math.abs(sum-multiply);
            }
            
            return crazyNumber;
    
        }
    
        public static boolean isOddDigits(int numberOne,int numberTwo){
    
            int sizeOne = (int) (Math.log10(numberOne) + 1);
            int sizeTwo = (int) (Math.log10(numberTwo) + 1);
    
            return sizeOne%2==0 && sizeTwo%2==0;
        }
    
        public static int multiplyRemainder(int one,int two, int three,int divider){
    
            int modOne= one%divider;
            int modTwo= two%divider;
            int modThree= three%divider;
    
           return modOne*modTwo*modThree;
        }
    
        public static void subLR(String number){
    
            char[] arr= number.toCharArray();

            int halfsize= (arr.length)/2;
            int secondHalf=arr.length-halfsize;
            int leftInt=0;
            int rightInt=0;
            int sub=0;

            StringBuilder sr=new StringBuilder();
            StringBuilder st=new StringBuilder();
            String str="";
            String strTwo="";
            
            System.out.println(secondHalf);


            for(int i=0;i<halfsize;i++ ){
    
                str=sr.append(arr[i]).toString();
                leftInt= Integer.parseInt(str);
                   
            }

            if(secondHalf%2!=0){

                halfsize=halfsize+1;
            }

            for ( int j=halfsize;j<arr.length;j++) {


                strTwo=st.append(arr[j]).toString();
               
                rightInt= Integer.parseInt(strTwo);

            }

            sub=leftInt-rightInt;

            System.out.println(leftInt);
            System.out.println(rightInt);
            System.out.println(sub);
        }
            
           
    
           
        
    
        public static void sameVowelsStrings(String one, String two, String three){
    
            boolean result=false;
            char[]vowels={'a','e','i','o','u'};

            String oneVowels="";
            String twoVowels="";
            String threeVowels="";

            char[] oneArr=one.toCharArray();
            char[] twoArr=two.toCharArray();
            char[] threeArr=three.toCharArray();

            Arrays.sort(oneArr);
            Arrays.sort(twoArr);
            Arrays.sort(threeArr);

            StringBuilder sr=new StringBuilder();
            StringBuilder st=new StringBuilder();
            StringBuilder su=new StringBuilder();

            for(char c:oneArr){
                for(char ch:vowels){

                    if(c==ch){

                    oneVowels= sr.append(ch).toString();

                    }
                }
    
            }

            for(char c:twoArr){
                for(char ch:vowels){

                    if(c==ch){

                    twoVowels= st.append(ch).toString();

                    }
                }
    
            }

            for(char c:threeArr){
                for(char ch:vowels){

                    if(c==ch){

                    threeVowels= su.append(ch).toString();

                    }
                }
    
            }

            if(oneVowels.equals(twoVowels) && oneVowels.equals(threeVowels) && twoVowels.equals(threeVowels)){

                result=true;
            }

            System.out.println(oneVowels);
            System.out.println(twoVowels);
            System.out.println(threeVowels);

            System.out.println(result);
        }

        //size will be the number of rows
        public static void drawCross(int rows){


            for(int i=0;i<=rows;i++){

                for(int j=1;j<=i;j++){
    
                    System.out.print(" ");
                }

           

                System.out.println("*");
    
            }

    
        }

            
          

        
    
        public static void main(String[] args) throws Exception {
           
            drawCross(5);
        }
}
    

