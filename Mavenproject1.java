
package com.mycompany.mavenproject1;


public class Mavenproject1 {

   public class Main {
    public static void main(String[] args) {
        
        BirdCage<Canary> canaryCage = new BirdCage<>();
        canaryCage.occupy(new Canary("كناري", 2, "أصفر"));
        canaryCage.displayOccupant();

        System.out.println("--------");

        BirdCage<ZebraBird> zebraCage = new BirdCage<>();
        zebraCage.occupy(new ZebraBird("زيبرا", 1, "رمادي "));
        zebraCage.displayOccupant();

        System.out.println("----------");

        BirdCage<Berkadilo> parakeetCage = new BirdCage<>();
        parakeetCage.occupy(new Berkadilo("بركيديلو", 3, "أخضر"));
        parakeetCage.displayOccupant();
    }
}
