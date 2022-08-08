package ss1_introduction_to_java;

import java.util.Scanner;

public class Alert_Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
