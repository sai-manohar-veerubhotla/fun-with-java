package ca.javafunblog.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class FunWithIO {

    public static void main(String[] args) {
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname.
        // If the given string is the empty string,
        // then the result is the empty abstract pathname
        File csvFileWithHeader = new File("/Users/sai/Documents/GitHub/fun-with-java/ca/javafunblog/io/mock-csv.csv");
        File csvFileWithOutHeader = new File("/Users/sai/Documents/GitHub/fun-with-java/ca/javafunblog/io/mock-data-with-no-header.csv");
        List<String> rows = read(csvFileWithOutHeader, false);
//        rows.forEach(System.out::println);
        MyCsvFile myCsvFileWithHeader = readVersionTwo(csvFileWithHeader, true);
        myCsvFileWithHeader.headerRow.ifPresentOrElse(System.out::println,
                () -> System.out.println("No Header row Present"));
        myCsvFileWithHeader.dataRows.forEach(System.out::println);
        System.out.println("-----------------------------------------------");
        MyCsvFile myCsvFileWithNoHeader = readVersionTwo(csvFileWithOutHeader, false);
        myCsvFileWithNoHeader.headerRow.ifPresentOrElse(System.out::println,
                () -> System.out.println("No Header row Present"));
        myCsvFileWithNoHeader.dataRows.forEach(System.out::println);

    }

    /**
     * @param csvFile    a handle to a csv file
     * @param withHeader if the headers are present
     * @return returns the rows from the csv file.
     */
    private static List<String> read(File csvFile, boolean withHeader) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            return withHeader ? bufferedReader
                    .lines()
                    .skip(1)
                    .collect(Collectors.toList()) :
                    bufferedReader
                            .lines()
                            .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            System.out.println("File Not found!!!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Something bad occurred!!");
            throw new RuntimeException(e);
        }
    }

    private static MyCsvFile readVersionTwo(File csvFile, boolean withHeader) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            List<String> rows = bufferedReader.lines()
                    .collect(Collectors.toList());

            return withHeader ? new MyCsvFile(Optional.of(rows.get(0)), rows.subList(1, rows.size())) :
                    new MyCsvFile(Optional.empty(), rows);
        } catch (FileNotFoundException e) {
            System.out.println("File Not found!!!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Something bad occurred!!");
            throw new RuntimeException(e);
        }
    }


    static class MyCsvFile {
        Optional<String> headerRow;
        List<String> dataRows;

        public MyCsvFile(Optional<String> headerRow, List<String> dataRows) {
            this.headerRow = headerRow;
            this.dataRows = dataRows;
        }
    }


}
