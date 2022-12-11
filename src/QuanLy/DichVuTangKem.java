package QuanLy;

public class DichVuTangKem {
//  public static int demdv = 0;
  private String dichVu;

  public DichVuTangKem(String dichVu) {
      this.dichVu = dichVu;
  }

  public DichVuTangKem() {
  }
  public void nhapDichVuTangKem(){
	  
      System.out.print("Nhap dich vu tang kem: ");
      this.dichVu=CauHinh.sc.nextLine();
    
     
  }
  public void xuatDichVuTangKem() {
      System.out.printf("Dich vu tang kem : %s\n ", this.dichVu);
  }
}


