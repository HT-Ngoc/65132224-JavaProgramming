package LAB1_BAI4;

import java.util.Scanner;

public class Delta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.printf("%nDelta = %.2f%n", delta);

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.printf("Can delta = %.2f%n", canDelta);
        } else {
            System.out.println("Delta am, khong co can delta thuc");
        }

        sc.close();
    }
}
