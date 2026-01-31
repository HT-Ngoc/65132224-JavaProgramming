package BTVN3_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NhatKyCaNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap noi dung nhat ky:");
        String content = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("nhatky.txt", true);
            writer.write(content + "\n");
            writer.close();

            System.out.println("Da luu nhat ky vao file!");
        } catch (IOException e) {
            System.out.println("Loi ghi file!");
        }

        sc.close();
    }
}
