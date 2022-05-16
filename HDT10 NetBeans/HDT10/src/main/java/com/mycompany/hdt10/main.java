/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hdt10;

import java.io.IOException;



public class main {

    public static void main(String[] args) throws IOException {

        // Generar vista y controlador
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);

        // llamar a las funciones principales del programa
        controlador.generarGrafo();
        controlador.implementacion();

    }
}

