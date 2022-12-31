package case_study.services.class_services;

import case_study.repository.class_repositorys.FacilityRepositoryImpl;
import case_study.repository.interfaces.IFacilityRepository;
import case_study.services.interfaces.IFacilityService;

public class FacilityServiceImpl implements IFacilityService {
    public IFacilityRepository repository3 = new FacilityRepositoryImpl();
    @Override
    public void display() {
        repository3.display();
    }

    @Override
    public void add(Object object) {
        repository3.add(object);
    }

    @Override
    public void displayFacilityMaintenance() {
        repository3.displayFacilityMaintenance();
    }
}
