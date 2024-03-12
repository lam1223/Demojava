package person;

public class mainPerson {
    public static void main(String[] args) throws Exception {
        Person nguoi = new Person();
        Person human = new Person();
        nguoi.nhapThongTin();
        nguoi.inThongTin();
        nguoi.inThongTin("Nguyen Tung Lam", "0966736888", 2003);

        human.HienThiThongTin();

    }
}
