//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */
package heavy_rail;
import metro.* ;
import wheeled_transportation.wheeled_transportaion;

public class tram extends metro{

    protected int year_creation ;



    /**
     * default constructor
     */
    public tram() {
        super(); 
        this.year_creation = 0;
    }

    /**
     * copy constructor
     */
    public tram(tram t){
        this.year_creation = t.getYear_creation() ;
        this.max_speed= t.getMax_speed() ;
        this.number_wheeled = t.getNumber_wheeled() ;
        this.ending_station = t.getEnding_station() ;
        this.starting_station = t.getStarting_station() ;
        this.number_vehicle  = t.getNumber_vehicle()  ;
        this.total_stops = t.getTotal_stops() ;
    }


    /**
     * parametrized constructor
     * @param number_wheeled
     * @param max_speed
     * @param number_vehicle
     * @param starting_station
     * @param ending_station
     * @param total_stops
     * @param year_creation
     */
    public tram(int number_wheeled, double max_speed, int number_vehicle, String starting_station, String ending_station, int total_stops, int year_creation) {
        super(number_wheeled , max_speed, number_vehicle, starting_station, ending_station, total_stops);
        this.year_creation = year_creation;
    }


    //getter and setter
    public int getYear_creation() {
        return year_creation;
    }

    public void setYear_creation(int year_creation) {
        this.year_creation = year_creation;
    }


    //to string and equals method
    public boolean equals(Object o){
        if (o == null){
            return false ;
        }
        else if (getClass() != o.getClass()){
            return false ;
        }
        else{
            tram o_casted = (tram) o;
            return (number_wheeled == o_casted.getNumber_wheeled() && //this is int
                    o_casted.getMax_speed() == this.max_speed &&
                    o_casted.getNumber_vehicle() == this.number_vehicle &&
                    o_casted.getStarting_station().equals(starting_station) &&
                    o_casted.getEnding_station().equals(ending_station));
        }
    }

    /**
     *
     * @return the information of this train
     */
    public String toString() {
        return "this tram have  a maximum speed of " +this.max_speed  + " km/h and have also " +
                this.number_vehicle + " number of vehicle .It start form "+ this.starting_station + " and ends in "
                + this.ending_station  + " . ALso have a number of wheeled " + this.number_wheeled + " and was created back in "+
                this.year_creation;
    }



    public tram copy(){
        return new tram(this);
    }
}
