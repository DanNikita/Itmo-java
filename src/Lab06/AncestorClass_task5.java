package Lab06;

import java.util.Scanner;

public class AncestorClass_task5 {
    public AncestorClass_task5() {
    }

    public int age;
    public String name;
    public Scanner sc = new Scanner(System.in);

    public void ageCollect() {
        System.out.println("Enter age: ");
        this.age = sc.nextInt();
    }

    public void getName() {
        System.out.println("Enter name: ");
        this.name = sc.next();
    }
}
