package case_study.services.interfaces;

import case_study.models.Employee;

public interface IEmployeeService extends IService {
    void remove(String employeeCode);
    Employee findEmployeeCode(String employeeCode);
    void edit(Employee employee);

}
