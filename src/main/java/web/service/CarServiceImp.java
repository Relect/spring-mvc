package web.service;

import web.model.Car;
import web.model.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImp implements CarService {
    private List<Car> cars = new ArrayList<>(Arrays.asList(
       new Car("Mersedes-Benz", "A001AA", Color.BLACK),
       new Car("Mersedes-Benz", "A002AB", Color.WHITE),
       new Car("Lada", "B002BB", Color.YELLOW))
    );
    @Override
    public void add(Car car) {

    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
}
