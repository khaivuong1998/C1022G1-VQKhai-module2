package ss16_io_test_file.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String FILE_NATION = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\ss16_io_test_file\\doc_file_csv\\Nation.csv";

    public static List<Nation> readNation() throws IOException {
        List<Nation> myNation = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_NATION);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String str[];
        Nation nation;
        while ((line = bufferedReader.readLine()) != null) {
            str = line.split(",");
            int id = Integer.parseInt(str[0]);
            String code = str[1];
            String name = str[2];
            nation = new Nation(id, code, name);
            myNation.add(nation);
        }
        bufferedReader.close();
        return myNation;
    }

    public static void main(String[] args) throws IOException {
        List<Nation> myNation = readNation();
        for (Nation nation : myNation) {
            System.out.println(nation);
        }
    }
}
