package QuanLy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
public class SanPham {

    public static int dem = 0;
    private int maSanPham;
	private String tenSanPham;
    private double giaBan;
    private DanhMucSanPham danhMucSanPham;
    private KhuyenMai km;
    

    {
        this.maSanPham = ++dem;
    }

    public SanPham(String tenSanPham, double giaBan, DanhMucSanPham danhMucSanPham, KhuyenMai km) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.danhMucSanPham = danhMucSanPham;
        this.km = km;
    }

    public SanPham() {
    }

    public void nhapSanPham() throws ParseException {
        System.out.print("Ten San Pham: ");
        this.tenSanPham = CauHinh.sc.nextLine();

        System.out.print("Gia ban: ");
        this.giaBan = CauHinh.sc.nextDouble();
        CauHinh.sc.nextLine();

        DanhMucSanPham dmsp = new DanhMucSanPham();
        dmsp.nhapDanhMucSp();
        this.danhMucSanPham = dmsp;
        
        nhapKhuyenMai();


    }
   public void nhapKhuyenMai() throws ParseException{
       System.out.print("Chon loai khuyen mai A/B/C or not:  ");
        String chon = CauHinh.sc.nextLine();

        switch (chon) {
            case "A":
            case "a":
                KhuyenMai a = new KhuyenMaiA();
                a.nhapKhuyenMai();
                this.km = a;
                break;
            case "B":
            case "b":
                KhuyenMai b = new KhuyenMaiB();
                b.nhapKhuyenMai();
                this.km = b;
                break;
            case "C":
            case "c":
                KhuyenMai c = new KhuyenMaiC();
                c.nhapKhuyenMai();
                this.km = c;
                break;
            default:
                break;
        }
   }
    public void xuatSanPham() {
        System.out.println("==================================");
        System.out.printf("Ma san Pham: %d\n", this.maSanPham);
        System.out.printf("Ten san pham: %s\n", this.tenSanPham);
        System.out.printf("Gia ban san pham: %,.0f VND\n", this.giaBan);
        System.out.printf("Danh muc san pham: %s\n", this.danhMucSanPham);
        if(this.km!=null)
        xuatKhuyenMai();
    }
    public void xuatKhuyenMai(){
        km.xuatKhuyenMai();
    }

    public void xuatLoaiSanPham() {
        System.out.printf("Loai san pham:%s", this.danhMucSanPham);
    }

    public void xoaKhuyenMai() {
    	this.km=null;
    }
	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public DanhMucSanPham getDanhMucSanPham() {
		return danhMucSanPham;
	}

	public void setDanhMucSanPham(DanhMucSanPham danhMucSanPham) {
		this.danhMucSanPham = danhMucSanPham;
	}

	public KhuyenMai getKm() {
		return km;
	}

	public void setKm(KhuyenMai km) {
		this.km = km;
	}

	
}
/////////////////////////////////////////////////////////////////////////////////////
