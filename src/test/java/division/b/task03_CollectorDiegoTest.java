package division.b;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class task03_CollectorDiegoTest {

    @Test
    public void testInputText () {
        task03_CollectorDiego task03_collectorDiego = new task03_CollectorDiego();
        String input = "add 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("add 5", task03_collectorDiego);
    }

}