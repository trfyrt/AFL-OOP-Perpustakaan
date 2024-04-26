import java.sql.Blob;

public class Pustakawan{

    private int idPus;
    private String namaPustakawan;
    private String email;
    private String username;
    private String password;
    private char jenisKelamin;
    private int level;
    private Blob photo;

    public Pustakawan() {
    }

    public Pustakawan(int idPus, String namaPustakawan, String email, String username, String password,
            char jenisKelamin, int level, Blob photo) {
        this.idPus = idPus;
        this.namaPustakawan = namaPustakawan;
        this.email = email;
        this.username = username;
        this.password = password;
        this.jenisKelamin = jenisKelamin;
        this.level = level;
        this.photo = photo;
    }

    public int getIdPus() {
        return idPus;
    }

    public void setIdPus(int idPus) {
        this.idPus = idPus;
    }

    public String getNamaPustakawan() {
        return namaPustakawan;
    }

    public void setNamaPustakawan(String namaPustakawan) {
        this.namaPustakawan = namaPustakawan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

}
