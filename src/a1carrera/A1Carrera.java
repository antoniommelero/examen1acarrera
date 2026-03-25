/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1carrera;

import java.time.Duration;
import java.util.Map;

/**
 *
 * @author Antonio
 */
public class A1Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        Map<Integer, Duration> datos = DatosCarrera.getDatos();
        carrera.cargarDatos(datos);

        System.out.println("Array inicial");
        System.out.println(carrera.mostrarCarrera());

        System.out.println("\nCorredores finalizados: " + carrera.corredoresFinalizados());
        System.out.println("Dorsal ganador: " + carrera.dorsalGanador());
        System.out.println("Tiempo ganador: " + carrera.tiempoGanador());
        System.out.println(carrera.ganadorCompleto());
        System.out.println("Tiempo medio: " + carrera.tiempoMedio());

        System.out.println("\n//// Prueba de nuevas versiones de los metodos");
        System.out.println("Corredores finalizados: " + carrera.corredoresFinalizados());
        System.out.println("Dorsal ganador: " + carrera.dorsalGanador2());
        System.out.println("Tiempo ganador: " + carrera.tiempoGanador2());
        System.out.println(carrera.ganadorCompleto2());
        System.out.println("Tiempo medio: " + carrera.tiempoMedio2());
        
        carrera.ordenarPorTiempo();
        System.out.println("\nArray ordenado por tiempo");
        System.out.println(carrera.mostrarCarrera());
        
        
    }
}