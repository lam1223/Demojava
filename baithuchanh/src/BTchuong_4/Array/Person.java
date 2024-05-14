package Array;

import java.util.Scanner;

public class Person {
    public String fullName;
    public int age;

    public Person(){    
    } 
    public Person(String fullName, int age){
        this.fullName= fullName;
        this.age=age;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: "); fullName= sc.nextLine();
        System.out.println("Nhap tuoi:"); age= sc.nextInt();
    }
    public void inThongTin(){
        System.out.println("ten: " +fullName);
        System.out.println("tuoi: "+ age);
    }
}
