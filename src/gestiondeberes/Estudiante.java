/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeberes;

/**
 *
 * @author Mike
 */
public class Estudiante extends Persona {
    private final String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() { return carrera; }

    @Override
    public String toString() {
        return super.toString() + ", Estudiante{carrera='" + carrera + "'}";
    }
}

