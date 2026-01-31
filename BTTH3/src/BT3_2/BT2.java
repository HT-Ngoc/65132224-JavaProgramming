package BT3_2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TINH CHI SO BMI ===");
        System.out.print("Nhap can nang (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Nhap chieu cao (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("%n=== KET QUA ===%n");
        System.out.printf("Can nang: %.1f kg%n", weight);
        System.out.printf("Chieu cao: %.2f m%n", height);
        System.out.printf("Chi so BMI: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Phan loai: Thieu can");
        } else if (bmi < 25) {
            System.out.println("Phan loai: Binh thuong");
        } else if (bmi < 30) {
            System.out.println("Phan loai: Thua can");
        } else {
            System.out.println("Phan loai: Beo phi");
        }

        scanner.close();
    }
}

