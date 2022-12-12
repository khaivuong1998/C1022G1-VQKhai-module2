package ss7_abstraction.demo;

public class DungSiDepTrai extends DungSi {
    public DungSiDepTrai() {
    }

    public DungSiDepTrai(String ten, int kinhNghiem) {
        super(ten, kinhNghiem);
    }

    @Override
    public void nhiemVu(String tenNhiemVu) {
        System.out.println("Dung si dep trai " + super.getTen() + " di lam nhiem vu: " + tenNhiemVu);
    }
}
