package case_study.repository.class_repositorys;

import case_study.models.Facility;
import case_study.read_writer_file.ReadWriterFileRoomVilla;
import case_study.repository.interfaces.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements IFacilityRepository {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
//    static Map<Villa, Integer> facilityIntegerMap1 = new LinkedHashMap<>();
//    static Facility facility1 = new Room("phong 1", "50", "1000000", "3", "nam", "SVRO-1654", "nước miễn phí");
//    static Facility facility2 = new Room("phong 2", "50", "1000000", "3", "thang", "SVRO-1458", "nước miễn phí");
//    static Facility facility3 = new Room("phong 3", "100", "2000000", "5", "nam", "SVRO-1848", "nước miễn phí");
//    static Facility facility4 = new Villa("villa nho", "200", "5000000", "10", "nam", "SVVL-1849", "Vip", "25", "3");
//    static Facility facility5 = new Villa("villa vua", "300", "10000000", "15", "nam", "SVVL-5184", "Vip pro", "30.5", "4");
//    static Facility facility6 = new Villa("villa lon", "500", "20000000", "20", "nam", "SVVL-5987", "Vip pro", "30.5", "5");
//
//    static {
//        facilityIntegerMap.put(facility1, 0);
//        facilityIntegerMap.put(facility2, 5);
//        facilityIntegerMap.put(facility3, 12);
//        facilityIntegerMap.put(facility4, 1);
//        facilityIntegerMap.put(facility5, 4);
//        facilityIntegerMap.put(facility6, 3);
//    }

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap1 = ReadWriterFileRoomVilla.readRoomVillaCSV();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap1.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " lần sử dụng");
            }
        }
    }

    @Override
    public void add(Object object) {
        Facility facility = (Facility) object;
        facilityIntegerMap.clear();
        facilityIntegerMap.put(facility, 0);
        ReadWriterFileRoomVilla.writerRoomVillaCSV(facilityIntegerMap);
    }

    @Override
    public void displayFacilityMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " lần sử dụng");
            }
        }
    }
}
