import java.io.Serializable;

public abstract class Parte_Hardware implements Impuestos, Serializable {
    private String nombre;
    private double precio;

    public Parte_Hardware(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Parte_Hardware() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

}

