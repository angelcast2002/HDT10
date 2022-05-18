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


import org.junit.Test;


/**
 *
 * @author Angel
 */
public class GrafoTest {
    
    


    Controlador controlador = new Controlador(null);

    @Test
    public void agregarArco() {
        Grafo grafo = new Grafo(5);

        try {
            grafo.ingresarArco(0,0,5);
            assertEquals(true, true);

        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    
    @Test
    public void agregarNodo() {
        Grafo grafo = new Grafo(5);

        try {
            grafo.ingresarNombre(0,"Ciudad ejemplo");
            assertEquals(true, true);

        } catch (Exception e) {
            assertEquals(true, false);
        }


    }

    @Test
    public void algoritmoFloyd() {
        Grafo grafo = new Grafo(5);

        try {
            assertEquals(null, grafo.centro());

        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


}
    

