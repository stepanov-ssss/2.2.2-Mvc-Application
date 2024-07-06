package web.Models.service;

import org.springframework.stereotype.Component;
import web.Models.Util.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mazda", "Red", "1"));
        cars.add(new Car("BMW", "Black", "2"));
        cars.add(new Car("Honda", "White", "3"));
        cars.add(new Car("Ford", "Yellow", "4"));
        cars.add(new Car("Audi", "Green", "5"));
    }

    @Override
    public List<Car> getAllCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

