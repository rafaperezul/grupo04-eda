/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import Entidades.Movimiento;
import Cola.*;

/**
 *
 * @author rafae
 */
public class MovimientoManager {
    private static final int MAX = 50;
    private static String[] ids = new String[MAX];
    private static Cola[] colas = new Cola[MAX];
    private static int cantidad = 0;

    public static void agregarMovimiento(String idExpediente, Movimiento mov) {
        int pos = buscarPos(idExpediente);
        if (pos == -1) {
            if (cantidad >= MAX) return;
            ids[cantidad] = idExpediente;
            colas[cantidad] = new Cola();
            colas[cantidad].encolar(mov);
            cantidad++;
        } else {
            colas[pos].encolar(mov);
        }
    }

    public static Cola obtenerHistorial(String idExpediente) {
        int pos = buscarPos(idExpediente);
        if (pos != -1) return clonarCola(colas[pos]);
        return new Cola();
    }
    
    private static int buscarPos(String id) {
        for (int i = 0; i < cantidad; i++) {
            if (ids[i].equalsIgnoreCase(id)) return i;
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
