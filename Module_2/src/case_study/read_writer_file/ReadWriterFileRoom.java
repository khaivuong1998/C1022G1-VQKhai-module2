package case_study.read_writer_file;

import case_study.models.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriterFileRoom {

    public static final String FILE_ROOM = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\case_study\\data\\file_room.csv";

    public static Map<Room, Integer> readRoomCSV() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_ROOM);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Room room;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            temp = line.split(",");
            String serviceName = temp[0];
            String usableArea = temp[1];
            String rentalCosts = temp[2];
            String maximumNumberPeople = temp[3];
            String rentalType = temp[4];
            String serviceCode = temp[5];
            String freeServiceIncluded = temp[6];
            room = new Room(serviceName, usableArea, rentalCosts, maximumNumberPeople, rentalType, serviceCode,
                    freeServiceIncluded);
            roomIntegerMap.put(room, Integer.parseInt(temp[7]));
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return roomIntegerMap;
    }

    public static void writerRoom1CSV(Map<Room, Integer> roomIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_ROOM, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        try {
            for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().toCSV() + "," + entry.getValue());
                bufferedWriter.newLine();
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

    public static void writerRoom2CSV(Map<Room, Integer> roomIntegerMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_ROOM);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        try {
            for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
                bufferedWriter.write(entry.getKey().toCSV() + "," + entry.getValue());
                bufferedWriter.newLine();
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
