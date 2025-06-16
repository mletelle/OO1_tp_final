package ar.edu.unrn.donaciones.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Visita {
    // estados de la visita 
    public static final int ESTADO_PENDIENTE = 1;
    public static final int ESTADO_REALIZADA = 2;
    public static final int ESTADO_CANCELADA = 3;

    private Date fechaDeVisita;
    private int estado;
    private String observacion;
    private ArrayList<Bien> bienesRetirados;

    // constructor principal con todos los parametros
    public Visita(Date fecha, int estado, String obs, ArrayList<Bien> bienes) {
        this.fechaDeVisita = fecha;
        this.estado = estado;
        this.observacion = obs;
        this.bienesRetirados = bienes;
    }
    // constructor con estado y bienes, sin observacion
    public Visita(Date fecha, int estado, ArrayList<Bien> bienes) {
        this(fecha, estado, "", bienes);
    }
    // 
    @Override
    public String toString() {
        return "Visita [" + fechaDeVisita + ", " + describirEstado() + "]";
    }
    // metodo para describir el estado de la visita
    private String describirEstado() {
        switch (estado) {
            case ESTADO_PENDIENTE:
                return "PENDIENTE";
            case ESTADO_REALIZADA:
                return "REALIZADA";
            case ESTADO_CANCELADA:
                return "CANCELADA";
            default:
                return "";
        }
    }

    // helper formateador de fecha: dia/mes/año hora:minuto
    private static final java.text.SimpleDateFormat F = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");

    // getters
    public String obtenerFechaFormateada() {
        return F.format(fechaDeVisita);
    }

    public String obtenerObservacion() {
        return observacion;
    }

}
