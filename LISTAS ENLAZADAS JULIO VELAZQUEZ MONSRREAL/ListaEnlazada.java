/**
 * Proyecto: Listas Enlazadas
 * Autor: Julio Mauricio Velázquez Monsrreal
 * Fecha: 27 de noviembre del 2023
 */
public class ListaEnlazada {
    NodoEnlace inicio;

    public ListaEnlazada() {
        this.inicio = null;
    }

    // Método para buscar un nodo por el valor de su campo identificador y devolver una referencia
    public NodoEnlace buscarPorClave(int identificador) {
        NodoEnlace actual = inicio;
        while (actual != null) {
            if (actual.identificador == identificador) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null; // No se encontró el nodo con el identificador especificado
    }

    // Método para buscar un nodo por su campo identificador e insertar un nuevo nodo después de él
    public void insertarDespuesDeClave(int identificadorBuscar, int nuevoIdentificador) {
        NodoEnlace actual = inicio;
        while (actual != null) {
            if (actual.identificador == identificadorBuscar) {
                NodoEnlace nuevoNodo = new NodoEnlace(nuevoIdentificador);
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                return;
            }
            actual = actual.siguiente;
        }
        // Si no se encuentra el nodo con el identificador especificado, se podría lanzar una excepción o manejar de otra manera.
    }

    // Método para intercambiar un nodo por otro buscado
    public void intercambiarNodos(int identificador1, int identificador2) {
        // Si los nodos a intercambiar son iguales, no hay necesidad de hacer nada
        if (identificador1 == identificador2) {
            return;
        }

        // Buscar los nodos con los identificadores especificados
        NodoEnlace anterior1 = null, actual1 = inicio;
        while (actual1 != null && actual1.identificador != identificador1) {
            anterior1 = actual1;
            actual1 = actual1.siguiente;
        }

        NodoEnlace anterior2 = null, actual2 = inicio;
        while (actual2 != null && actual2.identificador != identificador2) {
            anterior2 = actual2;
            actual2 = actual2.siguiente;
        }

        // Verificar si se encontraron ambos nodos
        if (actual1 == null || actual2 == null) {
            // Al menos uno de los nodos no fue encontrado
            return;
        }

        // Actualizar los punteros para intercambiar los nodos
        if (anterior1 != null) {
            anterior1.siguiente = actual2;
        } else {
            inicio = actual2;
        }

        if (anterior2 != null) {
            anterior2.siguiente = actual1;
        } else {
            inicio = actual1;
        }

        NodoEnlace temp = actual1.siguiente;
        actual1.siguiente = actual2.siguiente;
        actual2.siguiente = temp;
    }
}

