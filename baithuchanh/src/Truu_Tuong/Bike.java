package Truu_Tuong;

public abstract class Bike {
    abstract void Run();

    abstract void Use();
}
class Honda extends Bike{
    void Run() {
        System.out.println("Chay nhanh");
    }
    void Use() {
        System.out.println("Dung xang");
    }
    
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.Run();
        obj.Use();

    }

}

