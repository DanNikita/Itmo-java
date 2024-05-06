package Lab09;

import java.time.Instant;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(45);
        list.add(75);
        list.add(75);
        list.add(85);
        list.add(75);
        HashSet<Integer> set;
        set = UniqueNumbers(list);
        System.out.println(set);

        List<Integer> list1;
        list1 = MillionArray();
        System.out.println(RandomChoose(list1));

        List<Integer> list2;
        list2 = MillionArray();
        System.out.println(RandomChoose(list2));

        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Richard");
        names.add("Jack");
        names.add("Hank");
        names.add("Stewie");

        Map<User, Integer> temp = generateUserList(names);
        getUserPoints(temp);


    }

    public static HashSet<Integer> UniqueNumbers(List<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    public static List<Integer> MillionArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 1000001; i++) {
            list.add(getRandom(0, 10000000));
        }
        return list;
    }

    public static List<Integer> MillionLinked() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i <= 1000001; i++) {
            list.add(getRandom(0, 10000000));
        }
        return list;
    }

    public static String RandomChoose(List<Integer> list) {
        int a;
        Instant start = Instant.now();
        for (int i = 0; i < 100000; i++) {
            a = list.get(getRandom(0, list.size()));
        }
        Instant end = Instant.now();
        return "Duration is : " + (end.toEpochMilli() - start.toEpochMilli()) + " ms";
    }

    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static Map<User, Integer> generateUserList(Set<String> names) {
        Map<User, Integer> map = new HashMap<>();
        for (String str : names) {
            map.put(new User(str), getRandom(0, 10));
        }
        return map;
    }


    public static void getUserPoints(Map<User, Integer> map) {
        Scanner sc = new Scanner(System.in);
        boolean res = false;
        System.out.println("Enter the name of the user: ");
        String input = sc.nextLine();
        User comp = new User(input);
        for (User u : map.keySet()) {
            if (u.hashCode() == comp.hashCode()) {
                System.out.println(u.getName() + " : " + map.get(u));
                res = true;
                break;
            }
//            if (u.getName().equals(comp.getName())) {

        }
        if (!res) {
            System.out.println("User not found");
        }

    }

}
