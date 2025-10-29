public class Gabinete extends Parte_Hardware {
    private String formato;

    public Gabinete(String nombre, double precio, String formato) {
        super(nombre, precio);
        this.formato = formato;
    }

    public Gabinete(){}

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public double calcularIVA() {
        return getPrecio() * 0.15;
    }
}
