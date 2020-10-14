package Lab9;

import java.io.File;
import java.io.IOException;

public class ExCreateFile {
    public static void main(String[] args) {
        File myFile = new File("exFile.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("Created file is successful.");
            } else {
                System.out.println("can not create file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
