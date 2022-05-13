import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

    // Utilidades
    Vista vista;
    Scanner sc = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    

    // Archivo
    String src = "./guategrafo.txt";
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    // Rutas
    ArrayList<Grafo> nodos = new ArrayList<Grafo>();

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void implementacion() throws IOException {

        Boolean estado = true;

        while(estado){

            vista.menu();
            int opcion = scInt.nextInt();

            switch(opcion){
                case 1:
                    rutaMasCorta();
                    break;  
                case 2:
                    ciudadCentroGrafo();
                    break;
                case 3:
                    modificarRuta();                        
                    break;
                case 4:
                    vista.printLn("[OK] Finalizando Programa...");
                    estado = false;
                    break;
                default:
                    vista.printLn("[ERROR] Opcion no valida");                                      
                    break;
            }
        }
    }

    public void rutaMasCorta() throws IOException {

        vista.printLn(":: Ruta Mas Corta ::");
        String origen = sc.nextLine().toLowerCase();
        vista.printLn("-> Ingrese el nombre de la ciudad de origen: ");

        vista.printLn("-> Ingrese el nombre de la ciudad de destino: ");
        String destino = sc.nextLine().toLowerCase();
        distanciaMasCorta (origen, destino);
		
    }

    public void ciudadCentroGrafo() throws IOException {
        vista.printLn("\n:: Ciudad Central ::\n");
        System.out.println("La ciudad central es" + grafo.centro());
    }

    public void modificarRuta() throws IOException {

        Boolean estado = true;
        while(estado){
            vista.printLn("\n :: MODIFICAR RUTA ::\n");
            vista.printLn("1. Reportar interrupcion de trafico ");
            vista.printLn("2. Ingresar nueva conexion");
            vista.printLn("3. Regresar");

            Integer opcion = scInt.nextInt();
            switch(opcion){
                case 1:
                    
                    break;  
                case 2:
                    
                    break;
                case 3:
                    estado = false;                       
                    break;
                default:
                    vista.printLn("[ERROR] Opcion no valida");                                      
                    break;
            }
        }


    }

    public void generarGrafo() throws IOException {
        
        try {
            archivo = new File(src);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        } catch (Exception e) {
            System.out.println("[!] No se encontro el archivo");
        }
        try {
            

        }catch (Exception e) {
            System.out.println(e);
        }
        

    }

    public String distanciaMasCorta(String origen, String destino){
        
        String Mensaje = "";
        for (int i = 0; i < nodos.size(); i++) {
            if (nodos.get(i).getNombre().equals(origen)){
                if (nodos.get(i).getDestino().equals(destino)){
                    Mensaje = "La distancia mas corta es: " + nodos.get(i).getDistancia() + " vieniendo desde " + origen + " hasta " + destino;
                }

                else{
                    
                }
            }

            
        }
            
        return Mensaje;
    }





}