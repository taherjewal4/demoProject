package fileReading.readerpkg;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadingClass {

    public static void main(String[] args) throws Exception {

        // write into a file?
        String str = readFile("/Users/jewal/Desktop/learning/demoProject/src/read.txt");
        System.out.println(str);
    }

    public static String readFile(String filePath) {
        String finalstr = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String str = "";

            while ((str = br.readLine()) != null) {
                finalstr = finalstr + str;
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return finalstr;
    }
}
