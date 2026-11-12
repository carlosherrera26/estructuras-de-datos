package nolineales;

import java.util.*;

/** Grafo: nodos conectados entre sí (lista de adyacencia). */
public class Grafo {
  // Recorrido en anchura: cuántos saltos hay desde 'inicio'
static Map<String, Integer> bfsDistancias(Map<String, List<String>> grafo, String inicio) {
  Map<String, Integer> distancias = new LinkedHashMap<>();
  Queue<String> cola = new ArrayDeque<>();
  distancias.put(inicio, 0);
  cola.offer(inicio);
  while (!cola.isEmpty()) {
    String actual = cola.poll();
    for (String vecino : grafo.get(actual)) {
      if (!distancias.containsKey(vecino)) {
        distancias.put(vecino, distancias.get(actual) + 1);
        cola.offer(vecino);
      }
    }
  }
  return distancias;
}
  // Recorrido en profundidad
static void dfs(Map<String, List<String>> grafo, String actual, List<String> visitados) {
  visitados.add(actual);
  for (String vecino : grafo.get(actual))
    if (!visitados.contains(vecino)) dfs(grafo, vecino, visitados);
}
  // Ejemplo 1: amigos y 'amigos de amigos' con BFS
static void ejemplo1RedSocial() {
  Map<String, List<String>> amigos = new LinkedHashMap<>();
  amigos.put("Carlos", List.of("Ana", "Luis"));
  amigos.put("Ana", List.of("Carlos", "María"));
  amigos.put("Luis", List.of("Carlos"));
  amigos.put("María", List.of("Ana", "Pedro"));
  amigos.put("Pedro", List.of("María"));
  System.out.println("Saltos desde Carlos: " + bfsDistancias(amigos, "Carlos"));
}
  // Ejemplo 2: ciudades conectadas por carretera, recorridas con DFS
static void ejemplo2Mapa() {
  Map<String, List<String>> mapa = new LinkedHashMap<>();
  mapa.put("Medellín", List.of("Bogotá", "Cali"));
  mapa.put("Bogotá", List.of("Medellín", "Tunja"));
  mapa.put("Cali", List.of("Medellín"));
  mapa.put("Tunja", List.of("Bogotá"));
  List<String> visitados = new ArrayList<>();
  dfs(mapa, "Medellín", visitados);
  System.out.println("Recorrido DFS desde Medellín: " + visitados);
}
  public static void main(String[] args) {
    ejemplo1RedSocial();
    ejemplo2Mapa();
  }
}
