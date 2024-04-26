import java.time.Year;

public abstract class Koleksi {
    private String judul;
    private Year tahunTerbit;
    private String jenisSampul;
    private int jumlahRusak;
    private int jumlahPinjam;
    private int jumlahTersedia;
    private int jumlahTotal;
    private int idPustakawan;
    private int idKategori;
    private String jenis;
    
    public Koleksi() {
    }

    public Koleksi(String jenis) {
        this.jenis = jenis;
    }

    public Koleksi(String judul, Year tahunTerbit, String jenisSampul, int jumlahRusak, int jumlahPinjam,
            int jumlahTersedia, int jumlahTotal, int idPustakawan, int idKategori, String jenis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.jenisSampul = jenisSampul;
        this.jumlahRusak = jumlahRusak;
        this.jumlahPinjam = jumlahPinjam;
        this.jumlahTersedia = jumlahTersedia;
        this.jumlahTotal = jumlahTotal;
        this.idPustakawan = idPustakawan;
        this.idKategori = idKategori;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Year getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(Year tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJenisSampul() {
        return jenisSampul;
    }

    public void setJenisSampul(String jenisSampul) {
        this.jenisSampul = jenisSampul;
    }

    public int getJumlahRusak() {
        return jumlahRusak;
    }

    public void setJumlahRusak(int jumlahRusak) {
        this.jumlahRusak = jumlahRusak;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public int getJumlahTersedia() {
        return jumlahTersedia;
    }

    public void setJumlahTersedia(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    }

    public int getJumlahTotal() {
        return jumlahTotal;
    }

    public void setJumlahTotal(int jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }

    public void setIdPustakawan(int idPustakawan) {
        this.idPustakawan = idPustakawan;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }


}
