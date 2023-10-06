package division.b;

import org.junit.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class task05_GoodLineTest {

    @Test
    public void test1 () {
        task05_GoodLine test = new task05_GoodLine();
        assertEquals(2, test.start(new File("src/main/resources/text/input.txt")));
        assertEquals(3, test.start(new File("src/main/resources/text/input2.txt")));
        assertEquals(7, test.start(new File("src/main/resources/text/input3.txt")));
        assertEquals(7, test.start(new File("src/main/resources/text/input4.txt")));
    }
}