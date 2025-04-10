package loginregister;

public class user {
    private String email;
    private String nume;
    private String prenume;
    private String password;
 

    // Constructor
    public user(String email, String nume, String prenume, String password) {
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        this.password = password;

    }

    // Getter-e
    public String getEmail() {
        return email;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getPassword() {
        return password;
    }

   
}
