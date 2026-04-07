package es.etg.prog.pokedex.model.dto;


public class Pokemon {

    // Atributos
    private final int id;
    private final String nombre;
    private final String tipo;
    
    private boolean capturado;

    // Constructores
    public Pokemon(int id, String nombre, String tipo, boolean capturado) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capturado = capturado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
}