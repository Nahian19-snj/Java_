public class CapacityExtendException extends Exception {
    
    public CapacityExtendException(String message){
        super(message);
    }
   
    public CapacityExtendException(){
        super("Array is full. Cannot add more elements.");
    }
    
}
