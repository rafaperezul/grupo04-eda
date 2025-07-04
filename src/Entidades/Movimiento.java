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
public class Movimiento {
    private Fecha date;
    private Dependencia fromDep;
    private Dependencia toDep; // departamentos de origen y destino

    public Movimiento(Fecha date, Dependencia fromDep, Dependencia toDep) {
        this.date = date;
        this.fromDep = fromDep;
        this.toDep = toDep;
    }

    public Fecha getDate() {
        return date;
    }

    public Dependencia getFromDep() {
        return fromDep;
    }

    public Dependencia getToDep() {
        return toDep;
    }

    public void setDate(Fecha date) {
        this.date = date;
    }

    public void setFromDep(Dependencia fromDep) {
        this.fromDep = fromDep;
    }

    public void setToDep(Dependencia toDep) {
        this.toDep = toDep;
    }
}
