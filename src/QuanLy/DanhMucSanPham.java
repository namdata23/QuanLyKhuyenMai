package QuanLy;

public class DanhMucSanPham {
	 private String loaiSp;

	    public DanhMucSanPham(String loaiSp) {
	        this.loaiSp = loaiSp;
	    }

	    public DanhMucSanPham() {
	    }

	    public String nhapDanhMucSp() {
	        System.out.print("Nhap danh muc san pham : ");
	     return this.loaiSp = CauHinh.sc.nextLine();
	        
	    }

	    public void xuatDanhMucSp() {
	        System.out.println(this.loaiSp);
	    }

	    /**
	     * @return the loaiSp
	     */
	    public String getLoaiSp() {
	        return loaiSp;
	    }

	    /**
	     * @param loaiSp the loaiSp to set
	     */
	    public void setLoaiSp(String loaiSp) {
	        this.loaiSp = loaiSp;
	    }

	    @Override
	    public String toString() {
	        return this.getLoaiSp();
	    }
	

}
