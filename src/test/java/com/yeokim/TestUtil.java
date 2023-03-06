package com.yeokim;

import java.io.*;
import java.util.Scanner;

public class TestUtil {
    public static Scanner genScanner(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());

        return new Scanner(in);
    }

    public static ByteArrayOutputStream setOutToByteArray() {
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        return output;
    }

    public static void clearSetOutToByteArray(ByteArrayOutputStream outputStream) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        try {
            outputStream.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
