//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------

package heavy_rail;
import wheeled_transportation.* ;
public class train extends wheeled_transportaion{
    protected int number_vehicle ;
    protected String starting_station ;
    protected String ending_station ;

    /**
     * default constructor
     */
    public train() {
        super() ;
        this.number_vehicle = 0;
        this.starting_station = "";
        this.ending_station = "";
    }

    /**
     * parametrised constructor
     *
     * @param b
     * @param a
     */
    public train(int number_wheeled, double max_speed, int number_vehicle, String starting_station, String ending_station) {
        super(number_wheeled, max_speed);
        this.number_vehicle = number_vehicle;
        this.starting_station = starting_station;
        this.ending_station = ending_station;
    }

    /**
     * copy constructor
     *
     * @param w
     */
    public train(train t ) {
        this.number_wheeled = t.getNumber_wheeled() ;
        this.max_speed = t.getMax_speed();
        this.number_vehicle = t.getNumber_vehicle();
        this.starting_station = t.getStarting_station();
        this.ending_station = t.getEnding_station();
    }

    //now we generate getters and setters

    public int getNumber_vehicle() {
        return number_vehicle;
    }

    public void setNumber_vehicle(int number_vehicle) {
        this.number_vehicle = number_vehicle;
    }

    public String getStarting_station() {
        return starting_station;
    }

    public void setStarting_station(String starting_station) {
        this.starting_station = starting_station;
    }

    public String getEnding_station() {
        return ending_station;
    }

    public void setEnding_station(String ending_station) {
        this.ending_station = ending_station;
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
            train o_casted = (train) o;
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
        return "this train have  a maximum speed of " +this.max_speed  + " km/h and have also " +
                this.number_vehicle + " number of vehicle .It start form "+ this.starting_station + " and ends in "
                + this.ending_station  + " . ALso have a number of wheeld " + this.number_wheeled;
    }



    public train copy(){
        return new train(this);
    }

}

