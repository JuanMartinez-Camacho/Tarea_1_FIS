# 💻 Proyecto: Sistema de Gestión de Equipo de Cómputo

Este proyecto en **Java** permite gestionar diferentes componentes de
hardware de un equipo de cómputo, tales como procesadores, tarjetas
gráficas y gabinetes.\
El sistema permite insertar objetos, visualizarlos y guardarlos o
cargarlos desde un archivo utilizando serialización de objetos.

------------------------------------------------------------------------

## 🧩 Estructura del Proyecto

El programa principal es `Equipo_de_Computo.java`, el cual interactúa
con las siguientes clases:

-   **Parte_Hardware.java** → Clase abstracta base que implementa la
    interfaz `Impuestos`.
-   **Impuestos.java** → Interfaz que define el método `calcularIVA()`.
-   **Procesador.java** → Clase que representa un CPU, con atributos de
    núcleos e hilos.
-   **Tarjeta_Grafica.java** → Clase que representa una GPU, con
    atributo de memoria en GB.
-   **Gabinete.java** → Clase que representa un gabinete de computadora
    (con formato ATX, mATX, etc.).
-   **Gabinete_Gamer.java** → Subclase de `Gabinete` que añade la
    propiedad de luces RGB y un IVA distinto.

------------------------------------------------------------------------

## 📜 Funcionalidades Principales

### 1. Menú Principal

    1. Inserta
    2. Visualiza
    3. Carga Archivo
    4. Salir

### 2. Menú Inserta

Permite crear objetos de hardware y agregarlos a una lista en memoria: -
Procesador - Tarjeta Gráfica - Gabinete - Gabinete Gamer

### 3. Menú Visualiza

Muestra en consola los objetos almacenados con su tipo, precio, IVA y
total.

### 4. Menú Carga Archivo

Permite guardar o cargar la lista completa de hardware en un archivo
binario usando serialización de objetos.

Ruta predeterminada del archivo:

    C:\Users\lolis\OneDrive\Escritorio\partes_hardware.txt

------------------------------------------------------------------------

## ⚙️ Ejemplo de Uso

1.  Ejecuta el programa principal `Equipo_de_Computo.java`.
2.  Inserta diferentes partes de hardware desde el menú "Inserta".
3.  Visualiza los objetos agregados con "Visualiza".
4.  Guarda la lista en un archivo mediante "Carga Archivo → Guardar en
    Archivo".
5.  Carga la lista previamente guardada mediante "Carga Archivo → Cargar
    desde Archivo".

------------------------------------------------------------------------

## 🧮 Cálculo de IVA

Cada tipo de hardware tiene un IVA distinto:

  Tipo de Hardware   IVA (%)
  ------------------ ---------
  Procesador         16%
  Tarjeta Gráfica    15%
  Gabinete           15%
  Gabinete Gamer     18%

------------------------------------------------------------------------

## 🗂️ Requisitos

-   Java 8 o superior\
-   IDE recomendado: IntelliJ IDEA o Eclipse

------------------------------------------------------------------------

## 📁 Serialización de Datos

Los objetos implementan la interfaz `Serializable`, lo que permite
guardarlos en un archivo y cargarlos posteriormente sin pérdida de
información.

------------------------------------------------------------------------

## 👨‍💻 Autor

**Juan Martínez**\
Proyecto académico de programación orientada a objetos en Java.
