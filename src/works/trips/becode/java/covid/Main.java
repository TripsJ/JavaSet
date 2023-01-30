package works.trips.becode.java.covid;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    CsvMapper mapper = new CsvMapper();
    List<Trademodel> l = mapper.processInputFile("subset.csv");
        //System.out.println(l);
        System.out.println("Done");

        /*for (Trademodel t:l
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


        }*/
        UniqueFinder finder = new UniqueFinder();
        System.out.println(finder.uniquesCommodity(l));
        EntryFinder efinder = new EntryFinder();
        efinder.entryfinder(l,"All");
        efinder.valueConverter(0.85f,l);
        CsvToMap mapmaker = new CsvToMap("effects-of-covid-19-on-trade-at-21-July-2021-provisional.csv");
        //Returns a list of Hashmaps
        List<Map<String, String>> dict = mapmaker.mapFile();
        List<Integer> val = new ArrayList<Integer>();
        for(Map<String,String> e :dict){

            if(e.get("Direction").equals("Imports")&&e.get("Country").equals("All")&&e.get("Transport_Mode").equals("All")){
                    val.add(Integer.parseInt(e.get("Value")));

                }
            }
        Collections.sort(val);
        System.out.println( val);
        }
    }

