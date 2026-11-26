# Lista Doblemente Enlazada en Java

Implementación completa de la estructura de datos **Lista Doblemente Enlazada** desarrollada en Java (NetBeans), incluyendo manejo de enlaces bidireccionales (`ant` y `sig`), operaciones de inserción, eliminación, ordenamiento y una batería de pruebas en consola.

## Estructura del Proyecto (`package listadoble`)

* **`nodoD.java`**: Define la estructura del nodo doble con su dato entero y las referencias al nodo anterior (`ant`) y siguiente (`sig`).
* **`listaDoble.java`**: Contiene la lógica de la lista con punteros `cabeza`, `cola` y control de `tamanio`:
  * `insertarEnPosicion(int pos, int dato)`
  * `eliminarPorValor(int x)`
  * `eliminarEnPosicion(int pos)`
  * `eliminarUltimo()`
  * `insertarOrdenado(int dato)`
  * Métodos auxiliares (`insertarAlInicio`, `insertarFinal`, `eliminarAlInicio`, `Buscar`, `obtener`, `actualizar`) y recorridos en ambos sentidos (`toString` y `mostrarInverso`).
* **`Main.java`**: Clase principal con las pruebas de ejecución y validación de casos borde (lista vacía, inserciones/eliminaciones en extremos y centro, ordenamiento y manejo de excepciones).

---

## Evidencias de Ejecución

### 1. Estructura del proyecto en NetBeans
*(Arrastra aquí tu captura de la ventana de NetBeans mostrando las 3 clases)*

### 2. Pruebas de consola: Lista vacía y operaciones por posición/valor
*(Arrastra aquí tu primera captura de la consola)*

### 3. Pruebas de consola: Inserción ordenada y manejo de excepciones
*(Arrastra aquí tu segunda captura de la consola)*

### 4. Pruebas de consola: Métodos básicos, vaciado y cierre
*(Arrastra aquí tu tercera captura de la consola)*
