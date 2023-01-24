package EntityCarBrand.demoCarBrand.Service;

import EntityCarBrand.demoCarBrand.Entity.CarBrand;
import EntityCarBrand.demoCarBrand.Repository.CarBrandRepository;
import EntityCarBrand.demoCarBrand.Repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

@Service
public class CarBrandService {
    @Autowired
    private CarBrandRepository carBrandRepository;
    @Autowired
    private CarTypeRepository carTypeRepository;

    public void addDetails(CarBrand carBrand) {
        carBrandRepository.save(carBrand);

    }

    public List<CarBrand> getAll() {
        return carBrandRepository.findAll();
    }

    public Optional<CarBrand> getById(int id) {
        return carBrandRepository.findById(id);
    }

    public void update(CarBrand carBrand) {
        carBrandRepository.saveAndFlush(carBrand);
    }

    public void delete(Integer id) {
        carBrandRepository.deleteById(id);
    }

    public CarBrand saveAll(List<CarBrand> obj1) {
        List<CarBrand> obj2 = new ArrayList<>();
        CarBrand obj3 = null;
        for (CarBrand obj4 : obj1) {
            obj3 = new CarBrand();
            carBrandRepository.saveAndFlush(obj4);
        }
        return obj3;
    }
}