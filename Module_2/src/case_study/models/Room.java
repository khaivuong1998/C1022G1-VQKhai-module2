package case_study.models;

public class Room extends Facility{
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoiToiDa, String keiuThue, String dichVuMienPhiDiKem) {
        super(dichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, keiuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                "dichVu='" + super.getDichVu() +
                ", dienTichSuDung=" + super.getDienTichSuDung() +
                ", chiPhiThue=" + super.getChiPhiThue() +
                ", soLuongNguoiToiDa=" + super.getSoLuongNguoiToiDa() +
                ", kieuThue=" + super.getKieuThue() +
                '}';
    }
}
