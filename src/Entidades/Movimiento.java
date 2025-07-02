/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author rafae
 */
public class Movimiento {
    private Fecha date;
    private Dependencia fromDep;
    private Dependencia toDep; // departamentos de origen y destino
    private String observation;

    public Movimiento(Fecha date, Dependencia fromDep, Dependencia toDep, String observation) {
        this.date = date;
        this.fromDep = fromDep;
        this.toDep = toDep;
        this.observation = observation;
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

    public String getObservation() {
        return observation;
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

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
