package cl.notchEnterprise.model;

public class Juego {
    private int id;
    private String nombre;
    private int stock;
    private int precio;
    private int genero;

    public Juego(){}
    
    public Juego(int id, String nombre, int stock, int precio, int genero) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    
    
}
