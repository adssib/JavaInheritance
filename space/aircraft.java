//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */

package space;
import  vehicle.* ;
import wheeled_transportation.wheeled_transportaion;

public class aircraft extends vehicle {
    protected double price ;
    protected double elevation ;

    /**
     * default constructor
     */
    public aircraft(){
        this.elevation = 0 ;
        this.price = 0 ;
    }

    /**
     * param constructor
     * @param price
     * @param elevation
     */
    public aircraft(double price , double elevation){
        this.elevation = elevation ;
        this.price = price ;
    }

    /**
     * copy constructor
     * @param a
     */
    public aircraft(aircraft a){
        this.price = a.getPrice();
        this.elevation = a.getElevation() ;
    }



    //setters and getters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    /**
     * to string to do the informations of the aircraft
     * @return
     */
    public String toString() {
        return "this aircraft have a prive of " + this.price + " $ ,  and can elevate up to " +  this.elevation + " km";
    }


    /**
     * equal method
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        if (o == null){
            return false ;
        }
        else if (getClass() != o.getClass()){
            return false ;
        }
        else{
            aircraft o_casted = (aircraft) o;
            return ( o_casted.getPrice() == this.price && o_casted.getElevation() == this.elevation);
        }
    }


    public aircraft copy(){
        return new aircraft(this);
    }
}
