package LAB1_BAI2;

import java.util.Scanner;

public class ChuviDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh thu nhat: ");
        double a = sc.nextDouble();

        System.out.print("Nhap canh thu hai: ");
        double b = sc.nextDouble();

        double chuVi = 2 * (a + b);
        double dienTich = a * b;
        double canhNho = Math.min(a, b);

        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Dien tich: %.2f%n", dienTich);
        System.out.printf("Canh nho: %.2f%n", canhNho);

        sc.close();
    }
}
