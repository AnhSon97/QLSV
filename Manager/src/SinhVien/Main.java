package SinhVien;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        QLSV ql = new QLSV();
        System.out.println("Moi chon chuc nang");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        System.out.println("1: nhap thong tin SV");
        System.out.println("2: in thong tin SV");
        System.out.println("3: tim thong tin SV");
        System.out.println("3: Xoa thong tin SV");



        switch(num){
            case 1:
                ql.nhap();
                break;
            case 2:
                ql.in();
                break;
            case 3:

                String name = inp.nextLine();
                ql.TimSv(name);
                break;
            case 4:
                String name1 = inp.nextLine();
                ql.xoaSV(name1);

        }

    }
}
