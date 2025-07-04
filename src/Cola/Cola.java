/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

import Entidades.Movimiento;

/**
 *
 * @author camil
 */
public class Cola {
    private static final int MAX_SIZE = 50;
    private Movimiento[] data;
    private int ini;
    private int fin;
    private int cantidad;
    
    public Cola(){
        data = new Movimiento[MAX_SIZE];
        ini =  0;
        fin = -1;
        cantidad = 0;
    }
    
    public boolean isEmpty(){
        return cantidad == 0;
    }
    
    public boolean isFull(){
        return cantidad == MAX_SIZE;
    }
    
    public void encolar(Movimiento mov){
            if (isFull()){
                System.out.println("Cola llena.");
                return;
            }
            fin = (fin + 1) % MAX_SIZE;
            data[fin] = mov;
            cantidad++;      
    }
    
    public Movimiento desencolar(){
        if (isEmpty()){
            System.out.println("Cola vacia.");
            return null;
        }
        Movimiento mov = data[ini];
        ini = (ini + 1) % MAX_SIZE;
        cantidad--;  
        return mov;
    }
}
