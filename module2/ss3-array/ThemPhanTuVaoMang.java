import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = new int[arr.length + 1];
        System.out.println("Mảng ban đầu");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0;i < arr.length;i++) {
            newArr[i] = arr[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập phần tử muốn thêm");
        int num = sc.nextInt();
        System.out.println("\nNhập vị trí muốn thêm");
        int indexNum = sc.nextInt();
        if (indexNum > arr.length || indexNum < 1) {
            System.out.println("Nhập lại vị trí muốn thêm");
        } else {
            for (int i = 0;i < newArr.length;i++) {
                if (i == indexNum - 1) {
                    for (int j = newArr.length - 1;j > i;j--) {
                        newArr[j] = newArr[j - 1];
                    }
                    newArr[i] = num;
                }
            }
        }

        System.out.println("Mảng sau khi thêm");
        for (int i = 0;i < newArr.length;i++) {
            System.out.print(newArr[i] + ", ");
        }
    }
}
