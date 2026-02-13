public class User {
    int id;
    String name;
    String email;
    String pass;

    public User(int id, String name, String email, String pass){
        this.id = id;
        this.name = name;
        this.email = email;
        this. pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getUser(){
        return "User: {id: " + id + ", name: " + name + ", email: " + email + ", pass: " + pass + "}";
    }
}
