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

public class WWIIairoplane extends aircraft{
    protected boolean twin_engine ;


    /**
     * default constructor
     */
    public WWIIairoplane() {
        this.twin_engine = true;
    }

    /**
     * param constructor
     * @param price
     * @param elevation
     * @param twin_engine
     */
    public WWIIairoplane(double price, double elevation, boolean twin_engine) {
        super(price, elevation);
        this.twin_engine = twin_engine;
    }

    /**
     * copy constructor

     */
    public WWIIairoplane(WWIIairoplane w) {
        this.elevation = w.elevation ;
        this.price = w.price ;
        this.twin_engine = w.twin_engine;
    }



    public String toString() {
        if(this.twin_engine ==true){
            return "this ww2 does have an aircraft and have " + this.price + " $ and can elevate up to " + this.elevation + "\n";
        }
        else{
            return "this ww2 doesnot have an aircraft and have " + this.price + " $ and can elevate up to " + this.elevation + "\n";


        }
    }



    public WWIIairoplane copy(){
        return new WWIIairoplane(this);
    }
}
