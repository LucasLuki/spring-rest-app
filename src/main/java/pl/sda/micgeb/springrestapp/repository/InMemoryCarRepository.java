package pl.sda.micgeb.springrestapp.repository;

import org.springframework.stereotype.Repository;
import pl.sda.micgeb.springrestapp.model.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryCarRepository implements CarRepository {

    private static final Map<String, Car> carMap;

    static {
        carMap = new HashMap<>();
        carMap.put("ABC1234", Car.builder()
                .brand("Audi")
                .model("A6")
                .productionYear("2016")
                .value(new BigDecimal("40000"))
                .fuelType("diesel")
                .build());
        carMap.put("DEF567", Car.builder()
                .brand("Volkswagen")
                .model("Passat")
                .productionYear("2021")
                .value(new BigDecimal("70000"))
                .fuelType("diesel")
                .build());
        carMap.put("GHI8910", Car.builder()
                .brand("Skoda")
                .model("Octacia")
                .productionYear("2019")
                .value(new BigDecimal("35000"))
                .fuelType("gas")
                .build());
        carMap.put("EL1234J", Car.builder()
                .brand("Hyundai")
                .model("i30")
                .productionYear("2022")
                .value(new BigDecimal("55000"))
                .fuelType("lpg")
                .build());
        carMap.put("WA13579", Car.builder()
                .brand("Tesla")
                .model("S3")
                .productionYear("2022")
                .value(new BigDecimal("120000"))
                .fuelType("electric")
                .build());
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(carMap.values());
    }
}
