/******************************************
 *  Author : Nahian Karim   
 *  Created On : Sun Mar 09 2025
 *  File : Test.java
 *******************************************/
public class ReadingMaterial {

    private String format;

    public ReadingMaterial(){
        this.format = "print";
    }

    public ReadingMaterial(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "ReadingMaterial format : " + format + "]";
    }
    

}