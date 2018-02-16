package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream o;

    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
        this.o = name;
    }


    @Override
    public void write(int b) throws IOException {
        o.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        o.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        o.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        o.flush();
    }

    @Override
    public void close() throws IOException {
        o.flush();
        String s = "JavaRush © All rights reserved.";
        byte[] ww = s.getBytes();
        o.write(ww);
        o.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
