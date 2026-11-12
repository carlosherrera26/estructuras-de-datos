package nolineales;

import java.util.ArrayList;
import java.util.List;

/** Árbol: jerarquía de padres e hijos. */
public class Arbol {
  static class NodoArbol {
    String nombre;
    List<NodoArbol> hijos = new ArrayList<>();
    NodoArbol(String nombre) { this.nombre = nombre; }
    NodoArbol agregar(NodoArbol hijo) { hijos.add(hijo); return hijo; }
  }
  static void mostrar(NodoArbol nodo, int nivel) {
    System.out.println("  ".repeat(nivel) + nodo.nombre);
    for (NodoArbol hijo : nodo.hijos) mostrar(hijo, nivel + 1);
  }
  // Ejemplo 1: estructura de carpetas de un proyecto
static void ejemplo1Carpetas() {
  NodoArbol raiz = new NodoArbol("proyecto");
  raiz.agregar(new NodoArbol("css")).agregar(new NodoArbol("styles.css"));
  raiz.agregar(new NodoArbol("img")).agregar(new NodoArbol("logo.svg"));
  raiz.agregar(new NodoArbol("index.html"));
  mostrar(raiz, 0);
}
  static class NodoBST {
    int valor;
    NodoBST izq, der;
    NodoBST(int valor) { this.valor = valor; }
  }
  static NodoBST insertar(NodoBST nodo, int valor) {
    if (nodo == null) return new NodoBST(valor);
    if (valor < nodo.valor) nodo.izq = insertar(nodo.izq, valor);
    else nodo.der = insertar(nodo.der, valor);
    return nodo;
  }
  static void inorden(NodoBST nodo, List<Integer> salida) {
    if (nodo == null) return;
    inorden(nodo.izq, salida);
    salida.add(nodo.valor);
    inorden(nodo.der, salida);
  }
  // Ejemplo 2: árbol binario de búsqueda, el recorrido inorden sale ordenado
static void ejemplo2BusquedaBinaria() {
  NodoBST raiz = null;
  for (int v : new int[]{50, 30, 70, 20, 40, 60, 80}) raiz = insertar(raiz, v);
  List<Integer> salida = new ArrayList<>();
  inorden(raiz, salida);
  System.out.println("Inorden (ordenado): " + salida);
}
  public static void main(String[] args) {
    ejemplo1Carpetas();
    ejemplo2BusquedaBinaria();
  }
}
