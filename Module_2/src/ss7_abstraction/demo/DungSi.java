package ss7_abstraction.demo;

public abstract class DungSi {
    private String ten;
    private int kinhNghiem;

    public abstract void nhiemVu(String tenNhiemVu);

    public DungSi() {
    }

    public DungSi(String ten, int kinhNghiem) {
        this.ten = ten;
        this.kinhNghiem = kinhNghiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(int kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    @Override
    public String toString() {
        return "DungSi{" +
                "ten='" + ten + '\'' +
                ", kinhNghiem=" + kinhNghiem +
                '}';
    }
}
