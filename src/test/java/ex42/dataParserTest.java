package ex42;

import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class parseDataTest extends TestCase {
    @Test
    void waitUntilComma1() {
        fileReader myReader = new fileReader();
        dataParser myParser = new dataParser();

        ArrayList<String> initial = new ArrayList<>();
        initial = myReader.getInput(initial);

        String actual = myParser.waitUntilComma(0, initial, 0);
        String expected = "Ling";

        assertEquals(actual, expected);
    }

    @Test
    void waitUntilComma2() {
        fileReader myReader = new fileReader();
        dataParser myParser = new dataParser();

        ArrayList<String> initial = new ArrayList<>();
        initial = myReader.getInput(initial);

        String actual = myParser.waitUntilComma(5, initial, 0);
        String expected = "Mai";

        assertEquals(actual, expected);
    }

    @Test
    void waitUntilComma3() {
        fileReader myFileReader = new fileReader();
        dataParser myDataParser = new dataParser();

        ArrayList<String> initial = new ArrayList<>();
        initial = myFileReader.getInput(initial);

        String actual = myDataParser.waitUntilComma(9, initial, 0);
        String expected = "55900";

        assertEquals(actual, expected);
    }
}
