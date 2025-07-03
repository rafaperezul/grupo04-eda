/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import Entidades.*;
import TDA.Simple.*;

/**
 *
 * @author rafae
 */
public class ExpedienteManager {
    private static LinkedList<Expediente> expedientes = new LinkedList<>();
    
    public static void registrarExpediente(Expediente expediente) {
        expedientes.addLast(expediente);
    }
    
    public static LinkedList<Expediente> Tramites() {
        return expedientes;
    }
    
    public static Expediente buscarPorId(String id) {
        Node<Expediente> ptr = expedientes.L();
        while (ptr != null) {
            if (ptr.item().getId().equals(id)) {
                return ptr.item();
            }
            ptr = ptr.next();
        }
        return null;
    }
    
    public static LinkedList<Expediente> expedientesEnProceso() {
            LinkedList<Expediente> pendientes = new LinkedList<>();
            Node<Expediente> ptr = expedientes.L();
            
            while (ptr != null) {
                Expediente e = ptr.item();
                if (!e.getState().equalsIgnoreCase("Finalizado.")) {
                    pendientes.addLast(e);
                }
                ptr = ptr.next();
            }
            return pendientes;
    }

}
