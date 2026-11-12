import lineales.*;
import nolineales.*;

/** Ejecuta todos los ejemplos del repositorio. */
public class Main {
  public static void main(String[] args) {
    titulo("Arreglo");
    Arreglo.main(args);
    titulo("Lista enlazada");
    ListaEnlazada.main(args);
    titulo("Pila");
    Pila.main(args);
    titulo("Cola");
    Cola.main(args);
    titulo("Árbol");
    Arbol.main(args);
    titulo("Grafo");
    Grafo.main(args);
    titulo("Tabla hash");
    TablaHash.main(args);
    titulo("Conjunto");
    Conjunto.main(args);
  }

private static void titulo(String nombre) {
  System.out.println("\n===== " + nombre + " =====");
}
}
