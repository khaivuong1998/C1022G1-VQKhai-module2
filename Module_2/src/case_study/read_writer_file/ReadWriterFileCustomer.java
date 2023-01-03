package case_study.read_writer_file;

import case_study.models.Customer;
import case_study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterFileCustomer {

    public static final String FILE_CUSTOMER = "D:\\codegym\\C1022G1-VQKhai-module2\\Module_2\\src\\case_study\\data\\file_customer.csv";

    public static List<Customer> readCustomerCSV() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_CUSTOMER);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Customer customer;
        while (true) {
            try {
                if ((line = bufferedReader.readLine()) == null) {
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            temp = line.split(",");
            String name = temp[0];
            String dateOfBith = temp[1];
            String sex = temp[2];
            String idNumber = temp[3];
            String phoneNumber = temp[4];
            String email = temp[5];
            String customerIsCode = temp[6];
            String typeGuest = temp[7];
            String address = temp[8];
            customer = new Customer(name, dateOfBith, sex, idNumber, phoneNumber, email,
                    customerIsCode, typeGuest, address);
            customerList.add(customer);
        }
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public static void writerCustomer1CSV(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_CUSTOMER, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toCSV());
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

    public static void writerCustomer2CSV(List<Customer> customerList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_CUSTOMER);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toCSV());
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
