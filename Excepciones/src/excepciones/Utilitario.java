/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExceptionNumerica;
import excepcionesPersonalizadas.MiExceptionGenerica;

/**
 *
 * @author Estudiante
 */
public class Utilitario {
    /**
     * Esta funcion permite convertir un texto en numero y
     * controlar los errores que se puedan presentar a 
     * partir de ello.
     * @param numeroTexto
     * @return Devuelve un valor de tipo entero "int"
     */
    public static int convertir(String numeroTexto)
            throws MiExceptionNumerica, MiExceptionGenerica{
        try{
            return Integer.parseInt(numeroTexto);
        }catch(NumberFormatException s){
            throw new MiExceptionNumerica();
        }catch(Exception ex){
            throw new MiExceptionGenerica();
        }      
    }
}
