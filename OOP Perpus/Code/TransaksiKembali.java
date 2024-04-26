import java.time.LocalDate;

public class TransaksiKembali extends Transaksi{
    private LocalDate tanggalKembali;
    private boolean statusTelat;
    private int hargaTelat;
    private boolean statusRusak;
    private int totalHargaRusak;
    private int jumlahDenda;

    public TransaksiKembali(int idTransaksi, int nim_nik, int idPustakawan, LocalDate tanggalKembali,
            boolean statusTelat, int hargaTelat, boolean statusRusak, int totalHargaRusak, int jumlahDenda) {
        super(idTransaksi, nim_nik, idPustakawan);
        this.tanggalKembali = tanggalKembali;
        this.statusTelat = statusTelat;
        this.hargaTelat = hargaTelat;
        this.statusRusak = statusRusak;
        this.totalHargaRusak = totalHargaRusak;
        this.jumlahDenda = jumlahDenda;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }
    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    public boolean isStatusTelat() {
        return statusTelat;
    }
    public void setStatusTelat(boolean statusTelat) {
        this.statusTelat = statusTelat;
    }
    public int getHargaTelat() {
        return hargaTelat;
    }
    public void setHargaTelat(int hargaTelat) {
        this.hargaTelat = hargaTelat;
    }
    public boolean isStatusRusak() {
        return statusRusak;
    }
    public void setStatusRusak(boolean statusRusak) {
        this.statusRusak = statusRusak;
    }
    public int getTotalHargaRusak() {
        return totalHargaRusak;
    }
    public void setTotalHargaRusak(int totalHargaRusak) {
        this.totalHargaRusak = totalHargaRusak;
    }
    public int getJumlahDenda() {
        return jumlahDenda;
    }
    public void setJumlahDenda(int jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }
}
