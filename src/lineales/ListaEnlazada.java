package lineales;

import java.util.ArrayList;
import java.util.List;

/** Lista enlazada: cada nodo guarda un dato y apunta al siguiente. */
public class ListaEnlazada<T> {
  private static class Nodo<T> {
    T dato;
    Nodo<T> siguiente;
    Nodo(T dato) { this.dato = dato; }
  }
  private Nodo<T> cabeza;
  public void agregarAlFinal(T dato) { // O(n)
  Nodo<T> nuevo = new Nodo<>(dato);
    if (cabeza == null) { cabeza = nuevo; return; }
    Nodo<T> actual = cabeza;
    while (actual.siguiente != null) actual = actual.siguiente;
    actual.siguiente = nuevo;
  }
  public boolean eliminar(T dato) {
    Nodo<T> actual = cabeza, anterior = null;
    while (actual != null) {
      if (actual.dato.equals(dato)) {
        if (anterior != null) anterior.siguiente = actual.siguiente;
        else cabeza = actual.siguiente;
        return true;
      }
      anterior = actual;
      actual = actual.siguiente;
    }
    return false;
  }
  public void invertir() {
    Nodo<T> anterior = null, actual = cabeza;
    while (actual != null) {
      Nodo<T> sig = actual.siguiente;
      actual.siguiente = anterior;
      anterior = actual;
      actual = sig;
    }
    cabeza = anterior;
  }
  public List<T> aLista() {
    List<T> datos = new ArrayList<>();
    for (Nodo<T> n = cabeza; n != null; n = n.siguiente) datos.add(n.dato);
    return datos;
  }
  // Ejemplo 1: playlist, agregar canciones y quitar una
static void ejemplo1Playlist() {
  ListaEnlazada<String> playlist = new ListaEnlazada<>();
  for (String c : new String[]{"Intro", "Fuerza", "Disciplina", "Final"}) playlist.agregarAlFinal(c);
  playlist.eliminar("Disciplina");
  System.out.println("Playlist: " + String.join(" -> ", playlist.aLista()));
}
  // Ejemplo 2: invertir una lista cambiando los punteros
static void ejemplo2Invertir() {
  ListaEnlazada<Integer> numeros = new ListaEnlazada<>();
  for (int n = 1; n <= 4; n++) numeros.agregarAlFinal(n);
  numeros.invertir();
  System.out.println("Lista invertida: " + numeros.aLista());
}
  public static void main(String[] args) {
    ejemplo1Playlist();
    ejemplo2Invertir();
  }
}
