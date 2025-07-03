/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author camil
 */
public class Cola {
    private static final int MAX_SIZE = 50;
    private  int[] data;
    private int ini;
    private int fin;
    private int cantidad;
    
    public Cola(){
        data = new int[MAX_SIZE];
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
    
    public void encolar(int item){
            if (isFull()){
                System.out.println("Cola llena.");
                return;
            }
            fin = (fin + 1) % MAX_SIZE;
            data[fin] = item;
            cantidad++;      
    }
    
    public int desencolar(){
        if (isEmpty()){
            System.out.println("Cola vacia.");
            return -1;
        }
        int item = data[ini];
        ini = (ini + 1) % MAX_SIZE;
        cantidad--;  
        return item;
    }
    
     public void printCola(){
        if (isEmpty()){
            System.out.println("Cola vacia");
            return;
        }
        System.out.println("Cola:");
        System.out.println("----------------");
        // TAERA PARA COLA 
        for (int i=0;i<cantidad;i++){
            int ind = (ini + i)%MAX_SIZE;
            System.out.print(data[ind] + " | ");
        }
        System.out.println("");
     }
}
