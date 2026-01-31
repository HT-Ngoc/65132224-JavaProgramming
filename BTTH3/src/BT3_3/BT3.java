package BT3_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHAP THONG TIN SINH VIEN ===");
        System.out.print("Ma sinh vien: ");
        String id = scanner.nextLine();

        System.out.print("Ho ten: ");
        String name = scanner.nextLine();

        System.out.print("Diem Toan: ");
        double math = scanner.nextDouble();

        System.out.print("Diem Ly: ");
        double physics = scanner.nextDouble();

        System.out.print("Diem Hoa: ");
        double chemistry = scanner.nextDouble();

        double average = (math + physics + chemistry) / 3;

        // Xep loai
        String rank;
        if (average >= 8.0) {
            rank = "Gioi";
        } else if (average >= 6.5) {
            rank = "Kha";
        } else if (average >= 5.0) {
            rank = "Trung binh";
        } else {
            rank = "Yeu";
        }

        // Ghi vao file
        try {
            FileWriter writer = new FileWriter("students.txt", true);

            writer.write("=== SINH VIEN ===\n");
            writer.write("Ma SV: " + id + "\n");
            writer.write("Ho ten: " + name + "\n");
            writer.write(String.format("Diem Toan: %.1f%n", math));
            writer.write(String.format("Diem Ly: %.1f%n", physics));
            writer.write(String.format("Diem Hoa: %.1f%n", chemistry));
            writer.write(String.format("Diem TB: %.2f%n", average));
            writer.write("Xep loai: " + rank + "\n");
            writer.write("=================\n\n");

            writer.close();

            System.out.println("\nDa luu thong tin vao file students.txt");
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }

        scanner.close();
    }
}


