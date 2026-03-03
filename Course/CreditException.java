public class CreditException extends Exception {
     
    public CreditException(String message){

        super(message);

    }

    public CreditException(){
        
       super("Credit is beyond limits");

        }

    }
    

