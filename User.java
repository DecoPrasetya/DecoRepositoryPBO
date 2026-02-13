public class User {
    int id;
    String name;
    String email;
    String pass;
    String pekerjaan;
    int usia;

    public User(int id, String name, String email, String pass, String pekejaan, int usia){
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.pekerjaan = pekejaan;
        this.usia = usia;

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

    public String getPekerjaan() {
        return pekerjaan;
    }

    public int getUsia() {
        return usia;
    }

    public String getUser(){
        return "User: {id: " + id + ", name: " + name + ", email: " + email + ", pass: " + pass + ", pekerjaan: " + pekerjaan + ", usia: " + usia + "}";
    }
}
