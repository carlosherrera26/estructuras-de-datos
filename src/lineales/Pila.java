package lineales;

import java.util.ArrayDeque;
import java.util.Deque;

/** Pila (stack): LIFO, el último en entrar es el primero en salir. */
public class Pila {
  // Ejemplo 1: verifica si paréntesis, corchetes y llaves están balanceados
static boolean ejemplo1Parentesis(String texto) {
  Deque<Character> pila = new ArrayDeque<>();
  for (char c : texto.toCharArray()) {
    if (c == '(' || c == '[' || c == '{') {
      pila.push(c); // push
    } else if (c == ')' || c == ']' || c == '}') {
      if (pila.isEmpty()) return false;
      char abierto = pila.pop(); // pop
    if ((c == ')' && abierto != '(') || (c == ']' && abierto != '[') || (c == '}' && abierto != '{'))
      return false;
    }
  }
  return pila.isEmpty();
}
  // Ejemplo 2: historial de un editor, 'deshacer' saca la última acción
static void ejemplo2Deshacer() {
  Deque<String> historial = new ArrayDeque<>();
  historial.push("escribir 'Hola'");
  historial.push("negrita");
  historial.push("borrar palabra");
  System.out.println("Última acción (peek): " + historial.peek());
  while (!historial.isEmpty()) System.out.println("Deshaciendo: " + historial.pop());
}
  public static void main(String[] args) {
    for (String e : new String[]{"(a + b) * [c - d]", "((a + b)", "{[()]}"})
      System.out.println("'" + e + "' balanceada: " + ejemplo1Parentesis(e));
    ejemplo2Deshacer();
  }
}
