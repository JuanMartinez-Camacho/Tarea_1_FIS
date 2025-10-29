public class Tarjeta_Grafica extends Parte_Hardware {
    private int tam_mem; // Tamaño de memoria en GB

    public Tarjeta_Grafica(String nombre, double precio, int tam_mem) {
        super(nombre, precio);
        this.tam_mem = tam_mem;
    }

    public void setTamMem(int tam_mem) {
        this.tam_mem = tam_mem;
    }

    public int getTamMem() {
        return tam_mem;
    }

    @Override
    public double calcularIVA() {
        // IVA del 15% para tarjetas gráficas
        return getPrecio() * 0.15;
    }
}
