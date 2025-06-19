/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondeberes;

/**
 *
 * @author Mike
 */



import java.io.File;

public class GestionDeberes {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 20, "Ingeniería de Software");
        Profesor profesor1 = new Profesor("Dr. Gómez", 50, "Física");
        Estudiante estudiante2 = new Estudiante("Luis", 22, "Matemáticas");

        // Ruta explícita a src/gestiondeberes
        String carpetaDestino = System.getProperty("user.dir") + File.separator + "src" + File.separator + "gestiondeberes";
        String archivo = carpetaDestino + File.separator + "personas.txt";
        String archivoRes = carpetaDestino + File.separator + "personas.res";

        try {
            // Guardar y exportar
            PersonaCRUD.agregarPersona(estudiante1, archivo);
            PersonaCRUD.agregarPersona(profesor1, archivo);
            PersonaCRUD.agregarPersona(estudiante2, archivo);

            PersonaCRUD.exportarResultado(archivo, archivoRes);

            System.out.println("✅ Personas guardadas en: " + archivo);
            System.out.println("📝 Resultado exportado a: " + archivoRes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

