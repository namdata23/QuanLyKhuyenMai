package QuanLy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class KhuyenMai {
//  public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	private Date ngayTao;
	private Date ngayHetHieuLuc;
	protected String maKM;

	private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

	public KhuyenMai(Date ngayTao, Date ngayHetHieuLuc) {
		this.ngayTao = ngayTao;
		this.ngayHetHieuLuc = ngayHetHieuLuc;
	}

	public KhuyenMai(String ngayTao, String ngayHetHieuLuc) throws ParseException {
		this.ngayTao = f.parse(ngayTao);
		this.ngayHetHieuLuc = f.parse(ngayHetHieuLuc);
	}

	public KhuyenMai() {
	}

	public void nhapKhuyenMai() throws ParseException {

		System.out.print("Ngay tao (dd/MM/yyyy): ");
		String dayCreate = CauHinh.sc.nextLine();
		this.ngayTao = CauHinh.f.parse(dayCreate);
		System.out.print("Ngay het han (dd/MM/yyyy): ");
		String dayEnd = CauHinh.sc.nextLine();
		this.ngayHetHieuLuc = CauHinh.f.parse(dayEnd);
		while(this.ngayHetHieuLuc.before(ngayTao)) {
			System.out.println("Ngay het han khong duoc truoc ngay tao");
			System.out.println("====Vui long nhap lai====");
			System.out.print("Ngay het han(dd/MM/yyyy): ");
			String dayEnd2= CauHinh.sc.nextLine();
			dayEnd= dayEnd2;
			this.ngayHetHieuLuc= CauHinh.f.parse(dayEnd);
		}

	}

	public void xuatKhuyenMai() {
		System.out.printf("Ngay tao ma Khuyen Mai: %s\n", f.format(this.getNgayTao()));
		System.out.printf("Ngay het han Khuyen Mai: %s\n", f.format(this.getNgayHetHieuLuc()));
		 if (getHanSuDung() > 0) {
	            System.out.println("Han su dung ma khuyen mai con lai: " + getHanSuDung() + " ngay");
	        } else {
	            System.out.println("=> Khuyen mai da qua han! ");
//	           + getHanSuDung() + " ngay");

	        }
	}
	public long getHanSuDung() {
        Date n = new Date();
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(n);
        c2.setTime(this.ngayHetHieuLuc);
//        long dateEnd = this.ngayHetHieuLuc.getTime();
        long xDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000) + 1;
        if (xDay >= 0) {
            return xDay;
        } else {
            return 0;
        }
	}
//   long ngayHieuLuc = Math.abs(this.ngayHetHieuLuc.getTime()-this.ngayTao.getTime());
//		
//		return ngayHieuLuc/(24*3600*1000);
//    }


	public String getMaKM() {
		return maKM;
	}

	public void setMaKM(String maKM) {
		this.maKM = maKM;
	}

	/**
	 * @return the ngayTao
	 */
	public Date getNgayTao() {
		return ngayTao;
	}

	/**
	 * @param ngayTao the ngayTao to set
	 */
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	/**
	 * @return the ngayHetHieuLuc
	 */
	public Date getNgayHetHieuLuc() {
		return ngayHetHieuLuc;
	}

	/**
	 * @param ngayHetHieuLuc the ngayHetHieuLuc to set
	 */
	public void setNgayHetHieuLuc(Date ngayHetHieuLuc) {
		this.ngayHetHieuLuc = ngayHetHieuLuc;
	}

	public void themDichVu(DichVuTangKem dvtk1) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
