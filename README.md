# Pokedex

Una aplicación de consola desarrollada en Java y gestionada con Maven para la administración y consulta de datos Pokémon. 

## Tecnologías y Requisitos

* **Lenguaje:** Java 21
* **Gestión de proyectos:** Maven
* **Control de versiones:** GitHub

## Estructura del Proyecto

La aplicación utiliza el patrón de diseño **MVC (Modelo-Vista-Controlador)** para separar la lógica de negocio de la interfaz de usuario:

* **`view`**: Gestiona la interacción directa con el usuario, encargándose de la salida por terminal y la captura de datos mediante `Scanner`.
* **`controller`**: Actúa como intermediario, procesando las entradas del usuario y coordinando el flujo de la aplicación.
* **`App`**: Punto de entrada que inicializa los componentes y arranca el ciclo de ejecución.
