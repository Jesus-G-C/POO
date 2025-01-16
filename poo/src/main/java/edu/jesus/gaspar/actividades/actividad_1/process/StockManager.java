package edu.jesus.gaspar.actividades.actividad_1.process;

import java.util.ArrayList;

import edu.jesus.gaspar.actividades.actividad_1.models.Car;

public class StockManager {

    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }
    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car = new Car(modelo,marca,numeroPuertas,color);
        stock.add(car);
    }       

    public void printStock(){
        System.out.println("El catologo actual es: ");
        System.out.println(stock);
    }
}
