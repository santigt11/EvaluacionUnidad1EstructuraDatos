/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Utiles;

import modelo.Tramite;


public class Utiles {
        
        public Integer calcularTiempo(Tramite tramite){
                switch (tramite.getNombre()) {
                        case "CAMBIAR":
                                        return 4;
                        case "ACTUALIZAR":
                                        return 7;
                        case "ASIGNAR":
                                        return 15;
                        case "RECUPERAR":
                                        return 3;
                        default:
                                throw new AssertionError();
                }
        } 
        
        
        
        
    
}
