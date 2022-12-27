package case_study.services;

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

    }
}
