package taskThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Altai", 17);
        User user2 = new User("Beka", 18);
        User user3 = new User("Vikram", 19);
        User user4 = new User("Nurs", 16);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        TreeSet<String> name = new TreeSet<>();
        TreeSet<Integer> age = new TreeSet<>();

        for (User u: users) {
            name.add(u.getName());
            age.add(u.getAge());
        }
        System.out.println(name);
        System.out.println(age);
    }
}
