package ex41;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class nameSortTest extends TestCase {
    @Test
    void getLength7() {
        nameSort myApp = new nameSort();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Jones", "Aaron"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"}
        };
        int expected = 7;
        int actual = myApp.getLength(people);
        assertEquals(expected,actual);
    }

    @Test
    void getLength6() {
        nameSort myApp = new nameSort();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Jones", "Aaron"},
                {"Swift", "Geoffrey"},

        };
        int expected = 6;
        int actual = myApp.getLength(people);
        assertEquals(expected,actual);
    }
}