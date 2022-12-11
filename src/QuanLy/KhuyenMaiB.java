package QuanLy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class KhuyenMaiB extends KhuyenMai {
	//public static int demB = 0;

	    private int idB;
	    private static final String maB = "B";
	    private List<DichVuTangKem> dvtk = new ArrayList<>();
	    List<Integer> listNumRanDom = new ArrayList<>();
	    {
	        idB = (int) ((Math.random()) * ((9999 - 1000) + 1) + 1000);
	        maKM=String.format("B%04d", idB);
	        this.listNumRanDom.add(idB);
	        for (int a : this.listNumRanDom) {
	            if (a == idB) {
	                idB = (int) ((Math.random()) * ((9999 - 1000) + 1) + 1000);
	                maKM = String.format("B%04d", idB);
	            }
	        }
	    }

	    public KhuyenMaiB(String ngayTao, String ngayHetHieuLuc) throws ParseException {
	        super(ngayTao, ngayHetHieuLuc);
	    }

	    public KhuyenMaiB() {
	    }

	    @Override
	    public void nhapKhuyenMai() throws ParseException {
	        super.nhapKhuyenMai();
	        DichVuTangKem dv = new DichVuTangKem();     
	                dv.nhapDichVuTangKem();
	                themDichVu(dv);           
	        }    

	    @Override
	    public void xuatKhuyenMai() {
	        super.xuatKhuyenMai();

//	        double ranNum=(Math.random())*((9999-1000)+1)+1000;
//	        System.out.printf("khuyen mai loai:%s%05d\n", this.maB, idD);
	        System.out.println("Khuyen mai loai: "+this.maKM );

	        xuatDichVu();
	    }

	    public void xuatDichVu() {
	        this.dvtk.forEach(h -> h.xuatDichVuTangKem());
	    }

	    public void themDichVu(DichVuTangKem s) {
	        this.dvtk.add(s);
	    }

	    /**
	     * @return the dvtk
	     */
	    public List<DichVuTangKem> getDvtk() {
	        return dvtk;
	    }

	    /**
	     * @param dvtk the dvtk to set
	     */
	    public void setDvtk(List<DichVuTangKem> dvtk) {
	        this.dvtk = dvtk;
	    }

	    private Object dvtk() {
	        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	    }

	}
