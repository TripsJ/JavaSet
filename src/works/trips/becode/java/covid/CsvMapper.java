package works.trips.becode.java.covid;


import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Function;


import static java.util.stream.Collectors.toList;

class CsvMapper{
     List<Trademodel> processInputFile(String inputFilePath) {

        List<Trademodel> inputList = new ArrayList<>();

        try{

            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            // skip the header of the csv
            inputList = br.lines().skip(1).map(mapToItem).collect(toList());
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        return inputList ;
    }

    private final Function<String, Trademodel> mapToItem = (line) -> {

        String[] p = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);// a CSV has comma separated lines

        Trademodel item = new Trademodel();
        //Direction,Year,Date,Weekday,Country,Commodity,Transport_Mode,Measure,Value,Cumulative
       //<-- this is the first column in the csv file
       item.setDirection(p[0]);
       item.setYear(Integer.parseInt(p[1]));
       item.setDate(p[2]);
       item.setDay(p[3]);
       item.setCountry(p[4]);
       item.setCommodity(p[5]);
       item.setTransport(p[6]);
       item.setMeasure(p[7]);
       item.setValue(p[8]);
       item.setCumulative(p[9]);


        /*
        item.setYear(Integer.parseInt(p[1]));*/

        return item;
    };
}

