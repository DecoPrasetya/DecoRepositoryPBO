import java.util.ArrayList;

public class DummyData {
    public static ArrayList<User> dummyData() {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User(1, "Deco", "deco@email.com", "12345", "manager", 40));
        userList.add(new User(2, "Akbar", "akbar@email.com", "12345", "stakeholder", 30));
        userList.add(new User(3, "Prasetya", "prasetya@email.com", "12345", "good person", 20));

        return userList;
    }
}
