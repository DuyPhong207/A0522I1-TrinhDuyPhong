import java.util.Scanner;

public class PhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng");
        int amount = sc.nextInt();
        int[] arr= new int[amount];
        for (int i = 0;i < amount;i++) {
            System.out.println("Nhập phần tử cho mảng");
            int element = sc.nextInt();
            arr[i] = element;
        }
        int min = arr[0];
        System.out.println("Mảng nhập vào");
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + ", ");
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nMin: " + min);
    }
}
