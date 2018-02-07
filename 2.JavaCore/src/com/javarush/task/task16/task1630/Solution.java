package com.javarush.task.task16.task1630;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        Scanner scan  = new Scanner(System.in);
        firstFileName = scan.nextLine();
        secondFileName = scan.nextLine();
    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        try {
            System.out.println(f.getFileContent());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws UnsupportedEncodingException;

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        ArrayList<String> list = new ArrayList<String>();
        String file;

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String s = reader.readLine();
                while (s != null) {
                    list.add(s);
                    s = reader.readLine();
                }
                reader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            file = fullFileName;
        }

        @Override
        public String getFileContent() {
            String s2 = "";
            for (String x : list) {
                s2 += x + " ";
            }
            return s2;
        }
    }
}
