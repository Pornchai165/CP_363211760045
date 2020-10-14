package exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Lab9_2 {
    public static void main(String[] args) {


        File myFile = new File("programming.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("Created file is successful.");
            } else {
                System.out.println("can not create file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //getName()
        System.out.println("File name is "+myFile.getName());
        //getPath()
        System.out.println("Path file is "+myFile.getPath());
        //rendNameTo()
        File rFile = new File("computer.txt");
        if (myFile.renameTo(rFile)) {
            System.out.println("File name is already changed");
        } else {
            System.out.println("Can not change file name");
        }


        Path pFile = Paths.get("computer.txt");

        try {
            BufferedWriter writer = Files.newBufferedWriter(pFile,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);

            for (int i = 1; i <= 10; i++) {
                writer.write("5+5 = 10");
                writer.newLine();
            }


            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IOException : " + e.getMessage());
        }









    }
}
