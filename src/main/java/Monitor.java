import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Monitor {

  static final String SRCLISTFILE = "src/main/resources/country.csv";


  public static void main(String[] args) throws IOException, CsvException {

    List<String[]> r;
    try (CSVReader csvReader = new CSVReader(new FileReader(SRCLISTFILE))) {
      r = csvReader.readAll();
    }

    int listIndex = 0;
    for (String[] arrays : r) {
      System.out.println("\nString[" + listIndex++ + "] : " + Arrays.toString(arrays));

      int index = 0;
      for (String array : arrays) {
        System.out.println(index++ + " : " + array);
      }
    }
  }
}
