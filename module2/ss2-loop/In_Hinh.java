import java.util.Scanner;

public class In_Hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i=0;i<3;i++) {
                    for (int j=0;j<5;i++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i=0;i<5;i++) {
                    for (int j=0;j<i;i++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i=0;i<4;i++) {
                    for (int j=1;j<6;j++) {
                        if (i==0 && j==3 || i==1 && (j==2 && j==3 && j==4) ||i==2 && i==2 && (j<5 && j>1) || i==3) {
                            System.out.print("* ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("No choice");
                break;
        }
    }
}
