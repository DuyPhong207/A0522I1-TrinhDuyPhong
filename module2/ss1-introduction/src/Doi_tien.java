import java.util.Scanner;

public class Doi_tien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = sc.nextDouble();
        double quidoi = usd * vnd;
        System.out.println("Số tiền VND: " + quidoi);
    }
}
