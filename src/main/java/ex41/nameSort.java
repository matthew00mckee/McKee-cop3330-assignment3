/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class nameSort {
    public static void main(String[] args) {
        nameSort myName = new nameSort();
        fileReader myReader = new fileReader();
        sorter mySorter = new sorter();

        //creates a 2d array and reads in the names from the file
        String[][] names = new String[7][2];
        names = myReader.getPeople(names);

        //checks the length of the array
        int length = myName.getLength(names);

        //sorts the 2D array by last name
        names = mySorter.sort(names, length);

        //prints out the array to a text file
        myName.output(names, length);
    }
    public void output(String[][] names, int length) {
        //creates a new file
        try {
            File newFile = new File("./src/main/java/ex41/exercise41_output.txt");
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //writes the names to the file
        try {
            FileWriter myWriter = new FileWriter("./src/main/java/ex41/exercise41_output.txt");
            myWriter.write("Total of " + length + " names\n");
            myWriter.write("-----------------\n");
            for (int i = 0; i < length; i++) {
                myWriter.write(names[i][0]);
                myWriter.write(", " + names[i][1] + "\n");
            }
            myWriter.close();//closes the file writer
        } catch (IOException e) {
            //this tells us if the output failed as a check
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public int getLength(String[][] names) {
        return names.length;
    }
}
