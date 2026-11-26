/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadoble;

/**
 *
 * @author PC
 */
public class Main {

    public static void mostrar(listaDoble lista) {
        System.out.println("Adelante: " + lista);
        System.out.println("Atras:    " + lista.mostrarInverso());
        System.out.println("Tamanio:  " + lista.getTamanio());
        System.out.println();
    }

    public static void main(String[] args) {
        listaDoble lista = new listaDoble();

        System.out.println("=== 1. PRUEBA: LISTA VACIA ===");
        System.out.println("Esta vacia: " + lista.estaVacia());
        System.out.println("Eliminar ultimo: " + lista.eliminarUltimo());
        System.out.println("Eliminar valor 15: " + lista.eliminarPorValor(15));
        mostrar(lista);

        System.out.println("=== 2. PRUEBA: INSERTAR EN POSICION ===");
        lista.insertarEnPosicion(0, 25);
        lista.insertarEnPosicion(0, 15);
        lista.insertarEnPosicion(2, 45);
        lista.insertarEnPosicion(2, 35);
        mostrar(lista);

        System.out.println("=== 3. PRUEBA: ELIMINAR POR VALOR ===");
        System.out.println("Eliminar 25: " + lista.eliminarPorValor(25));
        System.out.println("Eliminar 88: " + lista.eliminarPorValor(88));
        mostrar(lista);

        System.out.println("=== 4. PRUEBA: ELIMINAR EN POSICION ===");
        System.out.println("Dato eliminado en pos 1: " + lista.eliminarEnPosicion(1));
        mostrar(lista);

        System.out.println("=== 5. PRUEBA: ELIMINAR ULTIMO ===");
        System.out.println("Resultado eliminarUltimo: " + lista.eliminarUltimo());
        mostrar(lista);

        System.out.println("=== 6. PRUEBA: ELIMINAR EL UNICO NODO ===");
        System.out.println("Dato eliminado en pos 0: " + lista.eliminarEnPosicion(0));
        System.out.println("Esta vacia: " + lista.estaVacia());
        mostrar(lista);

        System.out.println("=== 7. PRUEBA: INSERTAR ORDENADO ===");
        lista.insertarOrdenado(35);
        lista.insertarOrdenado(15);
        lista.insertarOrdenado(25);
        lista.insertarOrdenado(45);
        lista.insertarOrdenado(25);
        mostrar(lista);

        System.out.println("=== 8. PRUEBA: ELIMINAR CABEZA Y COLA POR VALOR ===");
        System.out.println("Eliminar 15 (cabeza): " + lista.eliminarPorValor(15));
        System.out.println("Eliminar 45 (cola):   " + lista.eliminarPorValor(45));
        mostrar(lista);

        System.out.println("=== 9. PRUEBA: ELIMINAR ULTIMO POR POSICION ===");
        int ultimaPosicion = lista.getTamanio() - 1;
        System.out.println("Dato eliminado: " + lista.eliminarEnPosicion(ultimaPosicion));
        mostrar(lista);

        System.out.println("=== 10. PRUEBA: POSICIONES INVALIDAS ===");
        try {
            lista.insertarEnPosicion(-1, 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }

        try {
            lista.eliminarEnPosicion(lista.getTamanio());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepcion esperada: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== 11. PRUEBA: METODOS BASICOS ===");
        lista.insertarAlInicio(5);
        lista.insertarFinal(70);
        System.out.println("Buscar 70: " + lista.Buscar(70));
        System.out.println("Dato en posicion 0: " + lista.obtener(0));
        lista.actualizar(8, 0);
        mostrar(lista);

        System.out.println("Eliminado al inicio: " + lista.eliminarAlInicio());

        System.out.println();
        System.out.println("=== 12. PRUEBA: VACIAR Y VOLVER A INSERTAR ===");
        while (!lista.estaVacia()) {
            lista.eliminarUltimo();
        }
        mostrar(lista);

        lista.insertarFinal(100);
        mostrar(lista);

        lista.eliminarUltimo();
        mostrar(lista);
    }
}