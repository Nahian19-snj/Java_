/******************************************
 *  Author : Nahian Karim   
 *  Created On : Sun Mar 09 2025
 *  File : Test.java
 *******************************************/
public class Newspaper extends ReadingMaterial {
    
    private int numPages;


    public Newspaper(String format, int numPages) {
        super(format);
        this.numPages = numPages > 0 ? numPages : 1;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
        if (numPages > 0) {
            this.numPages = numPages;
        } else {
            this.numPages= 1;
        }
    }

    @Override
    public String toString() {
        return "Newspaper [numPages=" + numPages + ", " + super.toString() + "]";
    }

    

    
}
