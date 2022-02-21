package optional_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask5 {
    public static void main(String[] args) {

        File file = new File("src\\resources\\songReadOptionalTask5.txt");

        if (file.exists()) {
            System.out.println("The file to read was successfully found" );
        } else {
            System.out.println("Check, if the path to the file is correct");
        }

        ArrayList<String> song = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                song.add(scanner.nextLine());
            }

            System.out.println("The file content is: " + "\n");

            for (int i = 0; i < song.size(); i++) {
                System.out.println(song.get(i));
            }

            System.out.println("\n" + "===== AFTER SORTING =====" + "\n");

            Collections.sort(song);


            for (int i = 0; i < song.size(); i++) {
                System.out.println(song.get(i));
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
