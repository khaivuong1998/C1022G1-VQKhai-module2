package case_study.read_writer_file;

import case_study.models.Facility;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriterFileRoom {

    public static final String FILE_ROOM_VILLA = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\case_study\\data\\file_room_villa.csv";

    public static Map<Facility, Integer> readRoomVillaCSV() {
        Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_ROOM_VILLA);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Facility facility;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            temp = line.split(",");
            if (temp.length == 8) {
                String serviceName = temp[0];
                String usableArea = temp[1];
                String rentalCosts = temp[2];
                String maximumNumberPeople = temp[3];
                String rentalType = temp[4];
                String serviceCode = temp[5];
                String freeServiceIncluded = temp[6];
                facility = new Room(serviceName, usableArea, rentalCosts, maximumNumberPeople, rentalType, serviceCode,
                        freeServiceIncluded);
                facilityIntegerMap.put(facility, Integer.parseInt(temp[7]));
            }
            if (temp.length == 10) {
                String serviceName = temp[0];
                String usableArea = temp[1];
                String rentalCosts = temp[2];
                String maximumNumberPeople = temp[3];
                String rentalType = temp[4];
                String serviceCode = temp[5];
                String roomStandard = temp[6];
                String swimmingPoolArea = temp[7];
                String numberFloors = temp[8];
                facility = new Villa(serviceName, usableArea, rentalCosts, maximumNumberPeople, rentalType, serviceCode,
                        roomStandard, swimmingPoolArea, numberFloors);
                facilityIntegerMap.put(facility, Integer.parseInt(temp[9]));
            }
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return facilityIntegerMap;
    }

    public static void writerRoomVillaCSV(Map<Facility, Integer> facilityIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_ROOM_VILLA, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if ( entry.getKey()instanceof Villa) {
                    bufferedWriter.write(entry.getKey().toCSV() + "," + entry.getValue());
                    bufferedWriter.newLine();
                } if (entry.getKey()instanceof Room) {
                    bufferedWriter.write(entry.getKey().toCSV() + "," + entry.getValue());
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
