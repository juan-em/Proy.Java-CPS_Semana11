/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es;

/**
 *
 * @author jhons
 */
public class Persona {
    private int edad;
    
    public Persona(int edad){
        this.edad = edad;
    }
    public boolean isMayorDeEdad(){
        assert  edad >= 0;
         return edad >= 18;
    }    
}
