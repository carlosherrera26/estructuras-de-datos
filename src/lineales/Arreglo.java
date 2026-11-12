package lineales;

/** Arreglo (array): tamaño fijo, acceso directo por posición. Acceso O(1). */
public class Arreglo {
  /** Promedio y mayor nota de un curso guardado en un arreglo. */
static void ejemplo1Notas() {
  double[] notas = {4.2, 3.5, 5.0, 2.8, 4.7};
  double suma = 0, mayor = notas[0];
  for (double nota : notas) { // recorrido por posición
  suma += nota;
    if (nota > mayor) mayor = nota;
  }
  System.out.println("Primera nota (posición 0): " + notas[0]);
  System.out.printf("Promedio: %.2f | Mayor: %.1f%n", suma / notas.length, mayor);
}
  /** Invierte un arreglo in situ con dos índices. */
static void ejemplo2Invertir() {
  int[] datos = {10, 20, 30, 40, 50};
  int izq = 0, der = datos.length - 1;
  while (izq < der) {
    int temp = datos[izq];
    datos[izq++] = datos[der];
    datos[der--] = temp;
  }
  System.out.println("Arreglo invertido: " + java.util.Arrays.toString(datos));
}
  public static void main(String[] args) {
    ejemplo1Notas();
    ejemplo2Invertir();
  }
}
