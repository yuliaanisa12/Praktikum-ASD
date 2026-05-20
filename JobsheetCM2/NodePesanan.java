// class node meyimpan data pesanan dlm struktur linked list 
public class NodePesanan {
    Pesanan data; // menyimpan objek pesanan sbg isi node
    NodePesanan next; // pointer ke node ...
    NodePesanan prev;
    // konstruktor membuat node baru dengan data pesanan
    public NodePesanan(Pesanan data) {
        this.data = data; // mengisi node dengan objk pesanan
        this.next = null; // awalnya tdk ada node brkkut
        this.prev = null; // ----- node sbelumnya 
    }
}