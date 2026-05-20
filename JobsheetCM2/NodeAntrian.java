// class node menyimpan data pembeli dlm struktur linked list 
public class NodeAntrian {
    Pembeli data; // menyimpan objek pembelia sebgai isi node
    NodeAntrian next; // pointer berikutnya 
    NodeAntrian prev; // pointer seblumnya 
    // konstruktor membuat node baru dengan data pembeli 
    public NodeAntrian(Pembeli data) {
        this.data = data; //mengisi node dengan objek pembeli
        this.next = null; 
        this.prev = null;
    }
}