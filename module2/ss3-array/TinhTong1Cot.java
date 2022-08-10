import java.util.Scanner;

public class TinhTong1Cot {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5,6},
                {12,23,123,121,15,143},
                {45,34,65,76,341,41}
        };
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[i].length;j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.print("\n");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính");
        int rol = sc.nextInt();
        if (rol > arr[0].length) {
            System.out.println("Nhập lại");
        } else {
            int sum = 0;
            for (int i = 0;i < arr.length;i++) {
                sum = sum + arr[i][rol];
            }
            System.out.println("Tổng các phần tử cột " + rol + " = " + sum);
        }
    }
}
