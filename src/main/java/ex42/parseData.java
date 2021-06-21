/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex42;

import java.util.ArrayList;
import java.util.Map;

public class parseData {
    public static void main(String[] args) {
        parseData myData = new parseData();
        fileReader myReader = new fileReader();
        dataParser myParser = new dataParser();

        //read in inputs and store each as list
        ArrayList<String> initial = new ArrayList<>();
        initial = myReader.getInput(initial);

        //read strings, divide parts, and store in list of maps
        ArrayList<Map<String,String>> data = new ArrayList<>();
        data = myParser.deleteCommas(initial, data);

        //output list of maps
        myData.printOutput(data);
    }

    private void printOutput(ArrayList<Map<String, String>> data) {
        System.out.println("    Last |    First | Salary");
        System.out.println("----------------------------");
        for(int i = 0; i < data.size(); i++)
        {
            System.out.printf("%8s | %8s | %6s\n", data.get(i).get("First Name"),
                    data.get(i).get("Last Name"), data.get(i).get("Salary"));
        }
    }
}
