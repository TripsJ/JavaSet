package works.trips.becode.java.covid;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class CsvToMap {


    String inputFilePath = "";

    public CsvToMap(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    List<Map<String,String>> mapFile(){
        int counter = 0;
        Map <String, String> result;
        List<Map<String,String>> dict = new ArrayList<>();
        try{

            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
            String line;
            String[] keys = new String[0];
            while((line = br.readLine()) !=null){
                 //no need to be public or static, may as well be private
                // Regex string used to split the csv lines
                final String delimiter = ",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
                String[] entry = line.split(delimiter,-1);
                //parse line
                if (counter == 0){
                    keys = entry;
                }
                else{
                    result = new HashMap<String, String>();
                    for (int i = 0; i < entry.length; i++) {
                        result.put(keys[i], entry[i]);

                    }
                    dict.add(result);
                }
                counter++;


            }


        }
        catch (IOException e){
            e.printStackTrace();
        }

        return dict;
    }

}
