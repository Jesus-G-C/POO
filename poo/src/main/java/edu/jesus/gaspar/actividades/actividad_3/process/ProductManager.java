package edu.jesus.gaspar.actividades.actividad_3.process;

import java.util.ArrayList;
import java.util.List;

import edu.jesus.gaspar.actividades.actividad_3.models.Product;

public class ProductManager {

     ArrayList<Product> stock;

     public ProductManager(){
        this.stock = new ArrayList<>();
    }

    public void addProduct(String name, double price, double beforeTax, double afterTax){
        Product product = new Product(price, name, beforeTax, afterTax);
        stock.add(product);
    }       

    public List<Product> getStock(){
        return this.stock;
    }

    public static int cheaperProduct(Product product[]) {
        double price;
        int  indice = 0;

        price = product[0].getPrice();

        for (int i=1; i<product.length;i++){
          if (product[i].getPrice()<price){
            price = product[i].getPrice();
          indice = i;
          }
        }

        return indice;
      }
}