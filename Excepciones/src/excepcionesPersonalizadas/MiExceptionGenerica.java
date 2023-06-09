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
public class MiExceptionGenerica extends Exception {
    private final static String MESSAGE=""
            +"Esta es una exception general y no sabemos la causa";

    public MiExceptionGenerica() {
        super(MESSAGE);
    }
    
       
}
