package edu.jesus.gaspar.actividades.actividad_3.process;

import java.util.ArrayList;
import java.util.List;

import edu.jesus.gaspar.actividades.actividad_3.models.Product;

public class ProductManager {

     List<Product> stock;

     /**
      * Declaración de lista
      */
     public ProductManager(){
        this.stock = new ArrayList<>();
    }

    /**
     * Este metodo es utilizado para añadir los parametros a la lista de stock de productos
     * @param name nombre del producto
     * @param price precio del producto
     * @param beforeTax precio antes de impuestos
     * @param afterTax precio final despues de impuestos
     */
    public void addProduct(String name, double price, double beforeTax, double afterTax){
        Product product = new Product(price, name, beforeTax, afterTax);
        stock.add(product);
    }       

    /**
     * Metodo para retornar el stock
     * @return regreso de stock
    */
    public List <Product> getStock(){
        return this.stock;
    }

    /**
     * Metodo para mostrar que producto es más económico
     * @param products variable para productos
     * @return regresa el numero de producto mas economico +1 ya que inicia en 0
     */
    public int cheaperProduct(List <Product> products){
        double price;
        int  indice = 0;

        price = products.get(0).getPrice();

        for (int i=1; i<products.size();i++){
          if (products.get(i).getPrice()<price){
            price = products.get(i).getPrice();
          indice = i;
          }
        }

        return indice+1;
      }
}