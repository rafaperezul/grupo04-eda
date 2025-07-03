/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import TDA.Simple.*;

/**
 *
 * @author rafae
 */
public class ListaTramites {
    private static LinkedList<Expediente> Lista;
    
    public ListaTramites(){
        Lista = new LinkedList<Expediente>();
    }
    
    public void AddTramite(Expediente Expediente){
        Lista.addLast(Expediente);
    }

    public static LinkedList<Expediente> Tramites() {
        return Lista;
    }
}
