package assessment1;
import java.util.ArrayList;;

public class Auth {
    enum Role {
        ADMIN,
        USER
    }

    String email;
    String pass;
    Role role;
    ArrayList<User> users;
    ArrayList<Admin> admins;




    public Auth(String email, String pass, ArrayList<User> userList, ArrayList<Admin>adminList) {
        this.email = email;
        this.pass = pass;
        this.users = userList;
        this.admins = adminList;
    };

    public String getEmail() {
        return email;
    };

    public Role login(){
        for (Admin a : admins){
            if (a.getEmail().equals(email) && a.getPass().equals(pass)){
                return Role.ADMIN;
            }
        }

        for (User u : users){
            if(u.getEmail().equals(email) && u.getPass().equals(pass)){
                return Role.USER;
            }
        }
        return null;
    };
}
