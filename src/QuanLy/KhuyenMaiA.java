package QuanLy;

import static QuanLy.SanPham.dem;
import java.text.ParseException;
import java.util.Date;

import static QuanLy.SanPham.dem;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class KhuyenMaiA extends KhuyenMai {
    private static int demA = 0;
//    private int idA;
    private static final String maA = "A";
    private static final double tyLeGiamGia = 20;
    {
//        this.idA=++demA;
        maKM=String.format("A%02d",++demA);
    }
    public KhuyenMaiA(String ngayTao, String ngayHetHieuLuc) throws ParseException {
        super(ngayTao, ngayHetHieuLuc);
    }

    public KhuyenMaiA() {
    }
    

    @Override
    public void xuatKhuyenMai() {
        super.xuatKhuyenMai();

//        System.out.printf("khuyen mai loai:%s%02d\n", this.maA,this.idA);
        System.out.println("Ma khuyen mai loai: "+ this.maKM);

        System.out.printf("Ty le giam gia: %.1f%s\n", tyLeGiamGia,"%");

    }

}
