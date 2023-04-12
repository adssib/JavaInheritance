//-------------------------------------------------------
//Assignment {2}
//Written by: {adib akkari Student ID:40216815 }
//For COMP 249 Section {Section QQ} - Winter 2023
//--------------------------------------------------------
/**
 * For COMP 249 Section {Section QQ} - Winter 2023 Assignment {1}
 * Due 11:59 PM â€“ Saturday, March 4th, 2023
 */

import ferry.ferry;
import heavy_rail.train;
import heavy_rail.tram;
import metro.metro;
import monowheel.monowheel;
import space.WWIIairoplane;
import space.aircraft;
import vehicle.* ;
import wheeled_transportation.wheeled_transportaion;

public class Main_2 {


    public static vehicle[] copyTheObjects(vehicle[] o){
        vehicle[] ob = new vehicle[o.length] ;
        for(int i=0 ; i<o.length ; i++){
            ob[i] = o[i].copy() ;
        }
        return ob;
    }
    public static void main_2(String[] args){

        /**
         * we start by initialising some values of objects
         */
        wheeled_transportaion wt1 = new wheeled_transportaion(20 , 400 ) ;
        wheeled_transportaion wt2 = new wheeled_transportaion(30 , 200) ;
        wheeled_transportaion wt3 = new wheeled_transportaion(wt1) ;
        /**
         * we initialized 2 parametrized constructor and 1 copy constructor
         * and will do so int the next few ones
         */

        train t1 = new train(50 , 600 , 15 , "montreal" , "ontario") ;
        train t2 = new train(40 , 700 , 20 , "tripoli" , "beirut") ;
        train t3 = new train(t2) ;

        tram tr1 = new tram(50 , 600 , 15 , "montreal" , "ontario" , 2 , 1999 ) ;
        tram tr2 = new tram(40 , 700 , 20 , "tripoli" , "beirut" , 1  , 1995) ;
        tram tr3 = new tram(tr2) ;

        metro green_metro = new metro(50 , 600 , 15 , "montreal" , "ontario" , 2 );
        metro orange_line = new metro(40 , 700 , 20 , "tripoli" , "beirut" , 1  ) ;
        metro blue_line = new metro( green_metro) ;

        monowheel mw1 = new monowheel(4000 , 200 , 14000);
        monowheel mw2 = new monowheel(3500 , 150 , 12000) ;
        monowheel mw3 = new monowheel(mw2) ;

        aircraft a1 = new aircraft(160000000 , 150000000) ;
        aircraft a2 = new aircraft(150000000 , 130000000) ;
        aircraft a3 = new aircraft(a2) ;

        WWIIairoplane w1 = new WWIIairoplane(160000000 , 150000000 , true) ;
        WWIIairoplane w2 = new WWIIairoplane(150000000 , 130000000 , false) ;
        WWIIairoplane w3 = new WWIIairoplane(w2) ;

        ferry f1 = new ferry(400 , 16000 ) ;
        ferry f2 = new ferry(300 , 15000 ) ;
        ferry f3 = new ferry(f2 ) ;

        vehicle[] w = {a1, a2, w1, w2, f1, f3,tr1,green_metro,tr2 ,wt2,wt3,orange_line, mw3 , a3};
        wheeled_transportaion[] array = { wt1, wt2, tr1, tr2, orange_line, blue_line, t1, t2, mw1, mw2};



        for(int i=0 ; i<w.length ; i++){
            System.out.println(w[i].toString()) ;
        }


        vehicle[] copies =copyTheObjects(w);


        for(int i=0 ; i<copies.length ; i++){
            System.out.println(copies[i].toString()) ;
        }




    }


}
