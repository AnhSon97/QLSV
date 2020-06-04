package SinhVien;

import java.util.Scanner;

public class Sinhvien {
    private String hoVaTen;
    private int tuoi;
    private String diaChi;
    private int soDienThoai;
    private String Email;
    private String gioitinh;

    public String getNhomdanhba() {
        return nhomdanhba;
    }

    public void setNhomdanhba(String nhomdanhba) {
        this.nhomdanhba = nhomdanhba;
    }

    private String nhomdanhba;


    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }


    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    protected void nhapThongTinSV()
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("nhap vao ho ten sinh vien: ");
        this.hoVaTen = inp.nextLine();
        System.out.print("nhap vao Email: ");
        this.Email  = inp.nextLine();
        System.out.print("nhap vao dia chi : ");
        this.diaChi = inp.nextLine();
        System.out.print("nhap vao so dien thoai: ");
        this.soDienThoai = inp.nextInt();
        System.out.print("nhap vao tuoi sinh vien: ");
        this.tuoi = inp.nextInt();
        System.out.print("nhap vao diem: ");
        this.gioitinh = inp.nextLine();
        inp.hasNextLine();
        System.out.println("nhap nhom danh ba");
        this.nhomdanhba = inp.nextLine();
    }

    protected void xuatThongTinSV()
    {
        System.out.println("Thong tin sinh vien : ");
        System.out.println(" Ho va ten: "+this.hoVaTen);
        System.out.println(" Tuoi: "+this.tuoi);
        System.out.println("Dia chi: "+this.diaChi);
        System.out.println("So dien thoai : "+this.soDienThoai);
        System.out.println("Dia chi email: "+this.Email);
        System.out.println("GioiTinh : "+this.gioitinh);
        System.out.println("nhom danh ba:" + this.nhomdanhba);
    }

}
