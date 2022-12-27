package case_study.repository;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository{
    static List<Employee> employeeList = new ArrayList<>();
    static Employee employee1 = new Employee("Nguyễn Văn A", "14-2-2001", "Nam", "248761854", "0849950317",
            "quabd@gmall.com", "015", "trung cấp", "lễ tân", "7000000");
    static Employee employee2 = new Employee("Nguyễn Văn B", "24-4-1997", "Nam", "284697314", "0458762118",
            "fvnwnsd14@gmall.com", "006", "cao đẳng", "lễ tân", "5000000");
    static Employee employee3 = new Employee("Nguyễn Văn C", "18-11-2003", "Nam", "248761854", "0697415234",
            "sdceubd1@gmall.com", "011", "Đại học", "chuyên viên", "10000000");
    static Employee employee4 = new Employee("Nguyễn Văn D", "9-10-1982", "Nam", "248761854", "0458769142",
            "fbjbsnj5@gmall.com", "003", "Đại học", "giám sát", "9000000");
    static Employee employee5 = new Employee("Nguyễn Văn E", "3-9-1994", "Nam", "248761854", "0354781027",
            "tfnnzx15@gmall.com", "001", "sau đại học", "quản lý", "14500000");
    static {
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
    }
    @Override
    public void display() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }

    @Override
    public void add(Object object) {

    }
}
