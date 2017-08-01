import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CountriesTextFile {
    public CountriesTextFile(String abbreviation, String name) {
    }
    public static void main(String[] args) {

        ArrayList<CountriesTextFile> countryArrayList = new ArrayList<>();
        countryArrayList.add(new CountriesTextFile( "AF", "Afghanistan"));
        countryArrayList.add(new CountriesTextFile( "AD", "Andorra"));
        countryArrayList.add(new CountriesTextFile( "AQ", "Antarctica"));
        countryArrayList.add(new CountriesTextFile( "AM", "America"));
        countryArrayList.add(new CountriesTextFile( "AT", "Austria"));
//        countryArrayList.add(new CountriesTextFile( "BH", "Bahrain"));

        writeToFile();
        readFromFile();
    }
        private static void writeToFile() {
            File myFile = new File("countries.txt");

            Scanner scan = new Scanner(System.in);

            try {
                PrintWriter p = new PrintWriter(new FileOutputStream(myFile, true));
                String countryArrayList = "";
                System.out.println(countryArrayList);
            //    String input = scan.nextLine();
            //    p.println();
            //    p.println(input);
                p.close();


            } catch (FileNotFoundException e) {
                System.out.println("File not found!!! :( ");
            }
    }

            private static String readFromFile() {
                File myFile = new File("countries.txt");
                String output = "";
                try {
                    FileReader reader = new FileReader(myFile);
                    BufferedReader bufReader = new BufferedReader(reader);
                    String line = bufReader.readLine(); //read the first line
                    while (line != null) {
                        System.out.println(line);
                        output = output + line +"\n";
                        line = bufReader.readLine(); //read the next line

                    }

                    bufReader.close();

                } catch (Exception e) {
                    System.out.println("File not found!");
                }
                return output;
            }










/*        File file = new File("countries.txt");

        try {
            PrintWriter output = new PrintWriter(file);
            output.println("countries.txt");
    //        output.println(...);
            output.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            String countries = input.nextLine();

            System.out.printf(countries);

        } catch (Exception e) {
            System.out.println("Error");
        }
    } */
    }
