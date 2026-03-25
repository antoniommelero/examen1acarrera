/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a1carrera;

import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author Antonio
 */
public class Carrera {

    public static final int NUM_CORREDORES = 20;
    private Corredor[] corredores = new Corredor[NUM_CORREDORES];

    // 1. Carga los datos desde el Map externo en el array
    public void cargarDatos(Map<Integer, Duration> datos) {
        for (Map.Entry<Integer, Duration> entrada : datos.entrySet()) {
            int indice = entrada.getKey() - 1;
            corredores[indice] = new Corredor(entrada.getKey(), entrada.getValue());
        }
    }

    // se recorre todo el array y se actualiza el objeto 'ganador' cada vez que se encuentra un tiempo menor
    private Corredor buscaGanador() {
        Corredor ganador = null;
        for (Corredor c : corredores) {
            if (c != null) {
                if (ganador == null || c.getTiempo().compareTo(ganador.getTiempo()) < 0) {
                    ganador = c;
                }
            }
        }
        return ganador;
    }

    // 2. Dorsal del ganador (menor tiempo)    
    public int dorsalGanador() {
        Corredor ganador = buscaGanador();
        return ganador != null ? ganador.getDorsal() : -1;
    }

    // 3. Tiempo del ganador como hh:mm:ss
    public String tiempoGanador() {
        Corredor ganador = buscaGanador();
        if (ganador == null) {
            return "No hay ganador";
        }
        Duration t = ganador.getTiempo();
        return String.format("%02d:%02d:%02d", t.toHoursPart(), t.toMinutesPart(), t.toSecondsPart());
    }

    // 4. Ganador completo
    public String ganadorCompleto() {
        // se puede hacer asi pero es poco eficiente pues recorrerá dos veces el array buscando lo mismo
        // return "Ganador: dorsal " + dorsalGanador() + " - " + tiempoGanador();
        Corredor ganador = buscaGanador();      
        return ganador != null ? ("Ganador: " + ganador.toString()) : "No hay ganador";
    }

    // 5. Tiempo medio de los corredores finalizados
    public String tiempoMedio() {
        long totalSegundos = 0;
        int cuenta = 0;
        for (Corredor c : corredores) {
            if (c != null) {
                totalSegundos += c.getTiempo().getSeconds();
                cuenta++;
            }
        }
        if (cuenta == 0) {
            return "00:00:00";
        }
        Duration media = Duration.ofSeconds(totalSegundos / cuenta);
        return String.format("%02d:%02d:%02d",
                media.toHoursPart(), media.toMinutesPart(), media.toSecondsPart());
    }

    // 6. Número de corredores finalizados
    public int corredoresFinalizados() {
        int count = 0;
        for (Corredor c : corredores) {
            if (c != null) {
                count++;
            }
        }
        return count;
    }

    // 7. Ordenar por tiempo (nulls al final), criterio secundario: dorsal ascendente
    public void ordenarPorTiempo() {
        Arrays.sort(corredores, Comparator
                .nullsLast(
                        Comparator.comparing(Corredor::getTiempo)
                                .thenComparingInt(Corredor::getDorsal)
                )
        );
    }

    // Muestra el array completo (para pruebas)
    public String mostrarCarrera() {
        StringBuilder salida = new StringBuilder();
        for (Corredor c : corredores) {
            salida.append((c != null ? c : "null")).append("\n");
        }
        return salida.toString();
    }
}
