/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class dataParser {
    public ArrayList<Map<String, String>> deleteCommas(ArrayList<String> initial, ArrayList<Map<String, String>> data) {
        int length = initial.size();
        for(int i = 0; i < length; i++)
        {
            //new hashmap and counter
            HashMap<String, String> newMap = new HashMap<>();
            int currentPosition = 0;

            //stores first name - ,
            newMap.put("First Name", waitUntilComma(currentPosition, initial, i));
            currentPosition += newMap.get("First Name").length() + 1;

            //stores last name - ,
            newMap.put("Last Name", waitUntilComma(currentPosition, initial, i));
            currentPosition += newMap.get("Last Name").length() + 1;

            //stores salary
            newMap.put("Salary", waitUntilComma(currentPosition, initial, i));

            //adds data to list of maps
            data.add(newMap);
        }
        //returns the list of maps
        return data;
    }

    public String waitUntilComma(int Position, ArrayList<String> initial, int i) {
        String newString = "";
        for(int count = Position; ((count < initial.get(i).length()) && (initial.get(i).charAt(count) != ',')); count++)
        {
            newString += initial.get(i).charAt(count);
        }
        return newString;
    }
}
