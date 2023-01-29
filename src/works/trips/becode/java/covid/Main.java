package works.trips.becode.java.covid;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    CsvMapper mapper = new CsvMapper();
    List<Trademodel> l = mapper.processInputFile("effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv");
        //System.out.println(l);
        System.out.println("Done");

        for (Trademodel t:l
             ) {
            System.out.println();
            System.out.println("#########################");
            System.out.println();
            System.out.println(t.getCommodity());
            System.out.println(t.getCountry());
            System.out.println(t.getDirection());
            System.out.println(t.getDay());
            System.out.println(t.getCumulative());
            System.out.println(t.getMeasure());
            System.out.println(t.getYear());


        }
        UniqueFinder finder = new UniqueFinder();
        System.out.println(finder.uniquesCommodity(l));
    }
}
