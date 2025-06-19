/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeberes;

/**
 *
 * @author Mike
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaCRUD {

    // Guardar una lista completa de personas al archivo
    public static void guardarLista(List<Persona> lista, String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        }
    }

    // Cargar lista completa desde el archivo
    public static List<Persona> cargarLista(String archivo) throws IOException, ClassNotFoundException {
        File file = new File(archivo);
        if (!file.exists()) {
            return new ArrayList<>();  // Devuelve lista vacía si el archivo no existe
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Persona>) ois.readObject();
        }
    }

    // Agregar una persona a la lista y reescribir el archivo
    public static void agregarPersona(Persona persona, String archivo) throws IOException, ClassNotFoundException {
        List<Persona> lista = cargarLista(archivo);
        lista.add(persona);
        guardarLista(lista, archivo);
    }

    // Exportar todas las personas como texto legible a .res
    public static void exportarResultado(String archivoDatos, String archivoRes) throws IOException, ClassNotFoundException {
        List<Persona> lista = cargarLista(archivoDatos);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoRes))) {
            for (Persona p : lista) {
                writer.write(p.toString());
                writer.newLine();
            }
        }
    }
}

