package Lab03;

import java.util.Date;

class Study {

    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class Auto {
    private String name;
    private String color;
    private int weight;

    public Auto(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Auto(String color) {
        this.color = color;
    }

    public Auto() {
    }

    public String getInfo() {
        return this.name + " " + this.color + " " + this.weight;
    }
}

class House {
    private String name;
    private int year;
    private int floor;

    public void setAllStats(String name, int year, int floor) {
        this.name = name;
        this.year = year;
        this.floor = floor;
    }

    public String getAllStats() {
        return this.name + " " + this.year + " " + this.floor;
    }

    public int howOld() {
        return (2024 - this.year);
    }
}

class Tree {
    private String name;
    private int year;
    private boolean alive;

    public Tree(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Tree(String name, int year, boolean alive) {
        this.name = name;
        this.year = year;
        this.alive = alive;
    }

    public Tree() {
        System.out.println("Empty constructor for Tree is worked");
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study Java = new Study();
        Java.setCourse("Learning Java is easy!");
        System.out.println(Java.printCourse());

        Auto Mers = new Auto("Red", 1200);
        Auto Toyo = new Auto("Blue");
        System.out.println(Mers.getInfo());
        System.out.println(Toyo.getInfo());

        House Stalin = new House();
        House Hrushev = new House();
        Stalin.setAllStats("Stalinka", 1948, 4);
        Hrushev.setAllStats("Hrushevka", 1960, 5);
        System.out.println(Stalin.getAllStats());
        System.out.println(Hrushev.getAllStats());

        Tree maple = new Tree("Maple", 1995);
        Tree oak = new Tree("Oak", 2000, true);
        Tree cone = new Tree();
    }
}

