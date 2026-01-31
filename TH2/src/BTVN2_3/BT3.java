package BTVN2_3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap a: ");
            double a = sc.nextDouble();

            System.out.print("Nhap b: ");
            double b = sc.nextDouble();

            if (a != 0) {
                double x = -b / a;
                System.out.printf("Phuong trinh co nghiem: x = %.2f%n", x);
            } else {
                if (b == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Loi: Vui long nhap so hop le!");
        }

        sc.close();
    }
}

