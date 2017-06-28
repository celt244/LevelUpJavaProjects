import com.sun.org.apache.xpath.internal.SourceTree;
import ua.dp.levelup.Citizen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    /* Input/OutputStream */

    public static void main(String[] args) throws IOException {

//        OutputStream out = new FileOutputStream("file.txt");
//        out.write("Hello World!\r\nIt's a miracle".getBytes());
//        out.close();

//        String fileName = "file.txt";
//        String data = "data";
//////////////////////////////////
        List<Citizen> list = reedCSV("citizen.csv");
        System.out.println(list);
//////////////////////////////////
//
//        String fileName = "input.txt";
//        String fileData = readFromFile(fileName);
//        System.out.println(fileData);
//
//        writeToFile(fileData, "output.txt");
//
//    }
//
//    public static String readFromFile (String fileName) throws IOException {
//        InputStream input = new FileInputStream(fileName);
//        StringBuilder result = new StringBuilder();
//        int data = -1;
//        while ((data = input.read()) >=0) {
//            result.append((char)data);
//        }
//        input.close();
//        return result.toString();
//
//    }
//
//    public static void writeToFile (String data, String fileName)  {
//        try ( Writer out = new FileWriter(fileName);){
//            out.write(data.toUpperCase());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
    }



    //////////////////////////////////////////////////////////

    public  static List<Citizen> reedCSV (String fileName) {
        List<Citizen> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("id")) continue;

                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");

                long id = scanner.nextLong();
                String fName = scanner.next();
                String lName = scanner.next();
                int age = scanner.nextInt();
                list.add(new Citizen(id, fName, lName,age));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
