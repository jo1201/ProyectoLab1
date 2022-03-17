/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.ArrayList;
/**
 *
 * @author josue
 */
public class Gobernacion {
    
    private ArrayList <Fundacion> fundacion;
    private ArrayList <CalendarioCharlas> charlas;
    
    public Gobernacion (){
        this.fundacion = new ArrayList<Fundacion>();
        this.charlas = new ArrayList<CalendarioCharlas>();
    }
    
}
