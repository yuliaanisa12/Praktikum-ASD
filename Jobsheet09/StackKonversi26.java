public class StackKonversi26 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi26(){
        this.size = 32;
        tumpukanBiner = new int [size];
        top = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void push(int data){
        if (!isFull()){
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("stack penuh");

        }
    }
    public int pop () {
        if (isEmpty()){
            System.out.println("stack kosong");
            return -1;        
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
