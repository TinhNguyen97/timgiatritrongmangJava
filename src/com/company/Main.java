package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sinhVien;
        String array[] = {"An", "Bình", "Hương", "Linh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên:");
        sinhVien = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(sinhVien)) {
                index = i;
                break;
            }
        }
        if (index==-1) {
            System.out.println("Không có sinh viên cần tìm!");
        } else
            System.out.println("Sinh viên " + sinhVien + " có vị trí " + index);
    }
}
