package com.javarush.task.task18.task1812;

import java.io.*;
import java.util.Scanner;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream o;

    @Override
    public void flush() throws IOException {
        o.flush();
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

    public QuestionFileOutputStream(AmigoOutputStream o) {
        this.o = o;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();

        if (answer.equals("Д")) {
            reader.close();
            o.close();
        }


    }
}

