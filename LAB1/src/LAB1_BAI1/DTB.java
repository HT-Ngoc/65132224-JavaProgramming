package LAB1_BAI1;

import java.util.Scanner;

public class DTB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten sinh vien: ");
        String name = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double average = sc.nextDouble();

        System.out.println("\n=== THONG TIN SINH VIEN ===");
        System.out.printf("Ho va ten: %s%n", name);
        System.out.printf("Diem trung binh: %.2f%n", average);

        sc.close();
    }
}
