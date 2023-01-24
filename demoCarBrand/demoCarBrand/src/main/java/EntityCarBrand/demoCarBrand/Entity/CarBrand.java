package EntityCarBrand.demoCarBrand.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_brand")
public class CarBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "brand")
    private String carBrand;


    @OneToMany(targetEntity = CarType.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id_fk",referencedColumnName = "brand_id")
    private List<CarType> carTypes;
}
