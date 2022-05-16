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
public class GrafoTest {
    
    public GrafoTest() {
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
     * Test of ingresarArco method, of class Grafo.
     */
    @Test
    public void testIngresarArco() {
        System.out.println("ingresarArco");
        int n1 = 0;
        int n2 = 0;
        int peso = 0;
        Grafo instance = null;
        instance.ingresarArco(n1, n2, peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarNombre method, of class Grafo.
     */
    @Test
    public void testIngresarNombre() {
        System.out.println("ingresarNombre");
        int nodo = 0;
        String nombre = "";
        Grafo instance = null;
        instance.ingresarNombre(nodo, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of centro method, of class Grafo.
     */
    @Test
    public void testCentro() {
        System.out.println("centro");
        Grafo instance = null;
        String expResult = "Antigua";
        String result = instance.centro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class Grafo.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Grafo instance = null;
        instance.calcular();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesominimo method, of class Grafo.
     */
    @Test
    public void testPesominimo() {
        System.out.println("pesominimo");
        int org = 0;
        int des = 0;
        Grafo instance = null;
        int expResult = 0;
        int result = instance.pesominimo(org, des);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caminocorto method, of class Grafo.
     */
    @Test
    public void testCaminocorto() {
        System.out.println("caminocorto");
        int org = 0;
        int des = 0;
        Grafo instance = null;
        String expResult = "";
        String result = instance.caminocorto(org, des);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Grafo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        int nodo = 0;
        Grafo instance = null;
        String expResult = "";
        String result = instance.getNombre(nodo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
