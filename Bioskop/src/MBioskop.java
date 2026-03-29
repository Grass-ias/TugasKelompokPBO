import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class MBioskop {
    public static void main(String[] args) {
        System.out.println("[SISTEM ADMIN]");
        Admin admin = new Admin("ADM-01", "admin_root", "admin123", "admin@bioskop.com", "Super Admin");
        admin.login();
        admin.tambahFilm();

        Film film1 = new Film("Spider-Man: Beyond the Spider-Verse", "Animation/Action", 140, "SU");
        
        Studio studio1 = new Studio("Studio 1 IMAX", 50);
        Kursi k1 = new Kursi("A1", 'A');
        Kursi k2 = new Kursi("A2", 'A');
        Kursi k3 = new Kursi("A3", 'A');
        studio1.tambahKursi(k1);
        studio1.tambahKursi(k2);
        studio1.tambahKursi(k3);
        admin.kelolaStudio();

        Date hariIni = new Date(); 
        Time jamTayang = Time.valueOf("15:30:00");
        JadwalTayang jadwal1 = new JadwalTayang(hariIni, jamTayang, 50000.0, film1, studio1);
        admin.kelolaJadwal();

        System.out.println("\n[SISTEM PELANGGAN]");
        Pelanggan pelanggan1 = new Pelanggan("P-001", "pei", "pei123", "pei@email.com", "Caesar Ferdianan Suwandi", "08123456789");
        pelanggan1.login();

        System.out.println("\n[Pelanggan mengecek jadwal tayang]");
        jadwal1.tampilInfoJadwal();

        System.out.println("\n[Pelanggan mengecek studio]");
        studio1.tampilInfoStudio();

        Tiket tiket1 = pelanggan1.pesanTiket(jadwal1, k2, "TKT-999X");

        System.out.println("\n[SISTEM KASIR]");
        Transaksi trx1 = new Transaksi("TRX-2026", jadwal1.getHarga(), "Pending", "QRIS", tiket1, pelanggan1);
        
        trx1.proses(); 
        pelanggan1.tambahRiwayat(trx1);

        System.out.println("\n[Bukti Struk Transaksi]");
        trx1.cetakStruk();

        System.out.println("\n");
        List<CetakBukti> mesinPrinter = new ArrayList<>();
        mesinPrinter.add(admin);
        mesinPrinter.add(tiket1);

        for (CetakBukti dokumen : mesinPrinter) {
            dokumen.cetakBukti();
        }

        System.out.println("\n[Cek Profil Update]");
        pelanggan1.tampilProfil();
        pelanggan1.lihatRiwayat();
    }
}