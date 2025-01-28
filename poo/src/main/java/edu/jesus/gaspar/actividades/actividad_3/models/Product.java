package edu.jesus.gaspar.actividades.actividad_3.models;

public class Product {

    private double price;
    private String name;
    private double beforeTax;
    private double afterTax;
    
        /**
         * 
         * @param price 
         * @param name 
         * @param beforeTax
         * @param afterTax 
        */
    
        public Product(double price, String name, double beforeTax, double afterTax) {
            setPrice(price);
            setName(name);
            setBeforeTax(beforeTax);
            setAfterTax(afterTax);
        }
    
        public double getPrice() {
            return price;
        }
    
        /**
         * 
         * @param price Validacion de precio bajo
         * @throws IllegalArgumentException Termina el programa por error de precio invalido
        */
    
        public void setPrice(double price) {
            if(price<=0){
                throw new IllegalArgumentException("El precio del producto no puede ser tan bajo");
            }
    
            this.price = price;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public double getAfterTax() {
            return afterTax;
        }
    
        public void setAfterTax(double afterTax) {
            this.afterTax = afterTax;
        }

        public double getBeforeTax() {
            return afterTax;
        }
    
        public void setBeforeTax(double beforeTax) {
            this.beforeTax = beforeTax;
        }
    
        /**
         * @return Regresa la forma en la que se vera ordenada los datos del producto
        */
        @Override
        public String toString() {
            return  "Producto\n" +
                    "modelo='" + name + '\'' +
                    ", precio='" + price + '\'' +
                    ", Antes de impuestos ='" + beforeTax + '\'' +
                    ", Después de impuestos ='" + afterTax + '\'' 
                    ;
        }
    
    }

