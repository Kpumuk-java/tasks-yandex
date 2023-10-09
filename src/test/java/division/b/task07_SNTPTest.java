package division.b;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class task07_SNTPTest {
    private static File input;
    private static File input2;
    private static File input3;
    private static File input4;


    @AfterClass
    public static void afterClass() {
        input.getAbsoluteFile().delete();
        input2.getAbsoluteFile().delete();
        input3.getAbsoluteFile().delete();
        input4.getAbsoluteFile().delete();
    }

    @Test
    public void test1 () {
        task07_SNTP task07_sntp = new task07_SNTP();
        assertEquals("00:09:45", task07_sntp.start(input));
        assertEquals("18:10:05", task07_sntp.start(input2));
        assertEquals("00:00:00", task07_sntp.start(input3));
        System.out.println(task07_sntp.start(input4));
        assertEquals("05:59:28", task07_sntp.start(input4));
    }

    @BeforeClass
    public static void beforeClass() throws IOException {
        input = new File("out1").getAbsoluteFile();
        FileWriter write = new FileWriter(input);
        write.write("15:00:00\n");
        write.write("18:09:45\n");
        write.write("03:00:00");
        write.close();
        input2 = new File("out2").getAbsoluteFile();
        write = new FileWriter(input2);
        write.write("15:01:00\n");
        write.write("18:09:45\n");
        write.write("15:01:40");
        write.close();
        input3 = new File("out3").getAbsoluteFile();
        write = new FileWriter(input3);
        write.write("15:01:03\n");
        write.write("23:31:31\n");
        write.write("15:58:01");
        write.close();
        input4 = new File("out4").getAbsoluteFile();
        write = new FileWriter(input4);
        write.write("15:01:03\n");
        write.write("18:00:00\n");
        write.write("15:00:00");
        write.close();
    }

}