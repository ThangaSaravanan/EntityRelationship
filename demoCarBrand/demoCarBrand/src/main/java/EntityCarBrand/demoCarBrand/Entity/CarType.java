package EntityCarBrand.demoCarBrand.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car_type")
public class CarType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "type_id")
    private int typeId;

    @Column(name = "car_type")
    private String carType;

    @Column(name ="mnf_year" )
    private  int mnfYear;

    @Column(name = "price")
    private int price;
}
