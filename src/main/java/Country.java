import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Country {

  static final String SRCLISTFILE = "src/main/resources/country.csv";

  public static void main(String[] args) throws IOException, CsvException {

    //./././././././././././. to read or parse a CSV file.

    //   try (CSVReader reader = new CSVReader(new FileReader(SRCLISTFILE))) {
    //   List<String[]> r = reader.readAll();
    //   r.forEach(x -> System.out.println(Arrays.toString(x)));
    //  } catch (IOException | CsvException e) {
    //    e.printStackTrace();
    //  }
    // }


    ///././././././././././. how to parse CSV file using a custom separator ; and skip the first line.

    //  CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
    //  try (CSVReader reader = new CSVReaderBuilder(
    //      new FileReader(SRCLISTFILE))
    //      .withCSVParser(csvParser)   // custom CSV parser
    //      .withSkipLines(1)           // skip the first line, header info
    //      .build()) {
    //    List<String[]> r = reader.readAll();
    //    r.forEach(x -> System.out.println(Arrays.toString(x)));
    // }


    //././././././././././. read a CSV file and map it to a Country object via the @CsvBindByPosition.

    //  List<Country2> beans = new CsvToBeanBuilder(new FileReader(SRCLISTFILE)).withType(
    //          Country2.class)
    //      .build()
    //      .parse();
    //  beans.forEach(System.out::println);


    //././././././././././.CSV file containing header info, we also can use @CsvBindByName

    //  List<Country3> beans = new CsvToBeanBuilder(new FileReader(SRCLISTFILE)).withType(
    //          Country3.class)
    //      .build()
    //      .parse();
    //  beans.forEach(System.out::println);


    //././././././././././.Java 8 stream and split example to parse the above CSV file.

   //List<String[]> collect =
   //    Files.lines(Paths.get(SRCLISTFILE))
   //        .map(line -> line.split(","))
   //        .collect(Collectors.toList());
   //collect.forEach(x -> System.out.println(Arrays.toString(x)));
  }
}







