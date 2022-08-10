public class In20SntDauTien {
    public static void main(String[] args) {
        byte count = 0;
        for (int i = 0;;i++) {
            if (checkNum(i)) {
                System.out.println(i);
                count++;
            }
            if (count > 20) {
                break;
            }
        }
    }

    public static boolean checkNum(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}