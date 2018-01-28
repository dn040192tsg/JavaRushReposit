package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {

            readKeyFromConsoleAndInitPlanet();

    }

    public static void readKeyFromConsoleAndInitPlanet()  {
        BufferedReader reader  = new BufferedReader (new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (s.equals(Planet.EARTH)) {
            thePlanet  = Earth.getInstance();
        }else if (s.equals(Planet.MOON)){
            thePlanet  = Moon.getInstance();
        }else if (s.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        }else{
            thePlanet = null;
        }
    }

}