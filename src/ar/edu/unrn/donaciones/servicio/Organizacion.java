package ar.edu.unrn.donaciones.servicio;

import java.util.ArrayList;

import ar.edu.unrn.donaciones.modelo.Colaborador;
import ar.edu.unrn.donaciones.modelo.OrdenRetiro;
import ar.edu.unrn.donaciones.modelo.PedidosDonacion;

public class Organizacion {

    private String nombre;
    private ArrayList<Colaborador> voluntarios;

    public Organizacion(String nombre) {
        this.nombre = nombre;
        this.voluntarios = new ArrayList<Colaborador>();
    }

    public void agregarVoluntario(Colaborador c) {
        if (!voluntarios.contains(c)) {//evitar duplicados
            voluntarios.add(c);
        }
    }

    public OrdenRetiro gestionarSolRet(PedidosDonacion pedido) {
        // crear la orden
        OrdenRetiro orden = new OrdenRetiro(
                pedido,
                pedido.obtenerDonante().obtenerUbicacion());

        // intentar asignarla a cada voluntario
        for (Colaborador c : voluntarios) {
            if (c.aceptarOrden(orden)) {
                // notificar al donante
                pedido.obtenerDonante().notificar("Se genero " + orden);
                return orden;
            }
        }

        System.out.println("No hay voluntarios disponibles");
        return null;
    }

    @Override
    public String toString() {
        return "Organizacion " + nombre + " con " + voluntarios.size() + " voluntarios";
    }
}
