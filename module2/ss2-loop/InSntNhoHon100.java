public class InSntNhoHon100 {
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            if (checkNum(i)) {
                System.out.println(i);
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
