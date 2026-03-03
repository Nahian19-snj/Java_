public class EmptyArrayException extends Exception {

    public EmptyArrayException(String message){
        super(message);
    }
    
    public EmptyArrayException(){
        super("Array is empty. Nothing to remove.");
    }
}