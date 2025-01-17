package edu.jesus.gaspar.actividades.actividad_1.process;

import java.util.ArrayList;

import java.util.List;

import edu.jesus.gaspar.actividades.actividad_1.models.Car;

public class StockManager {

    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }

    /**
     * Se genera un nuevo objeto con la info de un carro y se guarda al catalogo
     * @param modelo año del carro
     * @param marca empresa de fabricacion
     * @param numeroPuertas 
     * @param color Variedad de colores
     */

    public void addCar(String modelo, String marca, int numeroPuertas, String color){
        Car car = new Car(modelo,marca,numeroPuertas,color);
        stock.add(car);
    }       

    public List<Car> getStock(){
        return this.stock;
    }
}
