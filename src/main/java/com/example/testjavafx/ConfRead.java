package com.example.testjavafx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfRead {
    private static String SOME_STRING_VALUE;

    public static String getSomeStringValue() {
        return SOME_STRING_VALUE;
    }

    public ConfRead() throws IOException
    {
        Properties props = new Properties();
        props.load(new FileInputStream(new File("config.txt")));
        SOME_STRING_VALUE = props.getProperty("SOME_STRING_VALUE");

        //System.out.print(SOME_STRING_VALUE);


    }

    public static void main(String[] args) throws IOException
    {
        new ConfRead();
    }
}
