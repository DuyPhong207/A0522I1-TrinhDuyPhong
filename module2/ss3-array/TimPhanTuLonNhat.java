public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5,6},
                {12,23,123,121,15},
                {45,34,65,76,341,41}
        };
        int max = arr[0][0];
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[i].length;j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Mảng 2 chiều");
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[i].length;j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.print("\n");
        }
        System.out.println("Max number: " + max);
    }
}
