//package floyd2;

public class Grafo {
   
    private int distancia;
    private String nombre;
    private String destino;

    public Grafo(int distancia, String nombre, String destino) {
        this.distancia = distancia;
        this.nombre = nombre;
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    

}
