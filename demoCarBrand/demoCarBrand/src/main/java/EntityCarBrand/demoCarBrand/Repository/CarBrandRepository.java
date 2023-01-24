package EntityCarBrand.demoCarBrand.Repository;

import EntityCarBrand.demoCarBrand.Entity.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarBrandRepository extends JpaRepository<CarBrand,Integer> {
}
