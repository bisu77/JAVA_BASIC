import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_13 {
    public static void main(String[] args) throws Exception{
        String filename = "mycsv.csv";
        List<String[]> data = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader(filename));
        // UTF-8
        // CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"), ",", '"', 1);
        String[] s;
        while ((s = reader.readNext()) != null) {
            data.add(s);
        }
    }
}
