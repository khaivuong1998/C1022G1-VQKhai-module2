package case_study.services;

import case_study.repository.FacilityRepositoryImpl;
import case_study.repository.IFacilityRepository;

public class FacilityServiceImpl implements IFacilityService{
    public IFacilityRepository repository3 = new FacilityRepositoryImpl();
    @Override
    public void display() {
        repository3.display();
    }

    @Override
    public void add(Object object) {

    }
}
