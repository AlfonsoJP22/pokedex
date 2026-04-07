package es.etg.prog.pokedex.view;
import java.util.Scanner;

public class PokedexView {
    
    public static final String MENU_TITULO = "POKEDEX";
    public static final String OPCION_1 = "1. Ver lista de pokemon.";
    public static final String OPCION_2 = "2. Buscar pokemon por ID.";
    public static final String OPCION_SALIR = "0. Salir.";
    public static final String PEDIR_OPCION = "Elija una opción: ";

    public static final int OPCION_1_VALOR = 1;
    public static final int OPCION_2_VALOR = 2;
    public static final int SALIR_VALOR = 0;

    private final Scanner scanner;

    public PokedexView() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        String menu = String.format("%n%s%n%s%n%s%n%s%n%s",
            MENU_TITULO,
            OPCION_1,
            OPCION_2,
            OPCION_SALIR,
            PEDIR_OPCION);
        
        System.out.print(menu);
    }

    public String leerString() {
        return scanner.nextLine();
    }

    public int leerEntero() {
        return Integer.parseInt(leerString());    }
}