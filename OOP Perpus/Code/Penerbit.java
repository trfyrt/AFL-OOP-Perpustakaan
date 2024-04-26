public class Penerbit {

    private int idPenerbit;
    private String namaPenerbit;
    private String alamat;
    private String noTelepon;
    private String email;
    
    public Penerbit() {
    }

    public Penerbit(int idPenerbit, String namaPenerbit, String alamat, String noTelepon, String email) {
        this.idPenerbit = idPenerbit;
        this.namaPenerbit = namaPenerbit;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }

    public int getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(int idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
