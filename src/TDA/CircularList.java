/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;
import TDA.Simple.*;

/**
 *
 * @author rafae
 */
public class CircularList<T> {
    private Node<T> L;
    
    public CircularList() {
        this.L = null;
    }
    
    public void addFirst(T value) {
        Node <T> newNode = new Node<>(value);
        
        if (L != null) {
            Node<T> ptr = L;
            
            while (ptr != L) {
                ptr = ptr.next();
            }
            newNode.setNext(L);
            ptr.setNext(newNode);
            L = newNode;
        } else {
            L = newNode;
            newNode.setNext(L);
        }
    }
    
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        
        if (L == null) {
            addFirst(value);
        } else {
            Node ptr = L;
            
            while(ptr.next() != L) {
                ptr = ptr.next();
            }
            ptr.setNext(newNode);
            newNode.setNext(L);
        }
    }

    public Node<T> getL() {
        return L;
    }

    public void setL(Node<T> L) {
        this.L = L;
    }
}
