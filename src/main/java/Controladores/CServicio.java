/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Generales.Mensajes;
import Modelos.MServicio;
import Vistas.VServicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Khaal
 */
public class CServicio implements ActionListener {
    
    private VServicio vserv;
    private Mensajes msj = new Mensajes();
    private CMenu cmenu;
    private MServicio mserv;
    public CServicio(CMenu cmenu){
        //vserv = new VServicio(cmenu.getVMenu(),false,null)
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
