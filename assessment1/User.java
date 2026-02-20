
public class User extends Account {
    protected String pekerjaan;
    protected int usia;

    public User (int id, String name, String email, String pass, String pekerjaan, int usia){
        super(id, name, email, pass);
        this.pekerjaan = pekerjaan;
        this.usia = usia;
    }

    public String getPekerjaan() {
        return pekerjaan;
    };

    public int getUsia() {
        return usia;
    };
}