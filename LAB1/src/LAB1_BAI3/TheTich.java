package LAB1_BAI3;

import java.util.Scanner;

public class TheTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh khoi lap phuong: ");
        double a = sc.nextDouble();

        double theTich = a * a * a;

        System.out.printf("The tich khoi lap phuong: %.2f%n", theTich);

        sc.close();
    }
}

