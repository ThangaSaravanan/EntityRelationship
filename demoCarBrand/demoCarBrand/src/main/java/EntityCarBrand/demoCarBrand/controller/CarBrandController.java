package EntityCarBrand.demoCarBrand.controller;

import EntityCarBrand.demoCarBrand.Entity.CarBrand;
import EntityCarBrand.demoCarBrand.Service.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CancellationException;

@RestController
public class CarBrandController {
    @Autowired
    private CarBrandService carBrandService;

    @PostMapping("/saveDetails")
    public String create(@RequestBody CarBrand carBrand){
        carBrandService.addDetails(carBrand);
        return "Successfully Added";
    }

    @GetMapping("/getAll")
    private List<CarBrand>getAll(){
        return carBrandService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<CarBrand>getById(@PathVariable("id")int id){
        return carBrandService.getById(id);
    }

    @PutMapping("/update")
    private void update(@RequestBody CarBrand carBrand){
        carBrandService.update(carBrand);
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id")int id){
        carBrandService.delete(id);
    }

    @PostMapping("/saveAll")
    private String saveALl(@RequestBody List<CarBrand>carBrand){
        CarBrand obj1=new CarBrand();
        return "Ok";
    }
}
