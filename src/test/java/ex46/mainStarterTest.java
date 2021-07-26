package ex46;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class mainStarterTest {
    @Test
    void frequency_Test(){
        String filePath = "C:\\COP3330\\McKee-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";

        String expectedOutput = "badger: *******\nmushroom: **\nsnake: *\n";
        String actualOutput = ScanAndPrint.printing(ScanAndPrint.scanning(filePath));

        assertEquals(expectedOutput, actualOutput);
    }
}