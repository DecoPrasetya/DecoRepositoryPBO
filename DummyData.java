import java.util.ArrayList;

public class DummyData {
    public static ArrayList<User> users() {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User(1, "Deco", "deco@email.com", "12345", "manager", 40));
        userList.add(new User(2, "Akbar", "akbar@email.com", "12345", "stakeholder", 30));
        userList.add(new User(3, "Prasetya", "prasetya@email.com", "12345", "good person", 20));

        return userList;
    }

    public static ArrayList<Admin> admins() {
        ArrayList<Admin> adminList = new ArrayList<>();

        adminList.add(new Admin(1, "Sherlock Holmes", "sherlock@email.com", "12345"));
        adminList.add(new Admin(2, "Watson", "watson@email.com", "12345"));

        return adminList;
    }
}
