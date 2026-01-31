package BTVN3_1;

import java.util.Scanner;

public class BTVN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so dien (kWh): ");
        int kwh = sc.nextInt();

        double tienDien = 0;

        if (kwh <= 50) {
            tienDien = kwh * 1678;
        } else if (kwh <= 100) {
            tienDien = 50 * 1678 + (kwh - 50) * 1734;
        } else if (kwh <= 200) {
            tienDien = 50 * 1678 + 50 * 1734 + (kwh - 100) * 2014;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kwh - 200) * 2536;
        }

        System.out.printf("Tien dien phai tra: %,.0f VND%n", tienDien);

        sc.close();
    }
}
