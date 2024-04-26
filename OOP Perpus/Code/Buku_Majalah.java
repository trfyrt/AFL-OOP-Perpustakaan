import java.time.Year;

public class Buku_Majalah extends Koleksi{

    private int isbn_issn;
    private int edisi;
    private int idPengarang;
    private int idPenerbit;

    public Buku_Majalah(String judul, Year tahunTerbit, String jenisSampul, int jumlahRusak, int jumlahPinjam,
            int jumlahTersedia, int jumlahTotal, int idPustakawan, int idKategori, int isbn_issn, int edisi,
            int idPengarang, int idPenerbit, String jenis) {
        super(judul, tahunTerbit, jenisSampul, jumlahRusak, jumlahPinjam, jumlahTersedia, jumlahTotal, idPustakawan,
                idKategori, jenis);
        this.isbn_issn = isbn_issn;
        this.edisi = edisi;
        this.idPengarang = idPengarang;
        this.idPenerbit = idPenerbit;
    }
    
    public Buku_Majalah(int isbn_issn, int edisi, int idPengarang, int idPenerbit) {
        this.isbn_issn = isbn_issn;
        this.edisi = edisi;
        this.idPengarang = idPengarang;
        this.idPenerbit = idPenerbit;
    }

    public int getIsbn_issn() {
        return isbn_issn;
    }

    public void setIsbn_issn(int isbn_issn) {
        this.isbn_issn = isbn_issn;
    }

    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    public int getIdPengarang() {
        return idPengarang;
    }

    public void setIdPengarang(int idPengarang) {
        this.idPengarang = idPengarang;
    }

    public int getIdPenerbit() {
        return idPenerbit;
    }

    public void setIdPenerbit(int idPenerbit) {
        this.idPenerbit = idPenerbit;
    }

    
}
