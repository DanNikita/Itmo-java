package Lab06;

public class MainOOP {
    public static void main(String[] args) {

        // Code for ParentClass and ChildClass - task 4
        ChildClass child = new ChildClass();
        child.a = 10;
        int res = child.fromParent();
        System.out.println(res);

        //Code for task 5
        SuccessorClass_task5 successor = new SuccessorClass_task5();
        successor.name = "Nikita";
        System.out.println(successor.getName());
    }
}
