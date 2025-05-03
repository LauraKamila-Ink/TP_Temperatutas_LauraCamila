package src.LecturaArchivo; // Esto asume que tu archivo está en esta ruta

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Llamamos al método para cargar el archivo
        cargarCSV();
    }

    public static void cargarCSV() {
        // Cambia la ruta aquí, asegurándote de que sea correcta
        String archivo = "src/LecturaArchivo/Temperaturas.csv";  // Ruta relativa

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                // Aquí puedes procesar cada línea del archivo
                System.out.println("Ciudad: " + datos[0] + ", Fecha: " + datos[1] + ", Temperatura: " + datos[2]);
            }
        } catch (IOException e) {
            // Si no se encuentra el archivo o hay un error de lectura
            e.printStackTrace();
        }
    }
}
