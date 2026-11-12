package nolineales;

import java.util.*;

/** Conjunto (set): elementos sin repetir. */
public class Conjunto {
  // Ejemplo 1: elimina correos repetidos de una lista
static void ejemplo1SinDuplicados() {
  List<String> correos = List.of("a@mail.com", "b@mail.com", "a@mail.com", "c@mail.com", "b@mail.com");
  Set<String> unicos = new TreeSet<>(correos);
  System.out.println("Antes: " + correos.size() + " | Después: " + unicos.size());
  System.out.println("Únicos: " + unicos);
}
  // Ejemplo 2: unión, intersección y diferencia entre dos cursos
static void ejemplo2Operaciones() {
  Set<String> estructuras = new TreeSet<>(List.of("Ana", "Luis", "Carlos", "María"));
  Set<String> ingles = new TreeSet<>(List.of("Carlos", "María", "Pedro"));
  Set<String> ambos = new TreeSet<>(estructuras);
  ambos.retainAll(ingles); // intersección
  Set<String> alMenosUno = new TreeSet<>(estructuras);
  alMenosUno.addAll(ingles); // unión
  Set<String> soloEstructuras = new TreeSet<>(estructuras);
  soloEstructuras.removeAll(ingles); // diferencia
  System.out.println("En ambos cursos: " + ambos);
  System.out.println("En al menos uno: " + alMenosUno);
  System.out.println("Solo estructuras: " + soloEstructuras);
}
  public static void main(String[] args) {
    ejemplo1SinDuplicados();
    ejemplo2Operaciones();
  }
}
