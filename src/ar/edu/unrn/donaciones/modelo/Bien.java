package ar.edu.unrn.donaciones.modelo;

public class Bien {

    // constantes 
	private static final int TIPO_ALIMENTO = 1;
	private static final int TIPO_ROPA = 2;
	private static final int TIPO_MOBILIARIO = 3;
	private static final int TIPO_HIGIENE = 4;

	private static final int CATEGORIA_BAJA = 1;
	private static final int CATEGORIA_MEDIA = 2;
	private static final int CATEGORIA_ALTA = 3;
    
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
    public Bien(String tipo, int cantidad, String cat) {
        this.cantidad = cantidad;
        if (tipo.equalsIgnoreCase("alimento")) {
        	this.tipo = TIPO_ALIMENTO;
        }else if (tipo.equalsIgnoreCase("ropa")) {
        	this.tipo = TIPO_ROPA;
        }else if (tipo.equalsIgnoreCase("mobiliario")) {
        	this.tipo = TIPO_MOBILIARIO;
        }else {
        	this.tipo = TIPO_HIGIENE;
        }
        if (cat.equalsIgnoreCase("baja")) {
        	this.categoria = CATEGORIA_BAJA;
        }else if (cat.equalsIgnoreCase("media")) {
        	this.categoria = CATEGORIA_MEDIA;
        }else {
        	this.categoria = CATEGORIA_ALTA;
        }
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
    private double calcularVolumen() {
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
            return cantidad + " x " + describirTipo() + describirCategoria();
        }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Bien other = (Bien) obj;
		return cantidad == other.cantidad && categoria == other.categoria && tipo == other.tipo;
	}
    
}
