package com.koro.thymeleafhomework4.service;

import com.koro.thymeleafhomework4.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsList();
    Car getCarById(int id);
    List<Car> getCarsByColor(String color);
    boolean addCar(Car car);
    boolean modifyWholeCar(Car car);
    boolean modifyCar(Car car);
    boolean removeCar(int id);
}
