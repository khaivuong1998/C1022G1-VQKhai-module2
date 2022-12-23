package ss16_io_test_file.copy_file_text;

import java.io.*;

public class FileUtil {

    public static final String FILE_SOURCE = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\ss16_io_test_file\\copy_file_text\\source file.csv";
    public static final String FILE_CSV = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\ss16_io_test_file\\copy_file_text\\target file.csv";

    public static void readFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(FILE_SOURCE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            int count = 0;
            fileWriter = new FileWriter(FILE_CSV);
            bufferedWriter = new BufferedWriter(fileWriter);
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    count += line.length();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println("source file có " + count + " ký tự");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
