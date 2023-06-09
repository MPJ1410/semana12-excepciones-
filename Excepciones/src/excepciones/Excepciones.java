/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExceptionGenerica;
import excepcionesPersonalizadas.MiExceptionNumerica;

/**
 *
 * @author Estudiante
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String valorNumerico = "16ñ";
            int numero = Utilitario.convertir(valorNumerico);
            System.out.println("El numero es: "+numero);
            
        } catch (MiExceptionNumerica e) {
            
            System.out.println(e.getMessage());
        
        } catch (MiExceptionGenerica e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}
