package works.trips.becode.java.covid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {


    public Set<String> uniquesCommodity(List<Trademodel> list){
        Set<String> result = new HashSet<>();
        for (Trademodel t:list){
            result.add(t.getCommodity());


        }
        return result;
    }
    //Could go rewrite that method for other get calls
}
