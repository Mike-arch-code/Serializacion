/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiondeberes;

/**
 *
 * @author Mike
 */
public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }

    @Override
    public String toString() {
        return super.toString() + ", Profesor{especialidad='" + especialidad + "'}";
    }
}

