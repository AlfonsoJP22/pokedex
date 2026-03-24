package es.etg.prog.pokedex.view;

import java.util.Scanner;

public class PokedexView {

    private Scanner scanner;

    public PokedexView() {
        this.scanner = new Scanner(System.in);
    }

    
    public void mostrarMenu() {
        System.out.println("\n--- POKÉDEX ---");
        System.out.println("1. Listar Pokémons");
        System.out.println("2. Buscar Pokémon por ID");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    /**
     * Lee una cadena de texto desde el teclado.
     */
    public String leerString() {
        return scanner.nextLine();
    }

    /**
     * Lee un número entero desde el teclado.
     * Usamos Integer.parseInt para evitar errores al mezclar lecturas.
     */
    public int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir un número válido.");
            return -1; // Valor de error
        }
    }
}