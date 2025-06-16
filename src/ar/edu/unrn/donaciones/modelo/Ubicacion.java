package ar.edu.unrn.donaciones.modelo;

public class Ubicacion {
    
    // atributos
    private String direccion;
    private String zona;
    private String barrio;
    private Coordenada coordenada;

    // constructor que recibe ya el objeto coordenada
    public Ubicacion(String direccion, String zona, String barrio, Coordenada coord) {
        this.direccion = direccion;
        this.zona = zona;
        this.barrio = barrio;
        this.coordenada = coord;
    }
    // constructor que recibe los datos de la coordenada
    public Ubicacion(String direccion, String zona, String barrio, double latitud, double longitud) {
        this(direccion, zona, barrio, new Coordenada(latitud, longitud));
    }

    // getters
    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerZona() {
        return zona;
    }

    public String obtenerBarrio() {
        return barrio;
    }

    public Coordenada obtenerCoordenada() {
        return coordenada;
    }

    @Override
    public String toString() {
        return direccion + " - " + barrio + " (" + zona + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)//si es el mismo objeto, son iguales
            return true;
        if (!(obj instanceof Ubicacion))
            return false;//si no es instancia de Ubicacion, no pueden ser iguales
        Ubicacion otra = (Ubicacion) obj;
        //si son iguales todos los atributos, son iguales
        return direccion.equals(otra.direccion) &&
                zona.equals(otra.zona) &&
                barrio.equals(otra.barrio) &&
                coordenada.equals(otra.coordenada);
    }
}
