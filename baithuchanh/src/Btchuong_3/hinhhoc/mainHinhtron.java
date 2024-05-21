package hinhhoc;
public class mainHinhtron {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        HinhTron ht2 = new HinhTron();
        System.out.print("hinh tron thu 1\n");
        ht.nhapbankinh();
        ht.tinhChuvi();
        ht.tinhDientich();
        ht.inChuvi();
        ht.inDientich();

        System.out.print("hinh tron thu 2\n");
        ht2.dt = 35;
        ht2.nhapbankinh();
        ht2.tinhChuvi();
        ht2.tinhDientich();
        ht2.inChuvi();
        ht2.inDientich();

    }
}
