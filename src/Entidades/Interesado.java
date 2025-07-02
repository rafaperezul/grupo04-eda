/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author rafae
 */
public class Interesado {
    private String dni;
    private String fullName;
    private String phone;
    private String email;
    private String type; //para saber si es trabajador de ulima o persona/institucion externa

    public Interesado(String dni, String fullName, String phone, String email, String type) {
        this.dni = dni;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public String getDni() {
        return dni;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }
}
