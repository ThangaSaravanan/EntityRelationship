package EntityCarBrand.demoCarBrand.Repository;

import EntityCarBrand.demoCarBrand.Entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTypeRepository extends JpaRepository<CarType,Integer> {
}
