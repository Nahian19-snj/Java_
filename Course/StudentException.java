public class StudentException extends Exception {

    public StudentException(String message){
        super(message);

    }

    public StudentException(){

        super("Student number is invalid");
    
    }
}
