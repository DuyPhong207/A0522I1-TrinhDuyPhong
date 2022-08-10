public class TongDuongCheo {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {12,23,123,156},
                {45,34,65,76},
                {54,434,234,96}
        };
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[i].length;j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.print("\n");
        }
        int sum = 0;
        for (int i = 0;i < arr.length;i++) {
            sum = sum + arr[i][i];
        }
        int j = arr.length - 1;
        for (int i = 0;i < arr.length;i++) {
            sum = sum + arr[i][j-i];
        }
        System.out.println("Tổng các phần tử đường chéo = " + sum);
    }
}
