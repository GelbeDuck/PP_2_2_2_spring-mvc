package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "V6", 2015));
        cars.add(new Car("TOYOTA", "V8", 2019));
        cars.add(new Car("NISSAN", "EV", 2017));
        cars.add(new Car("AUDI", "V6", 2020));
        cars.add(new Car("TESLA", "EV", 2024));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
