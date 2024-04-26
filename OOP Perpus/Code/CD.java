import java.time.Year;

public class CD extends Koleksi{

    private int idCD;

    public CD(int idCD) {
        this.idCD = idCD;
    }

    public CD(String judul, Year tahunTerbit, String jenisSampul, int jumlahRusak, int jumlahPinjam, int jumlahTersedia,
            int jumlahTotal, int idPustakawan, int idKategori, int idCD, String jenis) {
        super(judul, tahunTerbit, jenisSampul, jumlahRusak, jumlahPinjam, jumlahTersedia, jumlahTotal, idPustakawan,
                idKategori, jenis);
        this.idCD = idCD;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }
    
    
}
