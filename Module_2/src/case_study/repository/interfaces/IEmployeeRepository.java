package case_study.repository.interfaces;

import case_study.models.Employee;

public interface IEmployeeRepository extends IRepository {
    void remove(String employeeCode);
    Employee findEmployeeCode(String employeeCode);
    void edit(Employee employee);
}
