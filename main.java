import java.io.IOException;

public class main{
    public static void main(String[] args) throws IOException {
        
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        
        controlador.generarGrafo();
        controlador.implementacion();
        
    }
}   