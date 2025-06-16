package ar.edu.unrn.donaciones.modelo;

public class Coordenada {

    private double latitud;
    private double longitud;
    //crea una coordenada con latitud y longitud
    public Coordenada(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
  
    //getters
    public double obtenerLatitud() {
        return latitud;
    }

    public double obtenerLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "(" + latitud + ", " + longitud + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;//si es el mismo objeto, son iguales
        if (!(obj instanceof Coordenada))
            return false;//si no es instancia de Coordenada, no pueden ser iguales
        Coordenada otra = (Coordenada) obj;
        return (latitud == otra.latitud &&
                longitud == otra.longitud);//si son iguales todos los atributos, son iguales
    }
}
