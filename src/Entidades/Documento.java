/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Utilidad.Fecha;

/**
 *
 * @author rafae
 */
public class Documento {
    private String name;
    private Fecha registerDate;

    public Documento(String name, Fecha registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public Fecha getRegisterDate() {
        return registerDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegisterDate(Fecha registerDate) {
        this.registerDate = registerDate;
    }
}
