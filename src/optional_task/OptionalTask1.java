package optional_task;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class OptionalTask1 {
    public static void main(String[] args) {


        File fileRead = new File("src\\resources\\songReadOptionalTask1.txt");

        File fileWrite = new File("src\\resources\\songWriteOptionalTask1.txt");

        String lineRead = null;


        if (fileRead.exists()) {
            System.out.println("The file to read was successfully found" );
        } else {
            System.out.println("Check, if the path to the file is correct");
        }



        LinkedList<String> linkedList = new LinkedList<>();

        try (FileReader fileReader = new FileReader(fileRead); BufferedReader bufferedReader = new BufferedReader(fileReader); FileWriter fileWriter = new FileWriter(fileWrite); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {



            while ((lineRead =  bufferedReader.readLine()) != null) {
                System.out.println("Reading the lyrics..");
                linkedList.add(lineRead);
            }


            if (!linkedList.isEmpty()) {
                System.out.println("The lyrics was successfully read!" + "\n");
            }

            System.out.println("Getting ready to write the lyrics to the file" + "\n");


            ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());


            while (listIterator.hasPrevious()) {
                System.out.println("Writing the lyrics to the given file..");
                bufferedWriter.write(listIterator.previous() + "\n");
            }

                System.out.println("The lyrics was successfully written!");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
