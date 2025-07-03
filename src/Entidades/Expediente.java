/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import TDA.Simple.*;

/**
 *
 * @author rafae
 */
public class Expediente {
    public class RecordData {
        private String id;
        private int priority; // de 1 a 3
        private Interesado applicant; // persona que esta haciendo el tramite
        private String subject; // asunto
        private String refDocument;
        private Fecha startDate; 
        private Fecha endDate;
        private LinkedList<String> documents; // los documentos que genera el tramite (Strings)

        public RecordData(String id, int priority, Interesado applicant, String subject, String refDocument, Fecha startDate, LinkedList documents) {
            this.id = id;
            this.priority = priority;
            this.applicant = applicant;
            this.subject = subject;
            this.refDocument = refDocument;
            this.startDate = startDate;
            this.documents = documents;
        }

        public String getId() {
            return id;
        }

        public int getPriority() {
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

        public LinkedList getDocuments() {
            return documents;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setPriority(int priority) {
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

        public void setDocuments(LinkedList documents) {
            this.documents = documents;
        }
    }

} 

