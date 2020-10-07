package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;

        File file = new File("D:/MyName.txt");

        fr = new FileReader(file);
        char[] txt = new char[50];
        fr.read(txt);

        for (char c:txt){
            System.out.print(c);
        }







    }
}
