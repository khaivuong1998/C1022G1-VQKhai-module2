package case_study.repository;

import case_study.models.Facility;
import case_study.models.Room;
import case_study.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements IFacilityRepository {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Facility facility1 = new Room("fgwj", "akufgyfgq", "agfyqfqq", "20", "sfyagya", "yewfgyfqgyqcw", "shvquyv4");
    static Facility facility2 = new Room("fgwj", "akufgyfgq", "agfyqfqq", "20", "sfyagya", "yewfgyfqgyqcw", "q1q4cqq");
    static Facility facility3 = new Room("fgwj", "akufgyfgq", "agfyqfqq", "20", "sfyagya", "yewfgyfqgyqcw", "yyq154");
    static Facility facility4 = new Villa("ưvywg", "ừuqycqc", "ừuqgfq", "ưvuiuaac", "ưgehhuacuc", "ưgyggq", "ưvuquvq", 25, "vcyvu");
    static Facility facility5 = new Villa("ưvywg", "ừuqycqc", "ừuqgfq", "ưvuiuaac", "ưgehhuacuc", "qcuqiuc", "ưgyggq", 30.5, "ựyvgqy");
    static Facility facility6 = new Villa("ưvywg", "ừuqycqc", "ừuqgfq", "ưvuiuaac", "ưgehhuacuc", "ưuvvq51", "ưgyggq", 30.5, "ựyvgqy");

    static {
        facilityIntegerMap.put(facility1, 0);
        facilityIntegerMap.put(facility2, 0);
        facilityIntegerMap.put(facility3, 2);
        facilityIntegerMap.put(facility4, 0);
        facilityIntegerMap.put(facility5, 0);
        facilityIntegerMap.put(facility6, 2);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    @Override
    public void add(Object object) {

    }
}
