/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1carrera;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Antonio
 */
/**
 * Clase de datos de partida para el ejercicio de la Carrera (Modelo A).
 * Contiene los tiempos de llegada de los corredores identificados por su
 * dorsal. Los dorsales ausentes corresponden a corredores que no han finalizado
 * la prueba.
 *
 * INSTRUCCIONES: 1. Descarga este fichero y añádelo a tu proyecto. 2. En tu
 * clase de prueba, llama a DatosCarrera.getDatos() para obtener el Map. 3. Pasa
 * ese Map al método cargarDatos() de tu clase Carrera
 *
 * Uso: Map<Integer, Duration> datos = DatosCarrera.getDatos();
 * Carrera carrera = new Carrera();
 * carrera.cargarDatos(datos);
 */
public class DatosCarrera {

    /**
     * Devuelve un Map con los tiempos de llegada de la carrera. Clave: dorsal
     * del corredor (1 - 20) Valor: tiempo de llegada como Duration
     */
    public static Map<Integer, Duration> getDatos() {
        Map<Integer, Duration> datos = new LinkedHashMap<>();

        datos.put(1, Duration.ofSeconds(3600 + 14 * 60 + 42)); // 01:14:42
        datos.put(2, Duration.ofSeconds(3600 + 22 * 60 + 17)); // 01:22:17
        datos.put(3, Duration.ofSeconds(3600 + 8 * 60 + 5));  // 01:08:05
        datos.put(4, Duration.ofSeconds(3600 + 31 * 60 + 50)); // 01:31:50
        datos.put(5, Duration.ofSeconds(3600 + 18 * 60 + 33)); // 01:18:33
        datos.put(6, Duration.ofSeconds(3600 + 21 * 60 + 43)); // 01:21:43
        datos.put(7, Duration.ofSeconds(3600 + 45 * 60 + 9));  // 01:45:09
        datos.put(8, Duration.ofSeconds(3600 + 5 * 60 + 28)); // 01:05:28  <- candidato a ganador
        datos.put(9, Duration.ofSeconds(3600 + 27 * 60 + 44)); // 01:27:44
        datos.put(10, Duration.ofSeconds(3600 + 39 * 60 + 11)); // 01:39:11
        datos.put(11, Duration.ofSeconds(3600 + 29 * 60 + 31)); // 01:29:31
        datos.put(12, Duration.ofSeconds(3600 + 12 * 60 + 58)); // 01:12:58
        datos.put(13, Duration.ofSeconds(3600 + 55 * 60 + 3));  // 01:55:03
        datos.put(14, Duration.ofSeconds(3600 + 20 * 60 + 47)); // 01:20:47
        datos.put(15, Duration.ofSeconds(3600 + 33 * 60 + 22)); // 01:33:22
        datos.put(16, Duration.ofSeconds(3600 + 48 * 60 + 36)); // 01:48:36
        datos.put(17, Duration.ofSeconds(3600 + 28 * 60 + 16)); // 01:28:16
        datos.put(18, Duration.ofSeconds(3600 + 9 * 60 + 15)); // 01:09:15
        datos.put(19, Duration.ofSeconds(3600 + 42 * 60 + 50)); // 01:42:50
        datos.put(20, Duration.ofSeconds(3600 + 16 * 60 + 4));  // 01:16:04

        return datos;
    }
}
