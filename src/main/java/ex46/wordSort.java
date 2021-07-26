package ex46;

import java.util.Comparator;
import java.util.*;

public class wordSort implements Comparator{
        public int compare(Object o1, Object o2) {
            //since .values() only return an array of existing values for map, cast will be needed and method will need to access element 0.

            Map<String, Integer> location1 = (Map<String, Integer>) o1;
            int add1 = (int) location1.values().toArray()[0];

            Map<String, Integer> location2 = (Map<String, Integer>) o2;
            int add2 = (int) location2.values().toArray()[0];

            return add2 - add1; //returns to sort in descending order.
        }
}
