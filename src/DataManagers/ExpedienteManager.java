/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagers;

import Entidades.*;
import TDA.Simple.*;
import TDA.*;

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
    
    public static int comparar(Expediente a, Expediente b) {
        int p1 = prioridadNumero(a.getPriority());
        int p2 = prioridadNumero(b.getPriority());
        
        if (p1 != p2) {
            return Integer.compare(p1, p2);
        }
        
        return a.getStartDate().compareTo(b.getStartDate());
    }
    
    private static int prioridadNumero(String prioridad) {
        if (prioridad.equalsIgnoreCase("Alta")) {
            return 1;
        } else if (prioridad.equalsIgnoreCase("Media")) {
            return 2;
        } else if (prioridad.equalsIgnoreCase("Baja")) {
            return 3;
        } else {
            return 4;
        }
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
    
    public static void addOrdenado(CircularList<Expediente> lista, Expediente e) {
        Node<Expediente> nuevo = new Node<>(e);

        Node<Expediente> inicio = lista.getL();
        if (inicio == null) {
            nuevo.setNext(nuevo);
            lista.setL(nuevo);
            return;
        }

        Node<Expediente> actual = inicio;
        Node<Expediente> anterior = null;

        do {
            if (comparar(e, actual.item()) < 0) {
                break;
            }
            anterior = actual;
            actual = actual.next();
        } while (actual != inicio);

        if (anterior == null) {
            Node<Expediente> ultimo = inicio;
            while (ultimo.next() != inicio) {
                ultimo = ultimo.next();
            }
            nuevo.setNext(inicio);
            ultimo.setNext(nuevo);
            lista.setL(nuevo);
        } else {
            anterior.setNext(nuevo);
            nuevo.setNext(actual);
        }
    }
    
    public static CircularList<Expediente> expedientesEnProcesoOrdenada() {
        CircularList<Expediente> pendientes = new CircularList<>();
        Node<Expediente> ptr = expedientes.L();
        
        while (ptr != null) {
            Expediente e = ptr.item();
            if (!e.getState().equalsIgnoreCase("Finalizado.")) {
                addOrdenado(pendientes, e);
            }
            ptr = ptr.next();
        }
        return pendientes;
    }

}
