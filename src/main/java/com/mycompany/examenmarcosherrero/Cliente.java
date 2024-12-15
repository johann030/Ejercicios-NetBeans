/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenmarcosherrero;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String codigo;
    private String nif;
    private String apellidos;
    private String nombre;
    private double totalventas;

    public Cliente(String codigo, String nif, String apellidos, String nombre, double totalventas) {
        this.codigo = codigo;
        this.nif = nif;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.totalventas = totalventas;
    } 
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalventas() {
        return totalventas;
    }

    public void setTotalventas(double totalventas) {
        this.totalventas = totalventas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nif=" + nif + ", apellidos=" + apellidos + ", nombre=" + nombre + ", totalventas=" + totalventas + '}';
    }
    
    
}
