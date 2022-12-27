package case_study.models;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String service, String usableArea, String rentalCosts, String maximumNumberPeople, String rentalType, String tieuChuanPhong, double dienTichHoBoi, String soTang) {
        super(service, usableArea, rentalCosts, maximumNumberPeople, rentalType);
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

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                "service='" + super.getService() +
                ", usableArea=" + super.getUsableArea() +
                ", rentalCosts=" + super.getRentalCosts() +
                ", maximumNumberPeople=" + super.getmaximumNumberPeople() +
                ", kieuThue=" + super.getKieuThue() +
                '}';
    }
}
