package ar.edu.unrn.donaciones.modelo;

public class Bien {

    // constantes 
    public static final int TIPO_ALIMENTO = 1;
    public static final int TIPO_ROPA = 2;
    public static final int TIPO_MOBILIARIO = 3;
    public static final int TIPO_HIGIENE = 4;

    public static final int CATEGORIA_BAJA = 1;
    public static final int CATEGORIA_MEDIA = 2;
    public static final int CATEGORIA_ALTA = 3;
    
    //atributos
    private int tipo;
    private int cantidad;
    private int categoria;

    //constructores con todos los parametros
    public Bien(int tipo, int cantidad, int categoria) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    //getters
    public int obtenerTipo() {
        return tipo;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public int obtenerCategoria() {
        return categoria;
    }
    
    //calcular volumen: depende del tipo de bien
    //se utilizaria para saber el tipo de vehiculo necesario
    //para transportar los bienes
    // no se usa en el main pero se deja por si se necesita
    public double calcularVolumen() {
        if (tipo == TIPO_MOBILIARIO)// mobiliario ocupa medio metro cubico por unidad
            return cantidad * 0.5; 
        if (tipo == TIPO_ALIMENTO)
            return cantidad * 0.1; // alimentos ocupan 0.1 metro cubico por unidad
        return cantidad * 0.05; // ropa e higiene ocupan 0.05 metro cubico por unidad
    }
  
    //metodos de ayuda para el toString
    private String describirTipo() {
        switch (tipo) {
            case TIPO_ALIMENTO:
                return "ALIMENTO";
            case TIPO_ROPA:
                return "ROPA";
            case TIPO_MOBILIARIO:
                return "MOBILIARIO";
            case TIPO_HIGIENE:
                return "HIGIENE";
            default:
                return "OTRO";
        }
    }
  
    private String describirCategoria() {
        switch (categoria) {
            case CATEGORIA_BAJA:
                return "BAJA";
            case CATEGORIA_MEDIA:
                return "MEDIA";
            case CATEGORIA_ALTA:
                return "ALTA";
            default:
                return "";
        }
    }

    @Override
        public String toString() {
            return cantidad + " x " + describirTipo() +
                    " [" + describirCategoria() + "]";
        }
}
