package nolineales;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/** Tabla hash / mapa: pares clave -> valor. Búsqueda promedio O(1). */
public class TablaHash {
  // Ejemplo 1: cuenta cuántas veces aparece cada palabra
static Map<String, Integer> ejemplo1FrecuenciaPalabras(String texto) {
  Map<String, Integer> conteo = new HashMap<>();
  for (String palabra : texto.toLowerCase().split(" "))
    conteo.merge(palabra, 1, Integer::sum);
  return conteo;
}
  // Ejemplo 2: agenda de contactos, buscar por nombre sin recorrer todo
static void ejemplo2Agenda() {
  Map<String, String> agenda = new HashMap<>();
  agenda.put("Ana", "300 111 2233");
  agenda.put("Luis", "311 444 5566");
  agenda.put("María", "320 777 8899"); // insertar
  System.out.println("Teléfono de Luis: " + agenda.get("Luis")); // buscar por clave
  System.out.println("¿Existe Pedro? " + agenda.containsKey("Pedro"));
}
  public static void main(String[] args) {
    System.out.println(new TreeMap<>(ejemplo1FrecuenciaPalabras("supera tu limite supera tu meta")));
    ejemplo2Agenda();
  }
}
