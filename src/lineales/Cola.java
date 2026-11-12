package lineales;

import java.util.ArrayDeque;
import java.util.Queue;

/** Cola (queue): FIFO, el primero en entrar es el primero en salir. */
public class Cola {
  // Ejemplo 1: turnos de atención en un banco
static void ejemplo1Turnos() {
  Queue<String> fila = new ArrayDeque<>();
  fila.offer("Ana"); // enqueue
  fila.offer("Luis");
  fila.offer("María");
  while (!fila.isEmpty()) System.out.println("Atendiendo a: " + fila.poll()); // dequeue
}
  // Ejemplo 2: cola de impresión, los documentos salen en orden de llegada
static void ejemplo2Impresora() {
  Queue<String[]> cola = new ArrayDeque<>();
  cola.offer(new String[]{"informe.pdf", "12"});
  cola.offer(new String[]{"foto.png", "1"});
  cola.offer(new String[]{"taller.docx", "5"});
  int total = 0;
  while (!cola.isEmpty()) {
    String[] doc = cola.poll();
    total += Integer.parseInt(doc[1]);
    System.out.println("Imprimiendo " + doc[0] + " (" + doc[1] + " pág.)");
  }
  System.out.println("Páginas impresas: " + total);
}
  public static void main(String[] args) {
    ejemplo1Turnos();
    ejemplo2Impresora();
  }
}
