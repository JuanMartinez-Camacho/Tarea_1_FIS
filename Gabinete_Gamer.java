public class Gabinete_Gamer extends Gabinete {
    private boolean luces;

    public Gabinete_Gamer(String nombre, double precio, String formato, boolean luces) {
        super(nombre, precio, formato);
        this.luces = luces;
    }

    public Gabinete_Gamer(){}


    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public boolean getLuces() {
        return luces;
    }

    @Override
    public double calcularIVA() {
        // IVA del 18% para gabinetes gamer (mayor tasa por ser producto "gamer")
        return getPrecio() * 0.18;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luces RGB: " + (luces ? "Sí" : "No");
    }
}
