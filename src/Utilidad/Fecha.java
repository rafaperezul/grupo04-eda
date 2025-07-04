/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidad;

/**
 *
 * @author rafae
 */
public class Fecha implements Comparable<Fecha> {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString() {
        String d;
        if (day < 10) {
            d = "0" + day;
        } else {
            d = String.valueOf(day);
        }
        
        String m;
        if (month < 10) {
            m = "0" + month;
        } else {
            m = String.valueOf(month);
        }
        
        return d + "/" + m + "/" + year;
    }
    
    @Override
    public int compareTo(Fecha other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        return Integer.compare(this.day, other.day);
    }
}
