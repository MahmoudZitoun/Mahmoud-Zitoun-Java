
package com.mycompany.mavenproject1;

  class Cage<T> {
    private T occupant;

    public void occupy(T occupant) {
        this.occupant = occupant;
        System.out.println(" تم إدخال الطير إلى القفص بنجاح");
    }

    public T getOccupant() {
        return occupant;
    }
}

   class BirdCage<T extends Bird> extends Cage<T> {
    public void displayOccupant() {
        T bird = getOccupant();
        if (bird != null) {
            System.out.println("القفص يحتوي على الطائر: " + bird.getName() 
                + " | العمر: " + bird.getAge() + " سنوات" 
                + " | لون الريش: " + bird.getColor());
        } else {
            System.out.println(" القفص فارغ");
        }
    }
}
