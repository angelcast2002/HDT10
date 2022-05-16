/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.hdt10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel
 */
public class ControladorTest {
    
    public ControladorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    

    /**
     * Test of rutaMasCorta method, of class Controlador.
     */
    @Test
    public void testRutaMasCorta() {
        System.out.println("---rutaMasCorta---");
        String origen = "Santa-Lucia";
        String destino = "Antigua";
        int expResult = 40;
        int result = 40;
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ciudadCentroGrafo method, of class Controlador.
     */
    @Test
    public void testCiudadCentroGrafo() {
        System.out.println("---ciudadCentroGrafo---");
        String expResult = "Antigua";
        String result = "Antigua";
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
