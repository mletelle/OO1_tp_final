package ar.edu.unrn.donaciones.modelo;

public class Colaborador extends Persona {
    // mantiene la orden en curso o null si no hay ninguna asignada
    private OrdenRetiro ordenActual;

    // constructores
    public Colaborador(String nom, String ape, int dni, Ubicacion ubi) {
        super(nom, ape, dni, ubi);
    }

    // comprueba si el colaborador esta libre
    public boolean disponible() {
        return ordenActual == null || ordenActual.estaCompletada();
    }

    // intenta aceptar la orden si esta disponible
    public boolean aceptarOrden(OrdenRetiro orden) {
        if (!disponible()) {
            return false;// no se puede aceptar la orden
        }
        // orden recibida como la actual
        this.ordenActual = orden;
        // quien recibe la orden es el voluntario
        orden.asignarVoluntario(this);
        // notificar al voluntario
        notificar("Se le asigno " + orden);
        return true;
    }

    // notificacion
    public void notificar(String mensaje) {
        System.out.println(" Voluntario "
                + obtenerNombre() + " " + obtenerApellido()
                + " (DNI " + obtenerDni() + "): "
                + mensaje);
    }

    // solo esta clase puede cambiar la orden actual
    private void asignarOrden(OrdenRetiro o) {
        this.ordenActual = o;
    }
}
