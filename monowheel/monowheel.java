//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */
package monowheel;
import wheeled_transportation.* ;
public class monowheel extends wheeled_transportaion {
    protected double weight;

    /**
     * default constructor
     */
    public monowheel() {
        super();
        this.weight = 0 ;
    }

    /**
     * param constructor
     * @param a
     * @param b
     * @param c
     */
    public monowheel(int a , double b ,double c){
        this.max_speed = b ;
        this.number_wheeled = a;
        this.weight = c ;

    }

    /**
     *
     * copy constructor
     * @param m
     */
    public monowheel(monowheel m){
        this.number_wheeled = m.getNumber_wheeled()  ;
        this.max_speed  = m.getMax_speed() ;
        this.weight = m.getWeight();

    }


    //getters and setters
    public void setWeight(double a){
        this.weight = a ;
    }
    public double getWeight(){
        return this.weight ;
    }

    /**
     * to string gives the info
     * @return
     */
    public String toString(){
        return "this monowheel  have a speed of "+ this.max_speed   +
                " and have a weight of " + this.weight  + " and have " + this.number_wheeled + " number of wheeled!" ;
    }


    /**
     * equlase to return if 2 objects are equal or not
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
            monowheel o_casted = (monowheel) o;
            return ( o_casted.getNumber_wheeled() == this.number_wheeled && o_casted.getMax_speed() == this.max_speed );

        }



}


    public monowheel copy(){
        return new monowheel(this);
    }

}