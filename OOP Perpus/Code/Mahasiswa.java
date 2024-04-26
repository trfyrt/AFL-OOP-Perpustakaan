public class Mahasiswa extends Member{

    private int nim;

    public Mahasiswa(int nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nama, String prodi, String fakultas_departemen, boolean punyaDenda, int jumlahDenda,
            int idPustakawan, int nim) {
        super(nama, prodi, fakultas_departemen, punyaDenda, jumlahDenda, idPustakawan);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    

}
