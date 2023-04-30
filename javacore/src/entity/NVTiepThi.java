package entity;

public class NVTiepThi extends NVHanhChinh {

      private double doanhSo;
      private double hoaHong;

      public NVTiepThi(String hoTen, double luong, double doanhSo, double hoaHong) {
            super( hoTen, luong);
            this.doanhSo = doanhSo;
            this.hoaHong = hoaHong;
      }

      @Override
      public double tinhThuNhap() {
            return luong+doanhSo+hoaHong;
      }

//      @Override
//      public double tinhthue() {
//            return 0;
//      }
}

