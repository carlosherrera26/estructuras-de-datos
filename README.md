# Estructuras de datos: lineales y no lineales (Java)

Repositorio academico con **2 ejemplos por cada estructura de datos**, escritos en Java y listos para ejecutar.

- **Autor:** Carlos Andres Herrera
- **Curso:** Estructuras de Datos, Ingenieria de Software, TdeA

## Estructuras lineales: los datos van uno detras de otro, en secuencia

| Tipo | Como funciona | Clase | Ejemplos |
|---|---|---|---|
| Arreglo (array) | Tamano fijo, acceso por posicion | src/lineales/Arreglo.java | Promedio y mayor de notas, invertir un arreglo |
| Lista enlazada | Cada elemento apunta al siguiente | src/lineales/ListaEnlazada.java | Playlist de canciones, invertir una lista |
| Pila (stack) | Ultimo en entrar, primero en salir (LIFO) | src/lineales/Pila.java | Parentesis balanceados, deshacer en un editor |
| Cola (queue) | Primero en entrar, primero en salir (FIFO) | src/lineales/Cola.java | Turnos de un banco, cola de impresion |

## Estructuras no lineales: jerarquias o conexiones, no una fila

| Tipo | Como funciona | Clase | Ejemplos |
|---|---|---|---|
| Arbol | Jerarquia de padres e hijos (carpetas, menus) | src/nolineales/Arbol.java | Arbol de carpetas, arbol binario de busqueda |
| Grafo | Nodos conectados entre si (redes sociales, mapas) | src/nolineales/Grafo.java | Red social con BFS, mapa de ciudades con DFS |
| Tabla hash / mapa | Pares clave y valor con busqueda muy rapida | src/nolineales/TablaHash.java | Frecuencia de palabras, agenda de contactos |
| Conjunto (set) | Elementos sin repetir | src/nolineales/Conjunto.java | Eliminar duplicados, union e interseccion de cursos |

## Como ejecutarlo

Requiere JDK 11 o superior.

Con Visual Studio Code: instala la extension Extension Pack for Java, abre la carpeta del repositorio y pulsa Run sobre Main.java.

Con la terminal:

    javac -encoding UTF-8 -d out src/Main.java src/lineales/*.java src/nolineales/*.java
        java -Dfile.encoding=UTF-8 -cp out Main
        
