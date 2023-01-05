
package oop20192;

public class CollegeAddress extends Address {
    private String collegeName ;

    public CollegeAddress() {
        //default
    }

    public CollegeAddress(String collegeName) {
        this.collegeName = collegeName;
        //single parameter
    }

    public CollegeAddress(String collegeName, String street, String city, int building) {
        super(street, city, building); //super first in construc.
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCollege_Name : " + collegeName ;
    }
    
    
}
