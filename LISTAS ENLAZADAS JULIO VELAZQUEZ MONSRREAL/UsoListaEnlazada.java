/**
 * Clase principal para el uso de Listas Enlazadas
 * Autor: Julio Mauricio Velázquez Monsrreal
 * Fecha: 27 de noviembre del 2023
 */
public class UsoListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        // Agregar algunos nodos para probar
        listaEnlazada.inicio = new NodoEnlace(1);
        listaEnlazada.inicio.siguiente = new NodoEnlace(2);
        listaEnlazada.inicio.siguiente.siguiente = new NodoEnlace(3);
        listaEnlazada.inicio.siguiente.siguiente.siguiente = new NodoEnlace(4);

        // Buscar un nodo por el valor de su campo identificador y devolver una referencia
        int identificadorBuscar = 3;
        NodoEnlace nodoBuscado = listaEnlazada.buscarPorClave(identificadorBuscar);
        if (nodoBuscado != null) {
            System.out.println("Nodo con identificador " + identificadorBuscar + " encontrado.");
        } else {
            System.out.println("Nodo con identificador " + identificadorBuscar + " no encontrado.");
        }

        // Buscar un nodo por su campo identificador e insertar un nuevo nodo después de él
        int identificadorInsertarDespues = 2;
        int nuevoIdentificador = 5;
        listaEnlazada.insertarDespuesDeClave(identificadorInsertarDespues, nuevoIdentificador);

        // Imprimir la lista enlazada después de la inserción
        System.out.println("Lista enlazada después de la inserción:");
        imprimirListaEnlazada(listaEnlazada);

        // Intercambiar un nodo por otro buscado
        int identificadorIntercambiar1 = 2;
        int identificadorIntercambiar2 = 4;
        listaEnlazada.intercambiarNodos(identificadorIntercambiar1, identificadorIntercambiar2);

        // Imprimir la lista enlazada después del intercambio
        System.out.println("Lista enlazada después del intercambio:");
        imprimirListaEnlazada(listaEnlazada);
    }

    // Método auxiliar para imprimir la lista enlazada
    private static void imprimirListaEnlazada(ListaEnlazada lista) {
        NodoEnlace actual = lista.inicio;
        while (actual != null) {
            System.out.print(actual.identificador + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}


