package optional_task;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class OptionalTask4 {
    public static void main(String[] args) {


        File file = new File("src\\resources\\songReadOptionalTask3.txt");

        if (file.exists()) {
            System.out.println("The file to read was successfully found");
        } else {
            System.out.println("Check, if the path to the file is correct");
        }

        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            LinkedList<String> song = new LinkedList<>();
            String songLine = null;
            while ((songLine = bufferedReader.readLine()) != null) {
                song.add(songLine);
            }

            System.out.println("The file content is: " + "\n");

            for (int i = 0; i < song.size(); i++) {
                System.out.println(song.get(i));
            }


          PersonalComparator personalComparator = new PersonalComparator();

            Collections.sort(song,personalComparator);
            System.out.println("\n" + "===== AFTER SORTING =====" + "\n");


            for (int i = 0; i < song.size(); i++) {
                System.out.println(song.get(i));
            }






        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class PersonalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        }

        else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}


