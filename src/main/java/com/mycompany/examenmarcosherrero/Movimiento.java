/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenmarcosherrero;

/**
 *
 * @author alumno
 */
public class Movimiento {
    private String codigo;
    private double importe;

    public Movimiento(String codigo, double importe) {
        this.codigo = codigo;
        this.importe = importe;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "codigo=" + codigo + ", importe=" + importe + '}';
    }
    
    
}
