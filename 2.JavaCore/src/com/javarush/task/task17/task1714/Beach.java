package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

        Beach b = new Beach("main", 3, 3);
        System.out.println(b.compareTo(new Beach("name", 2, 3)));

    }


    @Override
    public synchronized int compareTo(Beach o) {
       int reiting = 0;

        if (this.quality > o.quality){
            reiting++;
        }else if (this.quality == o.quality){

        }else{
            reiting--;
        }

        if (this.distance < o.distance){
            reiting++;
        }else if (this.distance == o.distance){

        }else{
            reiting--;
        }

        return reiting;
    }
}
