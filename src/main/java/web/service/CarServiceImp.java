package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = new ArrayList<>();


    public CarServiceImp() {
        cars.add(new Car("Toyota", "gas", "o234oi"));
        cars.add(new Car("BenzTruck", "gas", "p777mn"));
        cars.add(new Car("Tesla", "electricity", "m654gd"));
        cars.add(new Car("Gaz", "diesel", "g435fg"));
        cars.add(new Car("Honda", "electricity", "m453fj"));
    }


    @Override
    public List<Car> getCars(Integer num) {
        if (num == null) {
            return cars;
        }
        return cars.stream().limit(num).collect(Collectors.toList());
    }

}
