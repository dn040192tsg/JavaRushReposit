package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String s = scan.nextLine();


        String a = s.substring(s.indexOf("?")+1);

        String [] arr = a.split("&");

        for (int i = 0; i < arr.length; i++) {
            String[] st = arr[i].split("=");
            System.out.print(st[0] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            String[] st = arr[i].split("=");
            if (st[0].equals("obj") ){
               try{
                   alert(Double.parseDouble(st[1]));
               }catch (Exception e){
                   alert(st[1]);
               }



//                if (st[1].indexOf(".") > -1){
//                    alert(new Double(st[1]));
//                }else{
//                    alert(st[1]);
//                }
            }
        }



    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
