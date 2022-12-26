package case_study.models;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String dichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, String keiuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, keiuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                "dichVu='" + super.getDichVu() +
                ", dienTichSuDung=" + super.getDienTichSuDung() +
                ", chiPhiThue=" + super.getChiPhiThue() +
                ", soLuongNguoiToiDa=" + super.getSoLuongNguoiToiDa() +
                ", kieuThue=" + super.getKieuThue() +
                '}';
    }
}
