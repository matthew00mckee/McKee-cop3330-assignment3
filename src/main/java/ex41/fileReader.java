/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {
    public String[][] getPeople(String[][] person) {
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex41/exercise41Input.txt");
            Scanner in = new Scanner(myFile);
            int i = 0;
            while (in.hasNextLine()) { //remove commas from strings
                String data = in.next();
                data = data.substring(0, data.length() - 1);
                person[i][0] = data;
                data = in.next();
                person[i][1] = data;
                i++;
            }
            in.close();//closes the file
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return person;
    }
}
