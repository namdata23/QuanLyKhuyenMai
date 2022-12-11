package QuanLy;

import static QuanLy.SanPham.dem;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class KhuyenMaiC extends KhuyenMai{
	public static int demC = 0;
    private static final String maC = "C";
    private DanhMucSanPham loaiSanPhamGiam;
    private static final double tyLeGiamGiam = 60;
    {
    	  maKM = String.format("C%04d", ++demC);
    }

    public KhuyenMaiC(String ngayTao, String ngayHetHieuLuc, DanhMucSanPham loaiSanPhamGiam) throws ParseException {
        super(ngayTao, ngayHetHieuLuc);
        this.loaiSanPhamGiam = loaiSanPhamGiam;
    }

    public KhuyenMaiC() {
    }

    @Override
    public void xuatKhuyenMai() {
        super.xuatKhuyenMai();
        System.out.println("Khuyen mai loai: " + this.maKM);
        System.out.print("Loai san pham duoc giam la: ");
        this.getLoaiSanPhamGiam().xuatDanhMucSp();
        System.out.printf("Ty le phan tram giam gia : %.1f %s\n",this.tyLeGiamGiam,"%" );
    }

    @Override
    public void nhapKhuyenMai() throws ParseException {
        super.nhapKhuyenMai();
        DanhMucSanPham dmsp=new DanhMucSanPham();
        System.out.println("~~Nhap loai san pham duoc giam khi mua kem~~");
        dmsp.nhapDanhMucSp();
        this.loaiSanPhamGiam=dmsp;
        
    }

    /**
     * @return the maC
     */
    public static String getMaC() {
        return maC;
    }

    /**
     * @return the loaiSanPhamGiam
     */
    public DanhMucSanPham getLoaiSanPhamGiam() {
        return loaiSanPhamGiam;
    }

    /**
     * @param loaiSanPhamGiam the loaiSanPhamGiam to set
     */
    public void setLoaiSanPhamGiam(DanhMucSanPham loaiSanPhamGiam) {
        this.loaiSanPhamGiam = loaiSanPhamGiam;
    }

    /**
     * @return the tyLeGiamGiam
     */
    public static double getTyLeGiamGiam() {
        return tyLeGiamGiam;
    }
    

}


