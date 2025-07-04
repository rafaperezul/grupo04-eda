/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import TDA.Cola;
import Entidades.Movimiento;
import TDA.Simple.*;

/**
 *
 * @author rafae
 */
public class MovimientoManager {
    private static final int MAX = 50;
    private static LinkedList<String> ids = new LinkedList<>();
    private static LinkedList<Cola> colas = new LinkedList<>(); //seria el historial de movimientos POR expediente
    private static int cantidad = 0;

    public static void agregarMovimiento(String idExpediente, Movimiento mov) {
        int pos = buscarPos(idExpediente);
        if (pos == -1) {
            if (cantidad >= MAX) {
                return;
            }
            ids.addLast(idExpediente);
            Cola colaNueva = new Cola();
            colaNueva.encolar(mov);
            colas.addLast(colaNueva);
            cantidad++;
        } else {
            Cola existente = obtenerColaPorPos(pos);
            if (existente != null) {
                existente.encolar(mov);
            }
        }
    }

    public static Cola obtenerHistorial(String idExpediente) {
        int pos = buscarPos(idExpediente);
        if (pos != -1) { 
            Cola original = obtenerColaPorPos(pos);
            return clonarCola(original);
        }
        return new Cola();
    }
    
    private static Cola obtenerColaPorPos(int pos) {
        Node<Cola> ptr = colas.L();
        int index = 0;
        
        while (ptr != null) {
            if (index == pos) {
                return ptr.item();
            }
            ptr = ptr.next();
        }
        return null;
    }
    
    private static int buscarPos(String id) {
        Node<String> ptr = ids.L();
        int index = 0;
        
        while (ptr != null) {
            if (ptr.item().equalsIgnoreCase(id)) {
                return index;
            }
            ptr = ptr.next();
            index++;
        }
        return -1;
    }
    
    private static Cola clonarCola(Cola original) {
        Cola copia = new Cola();
        Cola aux = new Cola();
        while (!original.isEmpty()) {
            Movimiento m = original.desencolar();
            copia.encolar(m);
            aux.encolar(m);
        }
        while (!aux.isEmpty()) {
            original.encolar(aux.desencolar());
        }
        return copia;
    }
}
