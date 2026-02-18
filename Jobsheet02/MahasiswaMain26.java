package Jobsheet02;

public class MahasiswaMain26 {
    public static void main(String[] args) {
        Mahasiswa26 mhs1 = new Mahasiswa26();
        mhs1.nama = "Muhammad Alif Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "TI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilInfomasi();
        mhs1.UbahKelas("SI 1C");
        mhs1.updateIPK(3.6);
        mhs1.tampilInfomasi();
        
        Mahasiswa26 mhs2 = new Mahasiswa26("Muhammad Alif Farhan", "2241720173", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilInfomasi();
        
        Mahasiswa26 mhs3 = new Mahasiswa26("Yulia Anisa Putri Rafa","254107060141", 4.00, "SIB 1C");
        mhs3.tampilInfomasi();
    }
    

} 