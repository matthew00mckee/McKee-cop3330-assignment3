/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex41;

public class sorter {
    public String[][] sort(String[][] person, int length) {
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (person[j][0].compareTo(person[j + 1][0]) > 0) {
                    String temp = person[j][1];
                    person[j][1] = person[j + 1][1];
                    person[j + 1][1] = temp;
                    temp = person[j][0];
                    person[j][0] = person[j + 1][0];
                    person[j + 1][0] = temp;
                } else if ((person[j][0].compareTo(person[j + 1][0]) == 0))
                    if ((person[j][1].compareTo(person[j + 1][1]) > 0)) {
                        String temp = person[j][1];
                        person[j][1] = person[j + 1][1];
                        person[j + 1][1] = temp;
                        temp = person[j][0];
                        person[j][0] = person[j + 1][0];
                        person[j + 1][0] = temp;
                    }
        return person;
    }
}
