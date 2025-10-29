
public class Procesador extends Parte_Hardware {

    private int nucleos;
    private int hilos;

    public Procesador(String nombre, double precio, int nucleos, int hilos) {
        super(nombre, precio);
        this.nucleos = nucleos;
        this.hilos = hilos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getNucleos() {
        return nucleos;
    }


    public void setHilos(int hilos) {
        this.hilos = hilos;
    }

    public int getHilos() {
        return hilos;
    }

    @Override
    public double calcularIVA() {
        return getPrecio() * 0.16;
    }
}
