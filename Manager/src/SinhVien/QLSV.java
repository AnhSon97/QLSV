package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;


public class QLSV {
    ArrayList<Sinhvien> sinhvien = new ArrayList<Sinhvien>();
    Sinhvien sv = new Sinhvien();


    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap sinh so sinh vien: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            sv.nhapThongTinSV();
            sinhvien.add(sv);
        }
    }

    public void in() {
        for (Sinhvien sv : sinhvien) {
            sv.xuatThongTinSV();
        }
    }

    public boolean TimSv(String name) {
        System.out.println("nhap ten sinh vien");
        Scanner inp = new Scanner(System.in);
        name = inp.nextLine();
        return sinhvien.contains(name);
    }

    public boolean xoaSV (String name){
        System.out.println("nhap ten sinh vien");
        Scanner inp = new Scanner(System.in);
        name = inp.nextLine();
        return sinhvien.remove(name);
    }

}