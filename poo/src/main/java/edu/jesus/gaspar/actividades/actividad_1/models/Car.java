package edu.jesus.gaspar.actividades.actividad_1.models;

public class Car {
    private String modelo;
    private String marca;
    private int numeroPuertas;
    private String color;

    /**
     * Se genera un nuevo objeto con la info de un carro
     * @param modelo año del carro
     * @param marca empresa del carro
     * @param numeroPuertas
     * @param color variedad de colores
    */

    public Car(String modelo, String marca, int numeroPuertas, String color) {
        setModelo(modelo);
        setMarca(marca);
        setNumeroPuertas(numeroPuertas);
        setColor(color);
    }

    /**
     * 
     * @return Obtiene el numero de puertas
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * 
     * @param numeroPuertas Validacion de numero de puertas, solo acepta de 2 a 5
     * @throws IllegalArgumentException Termina el programa por error de puertas invalido
    */

    public void setNumeroPuertas(int numeroPuertas) {
        if(numeroPuertas<2 || numeroPuertas>5){
            throw new IllegalArgumentException("El numero de puertas valido esta entre 2 y 5");
        }

        this.numeroPuertas = numeroPuertas;
    }

    /**
     * 
     * @return Regresa el año del carro
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setea el año del carro
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * 
     * @return Regresa la marca del carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setea la marca del carro
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Regresa el color del carro
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Setea el color del carro
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return Regresa la forma en la que se vera ordenada los datos del catalogo en cadena
    */
    @Override
    public String toString() {
        return "\n Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas='" + numeroPuertas + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}