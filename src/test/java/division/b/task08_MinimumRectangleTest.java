package division.b;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class task08_MinimumRectangleTest {
    private static File input;
    private static File input2;

    @BeforeClass
    public static void beforeClass () throws IOException {
        input = new File("out1").getAbsoluteFile();
        FileWriter write = new FileWriter(input);
        write.write("3\n1 1\n5 5\n1 10");
        write.flush();
        write.close();
        input2 = new File("out2").getAbsoluteFile();
        write = new FileWriter(input2);
        write.write("1\n1 1");
        write.flush();
        write.close();
    }

    @Test
    public void test1 () {
        task08_MinimumRectangle task08_minimumRectangle = new task08_MinimumRectangle();
        assertEquals("1 1 5 10", task08_minimumRectangle.start(input));
        System.out.println(task08_minimumRectangle.start(input2));
        assertEquals("1 1 1 1", task08_minimumRectangle.start(input2));
    }

    @AfterClass
    public static void afterClass () {
        input.getAbsoluteFile().delete();
    }

}