public class TugasMahasiswa {
    
    String nim;
    String nama;
    String jurusan;

    TugasMahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    void tampilIformasi() {
        System.out.printf("%-12s %-15s %-10s\n", nim, nama, jurusan);
    }
 }
 
