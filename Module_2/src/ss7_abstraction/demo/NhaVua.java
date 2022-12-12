package ss7_abstraction.demo;

public class NhaVua {
    public static void main(String[] args) {
        DungSiDepTrai ds1 = new DungSiDepTrai("Dao",5);
        ds1.nhiemVu("cuu cong chua");
        DungSiThongThai ds2 = new DungSiThongThai("Dong", 7);
        ds2.dungVuKhi("kiem lua");
        ds2.nhiemVu("diet rong");
    }
}
