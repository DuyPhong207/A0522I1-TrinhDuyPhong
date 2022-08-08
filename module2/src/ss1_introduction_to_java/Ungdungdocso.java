package ss1_introduction_to_java;

import java.util.Scanner;

public class Ungdungdocso {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = sc.nextDouble();
        double quidoi = usd * vnd;
        System.out.println("Số tiền đổi sang VND: " + quidoi);
    }
}
