/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Modelos.MFundacion;
/**
 *
 * @author Khaal
 */
public class MGobernacion {
    private MFundacion fundacion;

    public MFundacion getFundacion() {
        return fundacion;
    }

    public void setFundacion(MFundacion fundacion) {
        this.fundacion = fundacion;
    }

    public MGobernacion(MFundacion fundacion) {
        this.fundacion = fundacion;
    }
    
    
}
