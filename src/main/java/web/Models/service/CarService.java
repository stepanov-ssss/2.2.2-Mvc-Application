package web.Models.service;

import web.Models.Util.Car;

import java.util.List;

public interface CarService {

    public List<Car> getAllCars(Integer count);
}
