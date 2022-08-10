import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Mảng trước khi xóa");
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + ", ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap phan tu can xoa");
        int num_Del = sc.nextInt();
        for (int i = 0;i < array.length;i++) {
            if (array[i] == num_Del) {
                System.out.println("Index Del: " + i);
                for (int j = i;j < array.length - 1;j++) {
                    array[j] = array[j+1];
                }
                array[array.length - 1] = 0;
            }
        }
        System.out.println("Mảng sau khi xóa");
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
