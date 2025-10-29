import java.io.*;
import java.util.*;

public class Equipo_de_Computo {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Parte_Hardware> listaHardware = new ArrayList<>();
    private static final String ARCHIVO = "C:\\Users\\lolis\\OneDrive\\Escritorio\\partes_hardware.txt";

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Inserta");
            System.out.println("2. Visualiza");
            System.out.println("3. Carga Archivo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {
                case 1 -> menuInserta();
                case 2 -> menuVisualiza();
                case 3 -> menuCargaArchivo();
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcionPrincipal != 4);
    }

    // ==========================
    // MENÚ 1 - INSERCIÓN (guarda en lista)
    // ==========================
    private static void menuInserta() {
        int opcion;
        do {
            System.out.println("\n--- Menú Inserta ---");
            System.out.println("1. Insertar objeto");
            System.out.println("2. Regresar");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                insertarObjeto();
            }

        } while (opcion != 2);
    }

    private static void insertarObjeto() {
        System.out.println("\n¿Qué deseas insertar?");
        System.out.println("1. Procesador");
        System.out.println("2. Tarjeta Gráfica");
        System.out.println("3. Gabinete");
        System.out.println("4. Gabinete Gamer");
        System.out.print("Opción: ");
        int tipo = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (tipo) {
            case 1 -> listaHardware.add(crearProcesador());
            case 2 -> listaHardware.add(crearTarjetaGrafica());
            case 3 -> listaHardware.add(crearGabinete());
            case 4 -> listaHardware.add(crearGabineteGamer());
            default -> System.out.println("Opción inválida.");
        }

        System.out.println("Objeto agregado a la lista correctamente.");
    }

    private static Procesador crearProcesador() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        System.out.print("Núcleos: ");
        int nucleos = sc.nextInt();
        System.out.print("Hilos: ");
        int hilos = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return new Procesador(nombre, precio, nucleos, hilos);
    }

    private static Tarjeta_Grafica crearTarjetaGrafica() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        System.out.print("Tamaño de Memoria (GB): ");
        int mem = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return new Tarjeta_Grafica(nombre, precio, mem);
    }

    private static Gabinete crearGabinete() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        System.out.print("Formato (ATX, mATX, ITX...): ");
        String formato = sc.nextLine();
        return new Gabinete(nombre, precio, formato);
    }

    private static Gabinete_Gamer crearGabineteGamer() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Formato: ");
        String formato = sc.nextLine();
        System.out.print("¿Tiene luces? (true/false): ");
        boolean luces = sc.nextBoolean();
        sc.nextLine(); // limpiar buffer
        return new Gabinete_Gamer(nombre, precio, formato, luces);
    }

    // ==========================
    // MENÚ - VISUALIZAR
    // ==========================
    private static void menuVisualiza() {
        int opcion;
        do {
            System.out.println("\n--- Menú Visualiza ---");
            System.out.println("1. Visualizar Lista");
            System.out.println("2. Regresar");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                visualizarLista();
            }

        } while (opcion != 2);
    }

    private static void visualizarLista() {
        if (listaHardware.isEmpty()) {
            System.out.println("No hay objetos en la lista.");
            return;
        }

        System.out.println("\n--- Lista de Hardware ---");
        for (int i = 0; i < listaHardware.size(); i++) {
            Parte_Hardware p = listaHardware.get(i);
            System.out.println((i + 1) + ". " + p.getClass().getSimpleName() + " -> " +
                    "Nombre: " + p.getNombre() +
                    ", Precio: $" + p.getPrecio() +
                    ", IVA: $" + String.format("%.2f", p.calcularIVA()) +
                    ", Precio Total: $" + String.format("%.2f", (p.getPrecio() + p.calcularIVA())));
        }
        System.out.println("Total de objetos en lista: " + listaHardware.size());
    }

    // ==========================
    // MENÚ - CARGA ARCHIVO
    // ==========================
    private static void menuCargaArchivo() {
        int opcion;
        do {
            System.out.println("\n--- Menú Carga Archivo ---");
            System.out.println("1. Guardar en Archivo");
            System.out.println("2. Cargar desde Archivo");
            System.out.println("3. Regresar");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> guardarArchivo();
                case 2 -> cargarArchivo();
                case 3 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }

    private static void guardarArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(listaHardware);
            System.out.println("Lista guardada correctamente en: " + ARCHIVO);
            System.out.println("Total de objetos guardados: " + listaHardware.size());
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            List<Parte_Hardware> cargada = (List<Parte_Hardware>) ois.readObject();
            listaHardware.clear();
            listaHardware.addAll(cargada);
            System.out.println("Archivo cargado correctamente desde: " + ARCHIVO);
            System.out.println("Total de objetos cargados: " + listaHardware.size());
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + ARCHIVO);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}
