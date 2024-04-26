import java.time.LocalDate;

public class TransaksiPinjam extends Transaksi{
    private LocalDate tanggalPinjam;
    private int jumlahPeminjaman;

    public TransaksiPinjam(int idTransaksi, int nim_nik, int idPustakawan, LocalDate tanggalPinjam,
            int jumlahPeminjaman) {
        super(idTransaksi, nim_nik, idPustakawan);
        this.tanggalPinjam = tanggalPinjam;
        this.jumlahPeminjaman = jumlahPeminjaman;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public int getJumlahPeminjaman() {
        return jumlahPeminjaman;
    }

    public void setJumlahPeminjaman(int jumlahPeminjaman) {
        this.jumlahPeminjaman = jumlahPeminjaman;
    }

}
