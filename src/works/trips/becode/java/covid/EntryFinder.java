package works.trips.becode.java.covid;

import java.util.List;
import java.util.Objects;

public class EntryFinder {
    void entryfinder(List<Trademodel> l,String country){
        for (Trademodel t : l){
            if(t.getYear()==2016) {
                if (Objects.equals(t.getCountry(), country) && (Objects.equals(t.getDirection(), "Imports") || Objects.equals(t.getDirection(), "Exports"))) {
                    System.out.println(t.getValue());
                }
            }
        }
    }
}
