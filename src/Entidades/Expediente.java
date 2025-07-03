/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Utilidad.Fecha;
import TDA.Simple.*;

/**
 *
 * @author rafae
 */
public class Expediente {
    private String id;
    private String priority;
    private Interesado applicant;
    private String subject;
    private String refDocument; //????????
    private Fecha startDate; 
    private Fecha endDate;
    private Fecha ChangeDate;
    private Dependencia dependence; //????????
    private String state;
    

    public Expediente(String id, String priority, Interesado applicant, String subject, String refDocument, Fecha startDate, Dependencia dependence) {
        this.id = id;
        this.priority = priority;
        this.applicant = applicant;
        this.subject = subject;
        this.refDocument = refDocument;
        this.startDate = startDate;
        this.dependence = dependence;
        this.state = "En proceso";
    }

    public String getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public Interesado getApplicant() {
        return applicant;
    }

    public String getSubject() {
        return subject;
    }

    public String getRefDocument() {
        return refDocument;
    }

    public Fecha getStartDate() {
        return startDate;
    }

    public Fecha getEndDate() {
        return endDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setApplicant(Interesado applicant) {
        this.applicant = applicant;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRefDocument(String refDocument) {
        this.refDocument = refDocument;
    }

    public void setStartDate(Fecha startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Fecha endDate) {
        this.endDate = endDate;
    }

    public Fecha getChangeDate() {
        return ChangeDate;
    }

    public void setChangeDate(Fecha ChangeDate) {
        this.ChangeDate = ChangeDate;
    }

    public Dependencia getDependence() {
        return dependence;
    }

    public void setDependence(Dependencia dependence) {
        this.dependence = dependence;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
} 

