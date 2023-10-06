package division.b;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;


public class task07_SNTPTest {
    private static File input;
    private static File input2;
    private static File input3;
    private static File input4;


    @BeforeClass
    public static void beforeClass() throws IOException {
        input = new File("pop").getAbsoluteFile();
        FileWriter write = new FileWriter(input);
        write.write("123");
        write.close();
        input.getAbsoluteFile().delete();
    }

    @Test
    public void test1 () {
    }

}