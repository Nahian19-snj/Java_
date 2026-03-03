public class Calculator{


    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b) throws NegativeException{
        if(a<b){
            throw new NegativeException();
        }
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
        }

    /*public Integer devision(int a, int b){
        if(b==0){
           // System.out.println("Error: Division by 0 is not allwoed."); // you should not print anything to a class.
           // return -1;// any other ansswer could be -1
           return null;

        }*/

        public int devision(int a, int b) throws  ArithmeticException{ // throws Exception if only used exception
            if (b==0){
            throw new ArithmeticException("Division is not allwoed"); 
            }
         /*public int devision(int a, int b) throws Exception{
          * if(b==0){
          throw new Exception("Devision is not allowed")
          }
         } */

        

        

        return Integer.valueOf(a/b);
    }
}
