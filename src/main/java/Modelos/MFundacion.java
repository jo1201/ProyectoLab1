/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Modelos.MServicio;

/**
 *
 * @author Khaal
 */
public class MFundacion {
    private int codigo;
    private String nombre;
    private MServicio servicio;
    private String presidente;

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MServicio getServicio() {
        return servicio;
    }

    public void setServicio(MServicio servicio) {
        this.servicio = servicio;
    }

    public MFundacion(int codigo, String nombre, MServicio servicio, String presidente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.servicio = servicio;
        this.presidente = presidente;
    }

   
}
