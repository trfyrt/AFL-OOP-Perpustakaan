public abstract class Transaksi {
    private int idTransaksi;
    private int nim_nik;
    private int idPustakawan;
    
    public Transaksi() {
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public Transaksi(int idTransaksi, int nim_nik, int idPustakawan) {
        this.idTransaksi = idTransaksi;
        this.nim_nik = nim_nik;
        this.idPustakawan = idPustakawan;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getNim_nik() {
        return nim_nik;
    }

    public void setNim_nik(int nim_nik) {
        this.nim_nik = nim_nik;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }

    public void setIdPustakawan(int idPustakawan) {
        this.idPustakawan = idPustakawan;
    }

}