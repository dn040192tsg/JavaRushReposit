package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.*;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String failName1 = scan.nextLine();
        String failName2 = scan.nextLine();
        Solution s = new Solution();


        try {
            read(allLines, failName1);
            read(forRemoveLines, failName2);
            s.joinData ();

        } catch (IOException e) {
            e.printStackTrace();
        }

        scan.close();

    }

    public  void joinData () throws CorruptedDataException {
            for (String x : forRemoveLines) {
                if (allLines.contains(x)) {
                    allLines.remove(x);
                }else{
                    allLines.clear();
                    throw new CorruptedDataException();
                }
            }
    }

    public static void read (List<String> list, String filename) throws IOException {

        InputStream inputStream = new FileInputStream(filename);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader reader = new BufferedReader(inputStreamReader);
        while (true) {
            String s = reader.readLine();
            if (s == null)
                break;
            list.add(s);
        }
        reader.close();
    }
}
