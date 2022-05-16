
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

    public void menumodificarRuta() {

        printLn("\n :: MODIFICAR RUTA ::\n");
        printLn("1. Reportar interrupcion de trafico ");
        printLn("2. Ingresar nueva conexion");
        printLn("3. Regresar");

    }


}
