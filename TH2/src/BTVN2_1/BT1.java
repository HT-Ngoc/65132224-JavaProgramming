package BTVN2_1;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so gio lam
        System.out.print("Nhap so gio lam: ");
        double hours = sc.nextDouble();

        // Nhap luong theo gio
        System.out.print("Nhap luong theo gio: ");
        double rate = sc.nextDouble();

        double totalSalary;

        // Tinh luong
        if (hours <= 40) {
            totalSalary = hours * rate;
        } else {
            double overtimeHours = hours - 40;
            totalSalary = 40 * rate + overtimeHours * rate * 1.5;
        }

        // In ket qua
        System.out.println("Tong luong nhan vien: " + totalSalary);

        sc.close();
    }
}
