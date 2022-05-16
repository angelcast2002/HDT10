/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hdt10;


public class Vista {


    public void print(String mensaje) {
        System.out.print(mensaje);
    }


    public void printLn(String mensaje) {
        System.out.println(mensaje);
    }

  
    public void menu() {

        printLn(" :: CENTRO DE RESPUESTA COVID-19 :: ");
        printLn(" 1. Ver ruta mas corta entre ciudades");
        printLn(" 2. Ver nombre ciudad del centro ");
        printLn(" 3. Modificar ruta ");
        printLn(" 4. Salir");

    }

}
