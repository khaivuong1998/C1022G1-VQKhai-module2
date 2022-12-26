package case_study.models;

public class Customer extends Persion {
    private int maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email, int maKhachHang, String loaiKhach, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang=" + maKhachHang +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                "hoVaTen='" + super.getHoVaTen() + '\'' +
                ", ngaySinh='" + super.getNgaySinh() + '\'' +
                ", gioiTinh='" + super.getGioiTinh() + '\'' +
                ", soCMND=" + super.getSoCMND() +
                ", soDienThoai=" + super.getSoDienThoai() +
                ", email='" + super.getEmail() + '\'' +
                '}';
    }
}
