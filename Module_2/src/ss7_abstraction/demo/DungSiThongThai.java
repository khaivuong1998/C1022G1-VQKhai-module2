package ss7_abstraction.demo;

public class DungSiThongThai extends DungSi implements IVuKhi {
    public DungSiThongThai() {
    }

    public DungSiThongThai(String ten, int kinhNghiem) {
        super(ten, kinhNghiem);
    }

    @Override
    public void nhiemVu(String tenNhiemVu) {
        System.out.println("Dung si thong thai " + super.getTen() + " di lam nhiem vu: " + tenNhiemVu);
    }

    @Override
    public void dungVuKhi(String tenVuKhi) {
        System.out.println("Dung si thong thai " + super.getTen() + " dung vu khi: " + tenVuKhi);
    }
}
