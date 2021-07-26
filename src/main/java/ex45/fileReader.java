/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {
    public static String getInput(String input) {
        try {
            File myFile = new File("C:\\COP3330\\McKee-cop3330-assignment3\\src\\main\\java\\ex45\\ex45_input.txt");
            Scanner Input = new Scanner(myFile);
            while (Input.hasNextLine()) { //add lines to input
                input += Input.nextLine() + "\n";
            }
            Input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }
}
