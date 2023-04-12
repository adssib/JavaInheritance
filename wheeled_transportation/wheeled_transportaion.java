//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */

package wheeled_transportation;
import vehicle.* ;
public class wheeled_transportaion extends vehicle{
    protected int number_wheeled ;
    protected double max_speed ;


    /**
     * default constructor
     */
    public wheeled_transportaion() {
        this.max_speed = 0 ;
        this.number_wheeled = 0 ;
    }

    /**
     * parametrised constructor
     * @param number_wheeled
     * @param max_speed
     */
    public wheeled_transportaion( int number_wheeled, double max_speed ) {
        this.max_speed = max_speed ;
        this.number_wheeled = number_wheeled ;
    }

    /**
     * copy constructor
     */
    public wheeled_transportaion(wheeled_transportaion w) {
        this.max_speed = w.getMax_speed() ;
        this.number_wheeled = w.getNumber_wheeled() ;
    }

    // setters and getters

    /**
     *
     * @param max_speed
     */
    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }

    /**
     *
     * @param number_wheeled
     */
    public void setNumber_wheeled(int number_wheeled) {
        this.number_wheeled = number_wheeled;
    }

    /**
     *
     * @return
     */
    public int getNumber_wheeled() {
        return number_wheeled;
    }

    /**
     *
     * @return
     */
    public double getMax_speed() {
        return max_speed;
    }


    //toString method
    /**
     * @return a string of information of this wheeled transportation
     */
    public String toString(){
        return "this wheeled transport have a macimum speed of " + this.max_speed + " km/h, and " + this.number_wheeled + " number of wheel" ;
    }

    //isequal method
    /**
     *
     * equal function we start by taking any object
     * and then we cast it and we compare them
     */
    public boolean equals(Object o){
        if (o == null){
            return false ;
        }
        else if (getClass() != o.getClass()){
            return false ;
        }
        else{
            wheeled_transportaion o_casted = (wheeled_transportaion) o;
            return ( o_casted.getNumber_wheeled() == this.number_wheeled && o_casted.getMax_speed() == this.max_speed);
        }
    }


    public wheeled_transportaion copy(){
        return new wheeled_transportaion(this);
    }

}
