package ex41;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sorterTest extends TestCase {
    @Test
    void sort7() {
        sorter mySorter = new sorter();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Jones", "Aaron"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"}
        };
        String[][] expected = {
                {"Johnson", "Jim"},
                {"Jones", "Aaron"},
                {"Jones", "Chris"},
                {"Ling", "Mai"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"},
                {"Zarnecki", "Sabrina"}
        };
        String[][] actual = mySorter.sort(people, 7);
        assertArrayEquals(expected,actual);
    }

    @Test
    void sort8() {
        sorter mySorter = new sorter();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Jones", "Aaron"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"},
                {"Amy", "Butler"}
        };
        String[][] expected = {
                {"Amy", "Butler"},
                {"Johnson", "Jim"},
                {"Jones", "Aaron"},
                {"Jones", "Chris"},
                {"Ling", "Mai"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"},
                {"Zarnecki", "Sabrina"}
        };
        String[][] actual = mySorter.sort(people, 8);
        assertArrayEquals(expected,actual);
    }
}