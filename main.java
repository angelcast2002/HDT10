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
