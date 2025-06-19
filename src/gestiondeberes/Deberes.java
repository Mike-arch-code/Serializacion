/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestiondeberes;

/**
 *
 * @author Mike
 */
import java.io.IOException;

public interface Deberes {
    void guardar(String filePath) throws IOException;
    Object cargar(String filePath) throws IOException, ClassNotFoundException;
}
