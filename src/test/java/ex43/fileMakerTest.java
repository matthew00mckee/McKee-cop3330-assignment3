package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fileMakerTest {
    @Test
    void is_website_Generated () {
        fileMaker website = new fileMaker();
        boolean expected = true;

        assertEquals(expected, website.webGen("y", "y","Matthew","HappyDad"));
    }
    @Test
    void website_not_Generated (){
        fileMaker website = new fileMaker();
        boolean expected = false;

        assertEquals(expected, website.webGen("y", "y","Matthew","HappyDad"));
    }
}