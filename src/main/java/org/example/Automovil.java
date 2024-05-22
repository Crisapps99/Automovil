package org.example;

/*
 * Nombre del programador: Cristian Sandoval
 * Materia: Programacion 2
 * Fecha: 09/05/2024
 * Detalle: una clase de tipo main el que contiene el ejecutable y la parte principal del programa
 * Versión:
 ***/
public class Automovil {


    private String marca;
    private String modelo;
    private int anio;
    private double motor;
    public String Con;
    public String tipoA;
    private int puertas;
    private int asientos;
    private int velocidad;
    public String color;
    private int velocidadA;
    private int distancia;

    //Constructor
    Automovil(String marca, String modelo, int anio, double motor, String Con, String tipoA, int puertas,
          int asientos, int velocidad, String color, int velocidadA, int distancia){

        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.motor=motor;
        this.Con=Con;
        this.tipoA=tipoA;
        this.puertas=puertas;
        this.asientos=asientos;
        this.velocidad=velocidad;
        this.color=color;
        this.velocidadA=velocidadA;
        this.distancia=distancia;
    }
    //metodos get y set para los atributos
    //Metodo para set y get para marca
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    //Metodo para set y get para modelo
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    //Metodo para set y get para año de vehiculo
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }

    //Metodo para set y get para motor
    public double getMotor(){
        return motor;
    }
    public void setMotor(double motor){
        this.motor=motor;
    }

    //Metodo para set y get para tipo combustible
    public String getTipoC(){
        return Con;
    }
    public void setTipoC(String Con){
        this.Con=Con;
    }

    //Metodo para set y get para tipo de automovil
    public String getTipoA(){
        return tipoA;
    }
    public void setTipoA(String tipoA){
        this.tipoA=tipoA;
    }

    //Metodo para set y get para numero de puertas
    public int getPuertas(){
        return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas=puertas;
    }

    //Metodo para set y get para cantidad de asientos
    public int getAsientos(){
        return asientos;
    }
    public void setAsientos(int asientos){
        this.asientos=asientos;
    }

    //Metodo para set y get para velocidad maxima
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }

    //Metodo para set y get para color del automovil
    public String getColor(){
        return color;
    }
    public void setColor(String color ){
        this.color=color;
    }

    //Metodo para set y get para la velocidad actual
    public int getVelocidadA(){
        return velocidadA;
    }
    public void setVelocidadA(int velocidadA){
        this.velocidadA=velocidadA;
    }
    //METODO PARA SET Y FET DE DISTANCIA

    //calculo para sar la estimado a llegar
    public int calculo(){

        return   distancia / velocidadA;


    }
    //Metodo para acelerar una cierta velocidad
    public void acelerar(int aumento){
        if (velocidadA+aumento < velocidad){
            velocidadA=velocidadA+aumento;
            System.out.println("|************************************************************|");
            System.out.println("| su velocidad despues de Acelerar 20km/h es: "+velocidadA+"km/h |");
            System.out.println("|************************************************************|");

        }else {
            System.out.println("|**********************************************|");
            System.out.println("| no se puede acelerar mas de lo permitido     |");
            System.out.println("|**********************************************|");
        }

    }

    //Metodo para frenar el automovil
    public void freno(int frenos){
        if (velocidadA-frenos >= 0) {
            velocidadA=velocidadA-frenos;

        }else {
            System.out.println("|******************************************************|");
            System.out.println("| No es posible desacelerar a una velocidad negativa   |");
            System.out.println("|******************************************************|");

        }
    }

    //Metodo para calcular el tiempo estimado de llegada

    //calcular la distancia recorrida
    public void calculollegada(int distanciaa){
        if (this.velocidadA == 0){
            System.out.println("el automovil esta detenido no se puede calcular el tiempo estimado de llegada ");
        }else {
            this.velocidadA=distanciaa/velocidadA;
            System.out.println("El tiempo estimado de llega es: "+distanciaa);
        }
    }

    //Metodo para frenar el Automovil
    public void frenar (){
        velocidadA = 0;

    }

    //Metodo para poder imprimir la informacion del vehiculo
    public void imprimir(){
        System.out.println("| *********************************************|");
        System.out.println("|************** Datos Del Automovil ***********|");
        System.out.println("|**********************************************|");
        System.out.println("| Marca: "+marca+                             "|");
        System.out.println("|**********************************************|");
        System.out.println("| Modelo: "+modelo+                           "|");
        System.out.println("|**********************************************|");
        System.out.println("| Año: "+anio+                                "|");
        System.out.println("|**********************************************|");
        System.out.println("| Motor: "+motor+                             "|");
        System.out.println("|**********************************************|");
        System.out.println("| Tipo de Combustible: "+Con+                 "|");
        System.out.println("|**********************************************|");
        System.out.println("| Tipo de Automovil : "+tipoA+                "|");
        System.out.println("|**********************************************|");
        System.out.println("| Numero de puertas Puertas: "+puertas+       "|");
        System.out.println("|**********************************************|");
        System.out.println("| Numero de asientos: "+asientos+             "|");
        System.out.println("|**********************************************|");
        System.out.println("| Velocidad Maxima permitida: "+velocidad+"km/h|");
        System.out.println("|**********************************************|");
        System.out.println("| Color del automovil: "+color+               "|");
        System.out.println("|**********************************************|");
        System.out.println("| Velocidad Actual: "+velocidadA+"km/h|");
        System.out.println("|**********************************************|");



    }









}
