//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */
package ferry;
import space.WWIIairoplane;
import space.aircraft;
import vehicle.* ;
public  class ferry extends vehicle {

    protected double speed ;
    protected double load ;

    /**
     * default constructor
     */
    public ferry() {
        this.speed = 0;
        this.load = 0;
    }



    /**
     * copy constructor
     * @param f
     */
    public ferry(ferry f ) {
        this.speed = f.getSpeed();
        this.load = f.getLoad();
    }

    /**
     * param constructor
     * @param speed
     * @param load
     */
    public ferry(double speed, double load) {
        this.speed = speed;
        this.load = load;
    }


    /**
     * getters and setters
     */
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    /**
     * toString to display the information of the ferry
     * @return
     */
    public String toString() {
        return "this is a ferry that have a speed of " +  this.speed  + " km/h and have a load of " + this.load + " kg! " ;
    }


    /**
     * is equal method
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
            ferry o_casted = (ferry) o;
            return ( o_casted.getLoad() == this.load && o_casted.getSpeed() == this.speed);
        }    }




    public ferry copy(){
        return new ferry(this);
    }
}
