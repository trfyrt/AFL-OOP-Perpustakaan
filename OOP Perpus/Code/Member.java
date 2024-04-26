public abstract class Member {

    private String nama;
    private String prodi;
    private String fakultas_departemen;
    private boolean punyaDenda;
    private int jumlahDenda;
    private int idPustakawan;

    public Member() {
    }

    public Member(String nama, String prodi, String fakultas_departemen, boolean punyaDenda, int jumlahDenda,
            int idPustakawan) {
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas_departemen = fakultas_departemen;
        this.punyaDenda = punyaDenda;
        this.jumlahDenda = jumlahDenda;
        this.idPustakawan = idPustakawan;
    }

    //Untuk kelola denda
    public Member(String nama, boolean punyaDenda, int jumlahDenda) {
        this.nama = nama;
        this.punyaDenda = punyaDenda;
        this.jumlahDenda = jumlahDenda;
    }

    //Untuk mendaftar atau cuma data umum
    public Member(String nama, String prodi, String fakultas_departemen, int idPustakawan) {
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas_departemen = fakultas_departemen;
        this.idPustakawan = idPustakawan;
    }

    public String getNama() {
        return nama;
    }

    public boolean isPunyaDenda() {
        return punyaDenda;
    }

    public void setPunyaDenda(boolean punyaDenda) {
        this.punyaDenda = punyaDenda;
    }

    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(int jumlahDenda) {
        this.jumlahDenda = jumlahDenda;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }

    public void setIdPustakawan(int idPustakawan) {
        this.idPustakawan = idPustakawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas_departemen() {
        return fakultas_departemen;
    }

    public void setFakultas_departemen(String fakultas_departemen) {
        this.fakultas_departemen = fakultas_departemen;
    }
    
    
}
