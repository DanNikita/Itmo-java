package Lab06;

public class SuccessorClass_task5 extends AncestorClass_task5 {
    @Override
    public void getName() {
        System.out.println("Enter name: ");
        name = sc.next();
        name = this.name + " successor";
    }
}
