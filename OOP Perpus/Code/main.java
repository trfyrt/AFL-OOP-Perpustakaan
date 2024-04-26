import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// <style>
// *{
//     text-decoration: none; ---> jimat agar tidak merah
// }
// </style>

public class main {
    private ArrayList<Pengarang> listPengarang = new ArrayList<Pengarang>();
    private ArrayList<Penerbit> listPenerbit = new ArrayList<Penerbit>();
    private ArrayList<Koleksi> listKoleksi = new ArrayList<Koleksi>();
    private ArrayList<Member> listMembers = new ArrayList<Member>();
    private ArrayList<Pustakawan> listPustakawan = new ArrayList<Pustakawan>();
    private ArrayList<Transaksi> listTransaksi = new ArrayList<Transaksi>();



    
    private void tabelKoleksi() {
        System.out.printf("\n**********************************************************************************************************************************************%n");
        System.out.printf("|                                                             ~~ Daftar Koleksi ~~                                                            |%n");
        System.out.printf("***********************************************************************************************************************************************%n");
        System.out.printf("| %-3s | %-10s | %-25s | %-12s | %-12s | %-12s | %-13s | %-16s | %-12s |%n", "No.", "Jenis", "Judul", "Tahun Terbit", "Jenis Sampul", "Jumlah Rusak", "Jumlah Pinjam", "Jumlah Tersedia", "Jumlah Total");
        System.out.printf("***********************************************************************************************************************************************%n");
        int i = 1;
        for (Koleksi koleksi : listKoleksi) {

            System.out.printf("| %-3s | %-10s | %-25s | %-12s | %-12s | %-12s | %-13s | %-16s | %-12s |%n", 
                    i, 
                    koleksi.getJenis(), 
                    koleksi.getJudul(), 
                    koleksi.getTahunTerbit().toString(), 
                    koleksi.getJenisSampul(), 
                    koleksi.getJumlahRusak(), 
                    koleksi.getJumlahPinjam(), 
                    koleksi.getJumlahTersedia(), 
                    koleksi.getJumlahTotal());
            i++;

        System.out.printf("************************************************************************************************************************************************%n");}
    }

    private void tabelPustakawan() {
        System.out.println("\n");

        System.out.printf("***********************************************************************************************************%n");
        System.out.printf("|                                              ~~ Daftar Pustakawan ~~                                    |%n");
        System.out.printf("***********************************************************************************************************%n");
        System.out.printf("| %-3s | %-25s | %-25s | %-15s | %-8s | %-12s |%n", "ID", "Nama", "Email", "Username", "Gender", "Level");
        System.out.printf("***********************************************************************************************************%n");
        for (Pustakawan pustakawan : listPustakawan) {
            System.out.printf("| %-3s | %-25s | %-25s | %-15s | %-8s | %-12s |%n",
                    pustakawan.getIdPus(),
                    pustakawan.getNamaPustakawan(),
                    pustakawan.getEmail(),
                    pustakawan.getUsername(),
                    pustakawan.getJenisKelamin(),
                    pustakawan.getLevel());}
        System.out.printf("***********************************************************************************************************%n");
    }
    
    private void tabelPengarang() {
        System.out.println("\n");

        System.out.printf("*************************************************************************************************************%n");
        System.out.printf("|                                            ~~ Daftar Pengarang ~~                                         |%n");
        System.out.printf("*************************************************************************************************************%n");
        System.out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", "ID", "Nama", "Alamat", "No. Telepon", "Email");
        System.out.printf("*************************************************************************************************************%n");
        for (Pengarang pengarang : listPengarang) {
            System.out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", 
                    pengarang.getIdPengarang(), 
                    pengarang.getNamaPengarang(), 
                    pengarang.getAlamat(), 
                    pengarang.getNoTelepon(), 
                    pengarang.getEmail());
        }

