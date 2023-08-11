/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package es;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhons
 */
public class PersonaTest {
    
    @Test
    public void test3() {
        Persona p = new Persona (0);
    assertFalse (p.isMayorDeEdad ());
    }


    @Test
    public void test4() {
    Persona p = new Persona (17); 
    assertFalse(p.isMayorDeEdad());
    }
    

    @Test
    public void test5 () {
    Persona p = new Persona (18); assertTrue(p.isMayorDeEdad ());
    }

    @Test
    public void test6() {
    Persona p = new Persona (100); assertTrue(p.isMayorDeEdad () );
    }
    
    @Test(expected = AssertionError.class)
    public void test1(){
        
    }
    
}
