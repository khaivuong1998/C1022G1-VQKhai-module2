package case_study.services;

import case_study.models.Employee;
import case_study.repository.EmployeeRepositoryImpl;
import case_study.repository.IEmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService{
    public IEmployeeRepository repository1 = new EmployeeRepositoryImpl();
    @Override
    public void display() {
        repository1.display();
    }

    @Override
    public void add(Object object) {
        repository1.add(object);
    }

    @Override
    public void remove(String employeeCode) {
        repository1.remove(employeeCode);
    }

    @Override
    public Employee findEmployeeCode(String employeeCode) {
        return repository1.findEmployeeCode(employeeCode);
    }

    @Override
    public void edit(Employee employee) {
        repository1.edit(employee);
    }
}
