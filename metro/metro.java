//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */


package metro;
import heavy_rail.* ;
import wheeled_transportation.wheeled_transportaion;

public class metro extends train{

    protected int total_stops ;

    /**
     * default constructor
     */
    public metro() {
        super() ;
        this.total_stops = 0;
    }


    public metro(metro m){
        this.total_stops = m.getTotal_stops(); ;
        this.max_speed = m.getMax_speed() ;
        this.number_wheeled = m.getNumber_wheeled() ;
        this.starting_station = m.getStarting_station() ;
        this.ending_station = m.getEnding_station() ;
        this.number_vehicle = m.getNumber_vehicle() ;
    }

    /**
     * parametrized constructor
     * @param number_wheeled
     * @param max_speed
     * @param number_vehicle
     * @param starting_station
     * @param ending_station
     * @param total_stops
     */
    public metro(int number_wheeled , double max_speed , int number_vehicle, String starting_station, String ending_station, int total_stops) {
        super(number_wheeled , max_speed, number_vehicle, starting_station, ending_station);
        this.total_stops = total_stops;
    }


    //getter and setters
    public int getTotal_stops() {
        return total_stops;
    }

    public void setTotal_stops(int total_stops) {
        this.total_stops = total_stops;
    }

    /**
     *
     * @return the list of information of a train
     */
    public String toString() {
        return "this metro have  a maximum speed of " +this.max_speed  + " km/h and have also " +
                this.number_vehicle + " number of vehicle .It start form "+ this.starting_station + " and ends in "
                + this.ending_station  + " . ALso have a number of wheeld " + this.number_wheeled + " and also have" +
                " a " + this.total_stops  +" total stops. ";
    }

    /**
     *
     * @param o
     * @return if 2 objects are equal or not
     */
    public boolean equals(Object o){
        if (o == null){
            return false ;
        }
        else if (getClass() != o.getClass()){
            return false ;
        }
        else{
            metro o_casted = (metro) o;
            return (number_wheeled == o_casted.getNumber_wheeled() &&
                    o_casted.getMax_speed() == this.max_speed &&
                    o_casted.getNumber_vehicle() == this.number_vehicle &&
                    o_casted.getStarting_station() ==this.starting_station &&
                    o_casted.getEnding_station() == this.ending_station);
        }
    }



    public metro copy(){
        return new metro(this);
    }
}
