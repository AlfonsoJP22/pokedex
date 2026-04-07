package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {

    private final PokedexView vista;

    public PokedexController(PokedexView vista){
        this.vista = vista;
    }

    public void init() {
        boolean salir = false;
        int opcion;

        while (!salir) {
            vista.mostrarMenu();
            opcion = vista.leerEntero();

            switch (opcion) {
                case PokedexView.OPCION_1_VALOR -> ejecutarOpcion1();
                case PokedexView.OPCION_2_VALOR -> ejecutarOpcion2();
                case PokedexView.SALIR_VALOR -> salir = true;
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private void ejecutarOpcion1() {
        // Aquí iría la llamada al modelo en el futuro
    }

    private void ejecutarOpcion2() {
        // Aquí iría la lógica de búsqueda
    }
}
