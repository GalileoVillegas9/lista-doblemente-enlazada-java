/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoble;

/**
 *
 * @author PC
 */
public class listaDoble {
    private nodoD cabeza;
    private nodoD cola;
    private int tamanio;

    public listaDoble() {
        cabeza = null;
        cola = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        return cabeza == null && cola == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public boolean Buscar(int x) {
        nodoD aux = cabeza;
        while (aux != null) {
            if (aux.getDato() == x) {
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

    public nodoD obtenerNodo(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IllegalArgumentException("Posicion invalida: " + pos);
        }

        nodoD aux = cabeza;
        for (int i = 0; i < pos; i++) {
            aux = aux.getSig();
        }
        return aux;
    }

    public int obtener(int pos) {
        return obtenerNodo(pos).getDato();
    }

    public void actualizar(int dato, int pos) {
        nodoD aux = obtenerNodo(pos);
        aux.setDato(dato);
    }

    public void insertarAlInicio(int dato) {
        nodoD nuevo = new nodoD(dato);

        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.setSig(cabeza);
            cabeza.setAnt(nuevo);
            cabeza = nuevo;
        }
        tamanio++;
    }

    public void insertarFinal(int dato) {
        nodoD nuevo = new nodoD(dato);

        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSig(nuevo);
            nuevo.setAnt(cola);
            cola = nuevo;
        }
        tamanio++;
    }

    public int eliminarAlInicio() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista esta vacia");
        }

        int dato = cabeza.getDato();

        if (tamanio == 1) {
            cabeza = null;
            cola = null;
        } else {
            nodoD eliminado = cabeza;
            cabeza = cabeza.getSig();
            cabeza.setAnt(null);
            eliminado.setSig(null);
        }

        tamanio--;
        return dato;
    }

    public void insertarEnPosicion(int pos, int dato) {
        if (pos < 0 || pos > tamanio) {
            throw new IllegalArgumentException("Posicion invalida: " + pos);
        }

        if (pos == 0) {
            insertarAlInicio(dato);
        } else if (pos == tamanio) {
            insertarFinal(dato);
        } else {
            nodoD actual = obtenerNodo(pos);
            nodoD anterior = actual.getAnt();
            nodoD nuevo = new nodoD(dato);

            nuevo.setAnt(anterior);
            nuevo.setSig(actual);
            anterior.setSig(nuevo);
            actual.setAnt(nuevo);

            tamanio++;
        }
    }

    public boolean eliminarPorValor(int x) {
        nodoD aux = cabeza;

        while (aux != null) {
            if (aux.getDato() == x) {
                if (aux == cabeza) {
                    eliminarAlInicio();
                } else if (aux == cola) {
                    eliminarUltimo();
                } else {
                    nodoD anterior = aux.getAnt();
                    nodoD siguiente = aux.getSig();

                    anterior.setSig(siguiente);
                    siguiente.setAnt(anterior);

                    aux.setAnt(null);
                    aux.setSig(null);
                    tamanio--;
                }
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }

    public int eliminarEnPosicion(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IllegalArgumentException("Posicion invalida: " + pos);
        }

        if (pos == 0) {
            return eliminarAlInicio();
        }

        nodoD eliminado = obtenerNodo(pos);
        int dato = eliminado.getDato();

        if (pos == tamanio - 1) {
            eliminarUltimo();
        } else {
            nodoD anterior = eliminado.getAnt();
            nodoD siguiente = eliminado.getSig();

            anterior.setSig(siguiente);
            siguiente.setAnt(anterior);

            eliminado.setAnt(null);
            eliminado.setSig(null);

            tamanio--;
        }
        return dato;
    }

    public boolean eliminarUltimo() {
        if (estaVacia()) {
            return false;
        }

        if (tamanio == 1) {
            cabeza = null;
            cola = null;
        } else {
            nodoD eliminado = cola;
            cola = cola.getAnt();
            cola.setSig(null);
            eliminado.setAnt(null);
        }

        tamanio--;
        return true;
    }

    public void insertarOrdenado(int dato) {
        if (estaVacia() || dato <= cabeza.getDato()) {
            insertarAlInicio(dato);
        } else if (dato >= cola.getDato()) {
            insertarFinal(dato);
        } else {
            nodoD actual = cabeza;

            while (actual.getDato() < dato) {
                actual = actual.getSig();
            }

            nodoD anterior = actual.getAnt();
            nodoD nuevo = new nodoD(dato);

            nuevo.setAnt(anterior);
            nuevo.setSig(actual);
            anterior.setSig(nuevo);
            actual.setAnt(nuevo);

            tamanio++;
        }
    }

    @Override
    public String toString() {
        String res = "null";
        nodoD aux = cabeza;

        while (aux != null) {
            res = res + " <-> [" + aux.getDato() + "]";
            aux = aux.getSig();
        }
        return res + " <-> null";
    }

    public String mostrarInverso() {
        String res = "null";
        nodoD aux = cola;

        while (aux != null) {
            res = res + " <-> [" + aux.getDato() + "]";
            aux = aux.getAnt();
        }
        return res + " <-> null";
    }
}