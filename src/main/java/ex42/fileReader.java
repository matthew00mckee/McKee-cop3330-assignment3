/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileReader {
    public ArrayList<String> getInput(ArrayList<String> initial) {
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex42/exercise42_input.txt");
            Scanner input = new Scanner(myFile);
            while (input.hasNextLine()) { //remove commas from strings
                initial.add(input.nextLine());
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return initial;
    }
}
