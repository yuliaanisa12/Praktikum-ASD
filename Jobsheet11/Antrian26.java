public class Antrian26 {
    String nama;
    String nim;
    String keperluan;

    public Antrian26(String nama, String nim, String keperluan){
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }
    public void tampilAntrian26() {
        System.out.printf("%-10s %-10s %-10s", nama, nim, keperluan);
    }
}
