import java.util.Scanner;

public class KiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì");
        String chuoi = sc.nextLine();
        char kiTu = 'a';
        System.out.println("Chuỗi nhập vào: " + chuoi);
        System.out.println("Kí tự cần kiểm tra: " + kiTu);
        int dem = 0;
        for (int i = 0;i < chuoi.length();i++) {
            if (chuoi.charAt(i) == kiTu) {
                dem++;
            }
        }
        System.out.println("Số lần xuất hiện: " + dem);
    }
}
