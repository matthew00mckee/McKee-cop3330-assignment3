package ex44;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Map;

public class JSONTest {
    @Test
    void Test_Widget_Availability (){
        String openFile = "C:\\COP3330\\mckee-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        ArrayList<Map<String, Object>> list =JSON.read(openFile);

        String expected = "Name: Widget | Price: 25.00 | Quantity: 5\r\n";
        String test = JSON.search(list, "widget");

        assertEquals(expected,test);
    }
    @Test
    void Test_Thing_Availability(){
        String openFile = "C:\\COP3330\\mckee-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        ArrayList<Map<String, Object>> list =JSON.read(openFile);

        String expected ="Name: Thing | Price: 15.00 | Quantity: 5\r\n";
        String test = JSON.search(list, "Thing");

        assertEquals(expected,test);
    }
    @Test
    void Test_Doodad_Availability(){
        String openFile = "C:\\COP3330\\mckee-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        ArrayList<Map<String, Object>> list =JSON.read(openFile);

        String expected ="Name: Doodad | Price: 5.00 | Quantity: 10\r\n";
        String test = JSON.search(list, "Doodad");

        assertEquals(expected,test);
    }
}