package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class fileReaderTest {
    @Test
    void Replace_Test(){
        String filePath = "C:\\COP3330\\McKee-cop3330-assignment3\\src\\main\\java\\ex45\\";

        String in ="";
        String Test = fileReader.getInput(in);
        String test = wordFinder.replaceInput(Test);
        String expected= "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n";

        assertEquals(expected, test);
    }

}