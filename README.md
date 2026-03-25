# examen1acarrera
En esta práctica modelaras el sistema de resultados de una media maratón. Cada corredor está identificado por un dorsal numérico (del 1 al NUM_CORREDORES) y tiene registrado su tiempo de llegada. Si un corredor no ha finalizado la prueba, su posición en el array quedara vacia (null).

Los datos de partida se facilitan en un fichero .java independiente que podrás descargar. Dicho fichero contiene un Map\<Integer, Duration\> donde la clave es el dorsal y el valor es el tiempo de llegada. Tu tarea es cargar esos datos en el array y operar sobre él.

**Clases que debes implementar**

***

1.  **Clase Corredor**

***

Crea una clase Corredor con los siguientes atributos privados y sus correspondientes getters:

-   Dorsal (número sin decimales)
-   Tiempo (clase Duration)

Es interesante que esta clase disponga de un toString adecuado para poder sacar de forma sencilla el contenido del Array.

2.  **Clase Carrera**

***

**Constante obligatoria**

NUM_CORREDORES = 20

El array de corredores tendrá exactamente este tamaño. Las posiciones sin datos quedaran como null.

**Métodos**

**1. cargarDatos(Map\<Integer, Duration\> datos)**

Recorre el Map recibido y rellena el array de Corredor. Cada corredor se almacena en la posicion dorsal - 1 (el dorsal 1 va al indice 0, el dorsal 2 al indice 1, etc.). Las posiciones que no aparezcan en el Map quedaran como null. Este método realmente es para poder aprovechar todos los datos que se dan ya escritos para facilitar las pruebas.

**2. dorsalGanador()**

Devuelve el dorsal del corredor con el menor tiempo registrado. Ignora las posiciones null.

**3. tiempoGanador()**

Devuelve el tiempo del ganador como String con formato hh:mm:ss.

**4. ganadorCompleto()**

Devuelve un String con el dorsal y el tiempo del ganador. Ejemplo:

"Ganador: dorsal 7 - 01:02:34"

**5. tiempoMedio()**

Calcula y devuelve la media de los tiempos de todos los corredores que han finalizado la prueba (posiciones no null), como String con formato hh:mm:ss.

**6. corredoresFinalizados()**

Devuelve el número de corredores que han finalizado la prueba (posiciones no null).

**7. ordenarPorTiempo()**

Ordena el array de menor a mayor tiempo usando Arrays.sort() con un Comparator. Criterio secundario en caso de empate: dorsal ascendente. Las posiciones null deben quedar al final del array tras la ordenación.

**Referencia rápida de Duration**

***

| **Método**                 | **Descripción**                                 |
|----------------------------|-------------------------------------------------|
| Duration.ofSeconds(long s) | Crea un Duration a partir de segundos totales   |
| duration.getSeconds()      | Devuelve el total de segundos de la duracion    |
| duration.toHoursPart()     | Parte de horas (para formatear en hh:mm:ss)     |
| duration.toMinutesPart()   | Parte de minutos entre 0 y 59 (para formatear)  |
| duration.toSecondsPart()   | Parte de segundos entre 0 y 59 (para formatear) |
| duration.compareTo(other)  | Compara dos duraciones (-,0,+)                  |

**Restricciones**

***

-   El tamaño del array debe definirse mediante la constante NUM_CORREDORES.
-   La ordenación debe realizarse con Arrays.sort() y un Comparator. No se permite ordenación manual.
-   El Comparator puede implementarse como clase anónima, clase separada o expresión lambda.
-   No es necesario hacer un programa principal operativo, solo poner llamadas que permitan comprobar el correcto funcionamiento de todos los métodos.
