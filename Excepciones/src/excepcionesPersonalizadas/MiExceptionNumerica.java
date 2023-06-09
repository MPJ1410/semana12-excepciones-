/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Estudiante
 */
public class MiExceptionNumerica extends Exception{
    
    private final static String MENSAJE = "Error de convercion numerica, ingrese un texto"
            + " de contenga un numero";
    
    public MiExceptionNumerica() {
        super(MENSAJE);
    }
    
    
}
