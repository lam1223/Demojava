package TruuTuong;

interface printable {
    void print();
}
class A1 implements printable {
    public void print() {
        System.out.println("Hello");
    }
    public static void main(String args[]){
        A1 obj = new A1();
        obj.print();
            
        };
    }
