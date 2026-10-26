
package com.mycompany.mavenproject1;
  
  abstract class Bird {
    private String name;
    private int age;
    private String Color;

    public Bird(String name, int age, String Color) {
        this.name = name;
        this.age = age;
        this.Color = Color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return Color;
    }
}

  class Canary extends Bird {
    public Canary(String name, int age, String Color) {
        super(name, age, Color);
    }
}

  class ZebraBird extends Bird {
    public ZebraBird(String name, int age, String Color) {
        super(name, age,Color);
    }
}

  class Berkadilo extends Bird {
    public Berkadilo(String name, int age, String Color) {
        super(name, age,Color);
    }
}