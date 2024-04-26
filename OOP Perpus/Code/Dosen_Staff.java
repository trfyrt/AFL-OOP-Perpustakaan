public class Dosen_Staff extends Member{

    private int nik;
    
    public Dosen_Staff(int nik) {
        this.nik = nik;
    }

    public Dosen_Staff(String nama, String prodi, String fakultas_departemen, boolean punyaDenda, int jumlahDenda,
            int idPustakawan, int nik) {
        super(nama, prodi, fakultas_departemen, punyaDenda, jumlahDenda, idPustakawan);
        this.nik = nik;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }
}