        System.out.printf("*************************************************************************************************************%n");

    }

    private void tabelPenerbit() {
        System.out.println("\n");

        System.out.printf("*************************************************************************************************************%n");
        System.out.printf("|                                            ~~ Daftar Penerbit ~~                                          |%n");
        System.out.printf("*************************************************************************************************************%n");
        System.out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", "ID", "Nama", "Alamat", "No. Telepon", "Email");
        System.out.printf("*************************************************************************************************************%n");

        for (Penerbit penerbit : listPenerbit) {
            System.out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", 
                    penerbit.getIdPenerbit(), 
                    penerbit.getNamaPenerbit(), 
                    penerbit.getAlamat(), 
                    penerbit.getNoTelepon(), 
                    penerbit.getEmail());
            
        }

        System.out.printf("*************************************************************************************************************%n");

    }

    private void tabelMember() {
        System.out.printf("\n****************************************************************************************************************************************%n");
        System.out.printf("|                                                          ~~ Daftar Member ~~                                                         |%n");
        System.out.printf("****************************************************************************************************************************************%n");
        System.out.printf("| %-3s | %-10s | %-20s | %-20s | %-20s | %-12s | %-12s | %-13s |%n", 
                "No.", 
                "Jenis", 
                "Nama", 
                "Program Studi", 
                "Fakultas/Departemen", 
                "Punya Denda", 
                "Jumlah Denda", 
                "ID Pustakawan", 
                "NIM/NIK");
        System.out.printf("*****************************************************************************************************************************************%n");

        int i = 1;
        for (Member member : listMembers) {
            if (member instanceof Dosen_Staff) {
                System.out.printf("| %-3s | %-10s | %-20s | %-20s | %-20s | %-12s | %-12s | %-13s |%n", 
                        i, 
                        "Dosen", 
                        member.getNama(), 
                        member.getProdi(), 
                        member.getFakultas_departemen(), 
                        member.isPunyaDenda() ? "Ya" : "Tidak", 
                        member.getJumlahDenda(), 
                        member.getIdPustakawan(), 
                        ((Dosen_Staff) member).getNik());


            } else if (member instanceof Mahasiswa) {
                System.out.printf("| %-3s | %-10s | %-20s | %-20s | %-20s | %-12s | %-12s | %-13s |%n", 
                        i, 
                        "Mahasiswa", 
                        member.getNama(), 
                        member.getProdi(), 
                        member.getFakultas_departemen(), 
                        member.isPunyaDenda() ? "Ya" : "Tidak", 
                        member.getJumlahDenda(), 
                        member.getIdPustakawan(), 
                        ((Mahasiswa) member).getNim());
            }
            i++;
        }

        System.out.printf("***************************************************************************************************************************************%n");
    }

    private void tabelTransaksi() {

        System.out.printf("*************************************************************************************************************************************************************%n");
        System.out.printf("|                                                                    ~~ Daftar Transaksi ~~                                                                 |%n");
        System.out.printf("*************************************************************************************************************************************************************%n");
        System.out.printf("| %-12s | %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "ID Transaksi", "Jenis" , "NIM/NIK", "ID Pustakawan", "Tanggal Transaksi", "Jumlah Pinjam", "Status Telat", "Status Rusak", "Total Denda");
        System.out.printf("*************************************************************************************************************************************************************%n");

        int i = 1;
        for (Transaksi transaksi : listTransaksi) {
            if (transaksi instanceof TransaksiPinjam){ 
            System.out.printf("| %-12s | %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",
                i,
                "Pinjam",
                transaksi.getNim_nik(),
                transaksi.getIdPustakawan(),
                ((TransaksiPinjam) transaksi).getTanggalPinjam(),
                ((TransaksiPinjam) transaksi).getJumlahPeminjaman(),
                "",
                "",
                "");}

            else if(transaksi instanceof TransaksiKembali){
                System.out.printf("| %-5s | %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",
                i,
                "Kembali",
                transaksi.getNim_nik(),
                transaksi.getIdPustakawan(),
                ((TransaksiKembali) transaksi).getTanggalKembali(),
                "",
                ((TransaksiKembali) transaksi).isStatusTelat(),
                ((TransaksiKembali) transaksi).isStatusRusak(),
                ((TransaksiKembali) transaksi).getJumlahDenda()
                );    
            }
    i++;
}

System.out.printf("*************************************************************************************************************************************************************%n");

    }

    private void addPengarang() {
        Scanner scan = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("ID Pengarang: ");
                    int idPengarang = scan.nextInt();
                    scan.nextLine();
    
                    System.out.print("Nama Pengarang: ");
                    String nama = scan.nextLine();
    
                    System.out.print("Alamat Pengarang: ");
                    String alamat = scan.nextLine();
    
                    System.out.print("No. Telepon Pengarang: ");
                    String notelp = scan.nextLine();
    
                    System.out.print("Email Pengarang: ");
                    String email = scan.nextLine();
    
                    Pengarang pengarang = new Pengarang(idPengarang, nama, alamat, notelp, email);
          
                    listPengarang.add(pengarang);
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Mohon mengisi data yang benar");
                    break;
                }
            }
    }
    
    private void addPenerbit() {
        Scanner scan = new Scanner(System.in);
        while (true) {
                try {
                    System.out.print("ID Penerbit: ");
                    int idPenerbit = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Nama Penerbit: ");
                    String nama = scan.nextLine();

                    System.out.print("Alamat Penerbit: ");
                    String alamat = scan.nextLine();

                    System.out.print("No. Telepon Penerbit: ");
                    String notelp = scan.nextLine();
                    
                    System.out.print("Email Penerbit: ");
                    String email = scan.nextLine();
    
                    Penerbit penerbit = new Penerbit(idPenerbit, nama, alamat, notelp, email);
        
                    listPenerbit.add(penerbit);

                    break;

    
                } catch (InputMismatchException e) {
                    System.out.println("Mohon mengisi data yang benar");
                    break;
                }


        }
    }

    private void addKoleksi() {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
                System.out.println("\nJenis Koleksi: ");
                String jenis = scan.nextLine();
    
                switch (jenis.toLowerCase()) {
                    case "buku":
                    case "majalah":
                        try {
                            System.out.print("Judul Buku/Majalah: ");
                            String judul = scan.nextLine();
                            
                            System.out.print("Tahun Terbit (misalnya, 2020): ");
                            Year tahunTerbit = Year.of(scan.nextInt());
                            scan.nextLine(); 
                            
                            System.out.print("Jenis Sampul (misalnya, hardcover atau paperback): ");
                            String jenisSampul = scan.nextLine();
                            
                            System.out.print("Jumlah Rusak: ");
                            int jumlahRusak = scan.nextInt();
                            
                            System.out.print("Jumlah Pinjam: ");
                            int jumlahPinjam = scan.nextInt();
                            
                            System.out.print("Jumlah Tersedia: ");
                            int jumlahTersedia = scan.nextInt();
                            
                            int jumlahTotal = jumlahRusak + jumlahPinjam + jumlahTersedia;
                            scan.nextLine(); 
                            
                            System.out.print("ID Pustakawan: ");
                            int idPustakawan = scan.nextInt();
                            scan.nextLine(); 
                            
                            System.out.print("ID Kategori: ");
                            int idKategori = scan.nextInt();
                            scan.nextLine(); 
                            
                            System.out.print("ISBN/ISSN: ");
                            int isbn_issn = scan.nextInt();
                            scan.nextLine(); 
                            
                            System.out.print("Edisi: ");
                            int edisi = scan.nextInt();
                            scan.nextLine(); 
                            
                            System.out.print("ID Pengarang: ");
                            int idPengarang = scan.nextInt();
                            scan.nextLine(); 
                            
                            System.out.print("ID Penerbit: ");
                            int idPenerbit = scan.nextInt();
                            scan.nextLine(); 
                            
                            Koleksi buku = new Buku_Majalah(judul, tahunTerbit, jenisSampul, jumlahRusak, jumlahPinjam, jumlahTersedia, jumlahTotal, 
                                                           idPustakawan, idKategori, isbn_issn, edisi, idPengarang, idPenerbit, jenis);
                            
                            buku.setJenis("Buku");
                            
                            listKoleksi.add(buku);

                            loop = false;
    
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Mohon mengisi data yang benar");
                            scan.nextLine();
                        }
                        break;
    
                    case "cd":
                        try {
                            System.out.print("Judul CD: ");
                            String judul = scan.nextLine();
                            
                            System.out.print("Tahun Terbit (misalnya, 2020): ");
                            Year tahunTerbit = Year.of(scan.nextInt());
                            scan.nextLine(); //clear buffer
                            
                            System.out.print("Jenis Sampul (misalnya, plastik atau digipak): ");
                            String jenisSampul = scan.nextLine();
                            
                            System.out.print("Jumlah Rusak: ");
                            int jumlahRusak = scan.nextInt();
                            
                            System.out.print("Jumlah Pinjam: ");
                            int jumlahPinjam = scan.nextInt();
                            
                            System.out.print("Jumlah Tersedia: ");
                            int jumlahTersedia = scan.nextInt();
                            
                            int jumlahTotal = jumlahRusak + jumlahPinjam + jumlahTersedia;
                            scan.nextLine(); 
                            
                            System.out.print("ID Pustakawan: ");
                            int idPustakawan = scan.nextInt();
                            scan.nextLine();
                            
                            System.out.print("ID Kategori: ");
                            int idKategori = scan.nextInt();
                            scan.nextLine();
                            
                            System.out.print("ID CD: ");
                            int idCD = scan.nextInt();
                            scan.nextLine();
                            
                            Koleksi cd = new CD(judul, tahunTerbit, jenisSampul, jumlahRusak, jumlahPinjam, jumlahTersedia, jumlahTotal, 
                                                idPustakawan, idKategori, idCD, jenis);
                            
                            cd.setJenis("CD");
                            
                            listKoleksi.add(cd);

                            loop = false;
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Mohon mengisi data yang benar");
                            scan.nextLine();
                        }
                        break;
    
                    default:
                        System.out.println("Mohon Memasukkan antara 'Buku', 'Majalah', 'atau CD'");
                        break;
                    
            }
        }
    }

    private void addMember() {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
                System.out.print("\nDosen/Staff atau Mahasiswa: ");
                String jenisPerson = scan.nextLine();

                switch (jenisPerson.toLowerCase()) {
                    case "dosen":
                    case "staff":
                        try {
                            System.out.print("Nama Dosen/Staff: ");
                            String nama = scan.nextLine();

                            System.out.print("NIK: ");
                            int nik = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Program Studi: ");
                            String prodi = scan.nextLine();

                            System.out.print("Fakultas/Departemen: ");
                            String fakultas_departemen = scan.nextLine();

                            System.out.print("Punya Denda? (true/false): ");
                            boolean punyaDenda = scan.nextBoolean();
                            scan.nextLine();

                            System.out.print("Jumlah Denda: ");
                            int jumlahDenda = scan.nextInt();
                            scan.nextLine();

                            System.out.print("ID Pustakawan: ");
                            int idPustakawan = scan.nextInt();
                            scan.nextLine();

                            Member dosen = new Dosen_Staff(nama, prodi, fakultas_departemen, punyaDenda, jumlahDenda, idPustakawan, nik);

                            listMembers.add(dosen);

                            loop = false;                       
                        }

                        catch (InputMismatchException e) {
                            System.out.println("Mohon mengisi data yang benar.");
                            scan.nextLine();
                        }
                        break;

                    case "mahasiswa":
                        try {
                            System.out.print("Nama Mahasiswa: ");
                            String nama = scan.nextLine();

                            System.out.print("NIM: ");
                            int nim = scan.nextInt();
                            scan.nextLine();

                            System.out.print("Program Studi: ");
                            String prodi = scan.nextLine();

                            System.out.print("Fakultas/Departemen: ");
                            String fakultas_departemen = scan.nextLine();

                            System.out.print("Punya Denda? (true/false): ");
                            boolean punyaDenda = scan.nextBoolean();

                            System.out.print("Jumlah Denda: ");
                            int jumlahDenda = scan.nextInt();
                            scan.nextLine();

                            System.out.print("ID Pustakawan: ");
                            int idPustakawan = scan.nextInt();
                            scan.nextLine();

                            Member mahasiswa = new Mahasiswa(nama, prodi, fakultas_departemen, punyaDenda, jumlahDenda, idPustakawan, nim);

                            listMembers.add(mahasiswa);

                            loop = false;
                        } 
                        catch (InputMismatchException e) {
                            System.out.println("Mohon mengisi data yang benar.");
                            scan.nextLine(); // Bersihkan buffer untuk menghindari masalah dengan input
                        }
                        break;

                    default:
                        System.out.println("Mohon masukkan antara 'Dosen', 'Staff' atau 'Mahasiswa'.");
                        break;
                }

        }
    }

    private void addTransaksi() {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
                        System.out.print("Apakah Anda ingin meminjam atau mengembalikan? ");
                        String action = scan.nextLine();

                        switch (action.toLowerCase()) {
                            case "meminjam":
                            case "pinjam":
                                try {
                                    System.out.print("ID Pustakawan: ");
                                    int idPustakawan = scan.nextInt();

                                    System.out.print("NIM/NIK: ");
                                    int nim_nik = scan.nextInt();
                                    scan.nextLine();

                                    System.out.print("Tanggal Pinjam (format: yyyy-MM-dd): ");
                                    String dateStr = scan.next();
                                    LocalDate tanggalPinjam = LocalDate.parse(dateStr);

                                    System.out.print("Jumlah Peminjaman: ");
                                    int jumlahPeminjaman = scan.nextInt();
                                    scan.nextLine();

                                    Transaksi transaksi = new TransaksiPinjam(0, nim_nik, idPustakawan, tanggalPinjam, jumlahPeminjaman);
                                    listTransaksi.add(transaksi);
                                    loop = false;

                                } catch (InputMismatchException e) {
                                    System.out.println("Mohon mengisi data yang benar.");
                                    scan.nextLine();
                                }
                                break;

                            case "mengembalikan":
                                try {
                                    System.out.print("ID Pustakawan: ");
                                    int idPustakawan = scan.nextInt();

                                    System.out.print("NIK: ");
                                    int nik = scan.nextInt();
                                    scan.nextLine();

                                    System.out.print("Tanggal Kembali (format: yyyy-MM-dd): ");
                                    String dateStr = scan.next();
                                    LocalDate tanggalKembali = LocalDate.parse(dateStr);

                                    System.out.print("Status Telat (true/false): ");
                                    boolean statusTelat = scan.nextBoolean();

                                    System.out.print("Harga Telat: ");
                                    int hargaTelat = scan.nextInt();
                                    scan.nextLine();

                                    System.out.print("Status Rusak (true/false): ");
                                    boolean statusRusak = scan.nextBoolean();

                                    System.out.print("Total Harga Rusak: ");
                                    int totalHargaRusak = scan.nextInt();
                                    scan.nextLine();

                                    System.out.print("Jumlah Denda: ");
                                    int jumlahDenda = scan.nextInt();
                                    scan.nextLine();

                                    Transaksi transaksi = new TransaksiKembali(0, nik, idPustakawan, tanggalKembali, statusTelat, hargaTelat, statusRusak, totalHargaRusak, jumlahDenda);
                                    listTransaksi.add(transaksi);
                                    loop=false;

                                } catch (InputMismatchException e) {
                                    System.out.println("Mohon mengisi data yang benar.");
                                    scan.nextLine();
                                }
                                break;

                            default:
                                System.out.println("Mohon masukkan antara 'meminjam' atau 'mengembalikan'.");
                                break;
                        }
                        break;



                }             

    }


    public static void main(String[] args) throws IOException{
        PrintWriter out = new PrintWriter("input_output.txt");
        Scanner scan = new Scanner(System.in);
        main main = new main();

        boolean loop = true;

        Pustakawan pustakawan1 = new Pustakawan(1, "Lord Fijeh", "fij@library.com", "fijj", "password123", 'M', 2, null);
        Pustakawan pustakawan2 = new Pustakawan(2, "Aryo Karelm", "oreo@library.com", "oreo54", "123password", 'M', 4, null);
        Pustakawan pustakawan3 = new Pustakawan(3, "Erasmus Clemens", "javpro@library.com", "rulesyt", "pass321", 'M', 1, null);
    
        main.listPustakawan.add(pustakawan1);
        main.listPustakawan.add(pustakawan2);
        main.listPustakawan.add(pustakawan3);
    

        //Masuk
        while (loop) {
            boolean loopDalam = true;
            String pilihAksi = null;
            String pilihAksiDalam = null;
    
            System.out.println("Selamat datang di Perpustakaan Cinema, Anda adalah:\n1. Pengunjung\n2. Member\n3. Pustakawan\n4. Keluar");
            System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
            String sayaSiapa = scan.nextLine();
    
            switch (sayaSiapa) {
                case "1"://untuk pengunjung
                    while (loopDalam) {
                        System.out.println("Silahkan memilih aksi: \n1. Membaca buku\n2. Mendaftar sebagai member\n3. Keluar");
                        System.out.print("Masukkan pilihan Anda(1/2): ");
                        pilihAksi = scan.nextLine();
    
                        switch (pilihAksi) {
                            case "1":
                                System.out.println("Silahkan membaca buku");
                                main.tabelKoleksi();
                                break;
                            
                            case "2":
                                System.out.println("Mohon menghubungi pustakawan terdekat.");
                                break;
                            
                            case "3":
                                loopDalam = false;
                                break;
                        
                            default:
                                System.out.println("Mohon memilih pilihan yang tersedia.\n");
                                break;
                        }
    
                    }
                    break;
                    
                case "2"://untuk sudah MEMBER
                    while (loopDalam) {
                        System.out.println("Silahkan memilih aksi: \n1. Membaca buku\n2. Meminjam koleksi\n3. Mengembalikan koleksi\n4. Melihat koleksi\n5. Keluar");
                        System.out.print("Masukkan pilihan Anda(1/2/3/4/5): ");
                        pilihAksi = scan.nextLine();

                        switch (pilihAksi) {
                            case "1":
                                System.out.println("Silahkan membaca buku");
                                main.tabelKoleksi();
                                break;
                        
                            case "2":
                                System.out.println("Silahkan meminjam koleksi dengan membawa ke pustakawan terdekat");
                                main.tabelKoleksi();
                                break;
                        
                            case "3":
                                System.out.println("Silahkan mengembalikan koleksi ke pustakawan terdekat");
                                break;
                        
                            case "4":
                                System.out.println("Koleksi buku saat ini");
                                main.tabelKoleksi();
                                break;
                        
                            case "5":
                                loopDalam = false;
                                break;
                        
                            default:
                            System.out.println("Mohon memilih pilihan yang tersedia.\n");
                                break;
                        }
    
                    }
                    break;
                
                case "3"://untuk pustakawan pustakawan ajah
                while(loopDalam){

                    System.out.println("Silahkan memilih aksi: \n1. Mengelola Koleksi\n2. Mengelola Pengarang\n3. Mengelola Penerbit\n4. Mengelola Transaksi\n5. Mengelola Member\n6. Melihat data Pustakawan\n7. Exit");
                    System.out.print("Masukkan pilihan Anda(1/2/3/4/5/6): ");
                    pilihAksi = scan.nextLine();

                        switch (pilihAksi) {
                            case "1":
                                System.out.println("Silahkan memilih aksi: \n1. Menambah Koleksi\n2. Melihat Tabel Koleksi");
                                System.out.print("Masukkan pilihan Anda(1/2): ");
                                pilihAksiDalam = scan.nextLine();

                                switch (pilihAksiDalam) {
                                    case "1":
                                        main.addKoleksi();
                                        break;
                                    
                                    case "2":
                                        main.tabelKoleksi();
                                        break;
                                
                                    default:
                                        System.out.println("Pilihan tidak ada. Kembali ke menu Pustakawan");
                                        break;
                                }
                                break;
                        
                            case "2":
                            System.out.println("Silahkan memilih aksi: \n1. Menambah Pengarang\n2. Melihat Tabel Pengarang");
                            System.out.print("Masukkan pilihan Anda(1/2): ");
                            pilihAksiDalam = scan.nextLine();

                            switch (pilihAksiDalam) {
                                case "1":
                                    main.addPengarang();
                                    break;
                                
                                case "2":
                                    main.tabelPengarang();
                                    break;
                            
                                default:
                                    System.out.println("Pilihan tidak ada. Kembali ke menu Pustakawan");
                                    break;
                            }
                            break;
                        
                            case "3":
                            System.out.println("Silahkan memilih aksi: \n1. Menambah Penerbit\n2. Melihat Tabel Penerbit");
                            System.out.print("Masukkan pilihan Anda(1/2): ");
                            pilihAksiDalam = scan.nextLine();

                            switch (pilihAksiDalam) {
                                case "1":
                                    main.addPenerbit();
                                    break;
                                
                                case "2":
                                    main.tabelPenerbit();
                                    break;
                            
                                default:
                                    System.out.println("Pilihan tidak ada. Kembali ke menu Pustakawan");
                                    break;
                            }                                break;
                        
                            case "4":
                            System.out.println("Silahkan memilih aksi: \n1. Melakukan Transaksi\n2. Melihat Tabel Transaksi");
                            System.out.print("Masukkan pilihan Anda(1/2): ");
                            pilihAksiDalam = scan.nextLine();

                            switch (pilihAksiDalam) {
                                case "1":
                                    main.addTransaksi();
                                    break;
                                
                                case "2":
                                    main.tabelTransaksi();
                                    break;
                            
                                default:
                                    System.out.println("Pilihan tidak ada. Kembali ke menu Pustakawan");
                                    break;
                            }
                                break;
                        
                            case "5":
                            System.out.println("Silahkan memilih aksi: \n1. Mendaftarkan Member\n2. Melihat Tabel Member");
                            System.out.print("Masukkan pilihan Anda(1/2): ");
                            pilihAksiDalam = scan.nextLine();

                            switch (pilihAksiDalam) {
                                case "1":
                                    main.addMember();
                                    break;
                                
                                case "2":
                                    main.tabelMember();                                    break;
                            
                                default:
                                    System.out.println("Pilihan tidak ada. Kembali ke menu Pustakawan");
                                    break;
                            }
                                break;
                        
                            case "6":
                                main.tabelPustakawan();
                                break;

                            case "7":
                                loopDalam = false;
                                break;
                        
                            default:
                                break;
                        }
                    }
                    break;

                case "4":
                    loop = false;
                    break;

                default:
                    System.out.println("Mohon memilih pilihan yang tersedia.\n");
                    break;
            }
    
        }

        //MASUKKAN KE TXT
        //TABEL KOLEKSI
        out.printf("\n**********************************************************************************************************************************************%n");
        out.printf("|                                                             ~~ Daftar Koleksi ~~                                                            |%n");
        out.printf("***********************************************************************************************************************************************%n");
        out.printf("| %-3s | %-10s | %-25s | %-12s | %-12s | %-12s | %-13s | %-16s | %-12s |%n", "No.", "Jenis", "Judul", "Tahun Terbit", "Jenis Sampul", "Jumlah Rusak", "Jumlah Pinjam", "Jumlah Tersedia", "Jumlah Total");
        out.printf("***********************************************************************************************************************************************%n");
        int i = 1;
        for (Koleksi koleksi : main.listKoleksi) {

            out.printf("| %-3s | %-10s | %-25s | %-12s | %-12s | %-12s | %-13s | %-16s | %-12s |%n", 
                    i, 
                    koleksi.getJenis(), 
                    koleksi.getJudul(), 
                    koleksi.getTahunTerbit().toString(), 
                    koleksi.getJenisSampul(), 
                    koleksi.getJumlahRusak(), 
                    koleksi.getJumlahPinjam(), 
                    koleksi.getJumlahTersedia(), 
                    koleksi.getJumlahTotal());
            i++;

        out.printf("************************************************************************************************************************************************%n");}

        //TABEL PUSTAKAWAN
        out.println("\n");

        out.printf("***********************************************************************************************************%n");
        out.printf("|                                              ~~ Daftar Pustakawan ~~                                    |%n");
        out.printf("***********************************************************************************************************%n");
        out.printf("| %-3s | %-25s | %-25s | %-15s | %-8s | %-12s |%n", "ID", "Nama", "Email", "Username", "Gender", "Level");
        out.printf("***********************************************************************************************************%n");
        for (Pustakawan pustakawan : main.listPustakawan) {
            out.printf("| %-3s | %-25s | %-25s | %-15s | %-8s | %-12s |%n",
                    pustakawan.getIdPus(),
                    pustakawan.getNamaPustakawan(),
                    pustakawan.getEmail(),
                    pustakawan.getUsername(),
                    pustakawan.getJenisKelamin(),
                    pustakawan.getLevel());}
        out.printf("***********************************************************************************************************%n");
        //TABEL PENGARANG
        out.println("\n");

        out.printf("*************************************************************************************************************%n");
        out.printf("|                                            ~~ Daftar Pengarang ~~                                         |%n");
        out.printf("*************************************************************************************************************%n");
        out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", "ID", "Nama", "Alamat", "No. Telepon", "Email");
        out.printf("*************************************************************************************************************%n");
        for (Pengarang pengarang : main.listPengarang) {
            out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", 
                    pengarang.getIdPengarang(), 
                    pengarang.getNamaPengarang(), 
                    pengarang.getAlamat(), 
                    pengarang.getNoTelepon(), 
                    pengarang.getEmail());
        }

        out.printf("*************************************************************************************************************%n");


        //TABEL PENERBIT
        out.println("\n");

        out.printf("*************************************************************************************************************%n");
        out.printf("|                                            ~~ Daftar Penerbit ~~                                          |%n");
        out.printf("*************************************************************************************************************%n");
        out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", "ID", "Nama", "Alamat", "No. Telepon", "Email");
        out.printf("*************************************************************************************************************%n");

        for (Penerbit penerbit : main.listPenerbit) {
            out.printf("| %-3s | %-25s | %-25s | %-15s | %-25s |%n", 
                    penerbit.getIdPenerbit(), 
                    penerbit.getNamaPenerbit(), 
                    penerbit.getAlamat(), 
                    penerbit.getNoTelepon(), 
                    penerbit.getEmail());
            
        }

        out.printf("*************************************************************************************************************%n");

        //TABEL MEMBER
        out.printf("\n****************************************************************************************************************************************%n");
        out.printf("|                                                          ~~ Daftar Member ~~                                                         |%n");
        out.printf("****************************************************************************************************************************************%n");
        out.printf("| %-3s | %-10s | %-20s | %-20s | %-20s | %-12s | %-12s | %-13s |%n", 
                "No.", 
                "Jenis", 
                "Nama", 
                "Program Studi", 
                "Fakultas/Departemen", 
                "Punya Denda", 
                "Jumlah Denda", 
                "ID Pustakawan", 
                "NIM/NIK");
        out.printf("*****************************************************************************************************************************************%n");

        i = 1;
        for (Member member : main.listMembers) {
            if (member instanceof Dosen_Staff) {
                out.printf("| %-3s | %-10s | %-20s | %-20s | %-20s | %-12s | %-12s | %-13s |%n", 
                        i, 
                        "Dosen", 
                        member.getNama(), 
                        member.getProdi(), 
                        member.getFakultas_departemen(), 
                        member.isPunyaDenda() ? "Ya" : "Tidak", 
                        member.getJumlahDenda(), 
                        member.getIdPustakawan(), 
                        ((Dosen_Staff) member).getNik());


            } else if (member instanceof Mahasiswa) {
                out.printf("| %-3s | %-10s | %-20s | %-20s | %-20s | %-12s | %-12s | %-13s |%n", 
                        i, 
                        "Mahasiswa", 
                        member.getNama(), 
                        member.getProdi(), 
                        member.getFakultas_departemen(), 
                        member.isPunyaDenda() ? "Ya" : "Tidak", 
                        member.getJumlahDenda(), 
                        member.getIdPustakawan(), 
                        ((Mahasiswa) member).getNim());
            }
            i++;
        }

        out.printf("***************************************************************************************************************************************%n");

        
        //TABEL TRANSAKSI
            out.printf("*************************************************************************************************************************************************************%n");
            out.printf("|                                                                    ~~ Daftar Transaksi ~~                                                                 |%n");
            out.printf("*************************************************************************************************************************************************************%n");
            out.printf("| %-5s | %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "ID Transaksi", "Jenis" , "NIM/NIK", "ID Pustakawan", "Tanggal Transaksi", "Jumlah Pinjam", "Status Telat", "Status Rusak", "Total Denda");
            out.printf("*************************************************************************************************************************************************************%n");
    
            i = 1;
            for (Transaksi transaksi : main.listTransaksi) {
                if (transaksi instanceof TransaksiPinjam){ 
                out.printf("| %-5s | %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",
                    i,
                    "Pinjam",
                    transaksi.getNim_nik(),
                    transaksi.getIdPustakawan(),
                    ((TransaksiPinjam) transaksi).getTanggalPinjam(),
                    ((TransaksiPinjam) transaksi).getJumlahPeminjaman(),
                    "",
                    "",
                    "");}
    
                else if(transaksi instanceof TransaksiKembali){
                    out.printf("| %-5s | %-10s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",
                    i,
                    "Kembali",
                    transaksi.getNim_nik(),
                    transaksi.getIdPustakawan(),
                    ((TransaksiKembali) transaksi).getTanggalKembali(),
                    "",
                    ((TransaksiKembali) transaksi).isStatusTelat(),
                    ((TransaksiKembali) transaksi).isStatusRusak(),
                    ((TransaksiKembali) transaksi).getJumlahDenda()
                    );    
                }
        i++;
    }
    
    out.printf("*************************************************************************************************************************************************************%n");
    



                //PENGISIAN DATA UNTUK ARRAY KOLEKSI
                        // Tabel koleksi

                //PENGISIAN DATA UNTUK MEMBER
            
        //TABEL MEMBER
            //TRANSAKSI -- Diakses Pustakawan   
            scan.close();
            out.close();
    
    }
}

