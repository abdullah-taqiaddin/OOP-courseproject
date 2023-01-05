
package oop20192;

public class Address {
    
    private String street ;
    private String city ;
    private int building ;

    public Address() {
        //default
    }

    public Address(String street, String city, int building) {
        //parameterized_constructor 
        this.street = street;
        this.city = city;
        this.building = building;
    }

    @Override
    public String toString() {
       return "Street : " + street + "\ncity : " + city 
               + "\nbuilding : " + building ;
    }
    
    
    
}
