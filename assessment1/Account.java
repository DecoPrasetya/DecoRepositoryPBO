package assessment1;
public class Account {
    protected int id;
    protected String name;
    protected String email;
    protected String pass;

    public Account(int id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public int getId() {
        return id;
    };

    public String getName() {
        return name;
    };

    public String getEmail() {
        return email;
    };

    public String getPass() {
        return pass;
    };

}
