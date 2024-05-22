package org.example;

import java.util.Scanner;

/*
 * Nombre del programador: Cristian Sandoval
 * Materia: Programacion 2
 * Fecha: 09/05/2024
 * Detalle: una clase de tipo main el que contiene el ejecutable y la parte principal del programa
 * Versión:
 ***/
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //creo una instancia del automovil

        System.out.println("*********************************************");
        System.out.println("    Bienvenido al Modelado de un Automovil ");
        System.out.println("*********************************************");

        //Ingreso de la marca del automovil
        System.out.println("Ingrese la Marca ");
        String marca =sc.nextLine();

        //ingreso del modelo del automovil
        System.out.println("*********************************************");
        System.out.println("Ingrese el Modelo ");
        String modelo =sc.nextLine();

        //ingreso de año de Fabricacion del automovil
        System.out.println("*********************************************");
        System.out.println("Ingrese el Año de Fabricacion");
        int anio =sc.nextInt();

       //ingreso de cilindraje del automovil
        System.out.println("*********************************************");
        System.out.println("Ingrese cilindraje del motor");
        double motor =sc.nextDouble();

        //Ingreso del tipo de conbustible del automovil
        System.out.println("|********************************************|");
        System.out.println("|*****Escriba el tipo de conbustible ********|");
        System.out.println("|*************** - Gasolina******************|");
        System.out.println("|*************** - Bioetanol ****************|");
        System.out.println("|*************** - Diesel *******************|");
        System.out.println("|*************** - Biodiesel ****************|");
        System.out.println("|*************** - Gas natural **************|");
        System.out.println("|********************************************|");
        String Con =sc.next();

        //ingreso de tipo de automovil
        System.out.println("|************************************************|");
        System.out.println("|*****Escriba el tipo de Automovil **************|");
        System.out.println("|**************** - Ciudad **********************|");
        System.out.println("|**************** - Subcompacto *****************|");
        System.out.println("|**************** - Compacto ********************|");
        System.out.println("|**************** - Familiar ********************|");
        System.out.println("|**************** - Ejecutivo *******************|");
        System.out.println("|****************  -Suv *************************|");
        System.out.println("|************************************************|");
        String tipoA =sc.next();

        //ingreso del color del automovil
        System.out.println("|************************************************|");
        System.out.println("|*****Escriba el Color del Automovil ************|");
        System.out.println("|****************** - Blanco **********************|");
        System.out.println("|****************** - Negro **********************|");
        System.out.println("|****************** - Rojo ***********************|");
        System.out.println("|****************** - Naranja ********************|");
        System.out.println("|****************** - Amarillo *******************|");
        System.out.println("|****************** - Verde **********************|");
        System.out.println("|****************** - Azul ***********************|");
        System.out.println("|****************** - Violeta *******************|");
        System.out.println("|************************************************|");
        String color =sc.next();

        //Ingreso de la cantidad de peurtas
        System.out.println("*********************************************");
        System.out.println("Cantidad de Puertas");
        int puertas = sc.nextInt();

        //Ingreso de asientos
        System.out.println("*********************************************");
        System.out.println("Cantidad de Asientos");
        int asientos = sc.nextInt();

        //ingreso de la velocidad maxima
        System.out.println("*********************************************");
        System.out.println("Ingrese La Velocidad maxima");
        int velocidad = sc.nextInt();

        //ingreso de la velocidad actul
        System.out.println("*********************************************");
        System.out.println("Ingrese su Velocidad actual");
        int velocidadA = sc.nextInt();

        //ingreso de la distancia recorrida
        System.out.println("*********************************************");
        System.out.println("Ingrese la distancia recorrida ");
        int distancia =sc.nextInt();



        //Creacion del objeto automovil ya guardados la informacion
        Automovil automovil = new Automovil(marca,modelo,anio,motor,Con,tipoA,puertas,asientos,velocidad,color,velocidadA,distancia);

        automovil.imprimir();


        //System.out.println("la tiempo aproximado de llegada es: "+automovil.calculo()+"h");
        System.out.println("|***********************************************************|");
        System.out.println("| El tiempo estimado a llegar es: "+automovil.calculo()+"h |");
        System.out.println("|***********************************************************|");

        //Aumentamos 20km
        automovil.acelerar(20);


        //bajamos la velocidad
        automovil.freno(50);
        System.out.println("|************************************************************************************|");
        System.out.println("| su velocidad despues de bajar la velocidad 50km/h es: "+automovil.getVelocidadA()+"km/h |");
        System.out.println("|************************************************************************************|");

        //frenamos
       // automovil.frenar();
       // System.out.println("Su velocidad acutual despues de frenar es: "+automovil.getVelocidadA());


    }

}