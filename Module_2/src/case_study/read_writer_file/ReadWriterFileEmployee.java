package case_study.read_writer_file;

import case_study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterFileEmployee {

    public static final String FILE_EMPLOYEE = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\case_study\\data\\file_employee.csv";

    public static List<Employee> readEmployeeCSV() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_EMPLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    String name = temp[0];
                    String dateOfBith = temp[1];
                    String sex = temp[2];
                    String idNumber = temp[3];
                    String phoneNumber = temp[4];
                    String email = temp[5];
                    String employeeCode = temp[6];
                    String level = temp[7];
                    String position = temp[8];
                    String wage = temp[9];
                    employee = new Employee(name, dateOfBith, sex, idNumber, phoneNumber, email, employeeCode,
                            level, position, wage);
                    employeeList.add(employee);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    public static void writerEmployee1CSV(List<Employee> employeeList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_EMPLOYEE, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toCSV());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writerEmployee2CSV(List<Employee> employeeList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_EMPLOYEE);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toCSV());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
