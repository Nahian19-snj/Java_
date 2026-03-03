/******************************************
 *  Author : Nahian Karim   
 *  Created On : Sun Mar 09 2025
 *  File : Test.java
 *******************************************/
public class Book extends ReadingMaterial {

    private int numPages;
    private String binding;
    
    public Book(String format, int numPages, String binding) {
        super(format);
        this.numPages = numPages > 0 ? numPages : 1;
        this.binding = binding;
    }

    public int getNumpages() {
        return numPages;
    }

    public void setNumpages(int numPages) {
        this.numPages = numPages;
        if (numPages > 0) {
            this.numPages = numPages;
        } else {
            this.numPages = 1;
        }
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book [numpages=" + numPages + ", binding=" + binding + " " + super.toString() + "]";
    }

    
    
}
