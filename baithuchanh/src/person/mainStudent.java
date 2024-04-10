package person;
public class mainStudent {
    public static void main(String[] args) throws Exception {
        Student Std = new Student();
        System.out.println("Sinh vien: ");
        Std.nhapgiatri();
        Std.inGiatri();
        System.out.println("\ntuoi cua ban la : " + Std.Tinhtuoi());
        System.out.println("diem cua mon hoc la : " + Std.Tinhdiem());
        Std.doiDiem();


    }
    
}
