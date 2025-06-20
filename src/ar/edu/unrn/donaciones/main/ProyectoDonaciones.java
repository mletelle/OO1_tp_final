package ar.edu.unrn.donaciones.main;

import java.util.ArrayList;
import java.util.Date;

import ar.edu.unrn.donaciones.modelo.*;
import ar.edu.unrn.donaciones.servicio.Organizacion;

public class ProyectoDonaciones {

    public static void main(String[] args) {

        // organizacion y voluntarios
        // creo la ong Fundacion RN
        Organizacion ong = new Organizacion("Fundacion RN");
        Ubicacion base = new Ubicacion("1 Junta 100", "Centro", "Barrio Don Bosco", -40.8, -63.0); 
        Ubicacion casa = new Ubicacion("Rivadavia 420", "Norte", "Costanera Norte", -40.9, -63.1);
        // tres colaboradores con su info y ubi
        // no es seguro hacer downcasting en este caso
        Colaborador juan = new Colaborador("Juan", "Perez", 9876543, base);
        Colaborador rodrigo = new Colaborador("Rodrigo", "Gonzalez", 1357924, base);
        Colaborador maria = new Colaborador("Maria", "Sosa", 2468101, base);
        // agrego los colaboradores a la ong
        ong.agregarVoluntario(juan);
        ong.agregarVoluntario(rodrigo);
        ong.agregarVoluntario(maria);

        // donante para los pedidos
        Donante ana = new Donante("Ana", "Lopez", 12345678, casa);

        // lote de bienes
        ArrayList<Bien> lote = new ArrayList<>();
        lote.add(new Bien("ropa", 3, "media"));

        // varios pedidos de donacion
        ArrayList<PedidosDonacion> pedidos = new ArrayList<>();
        pedidos.add(ana.crearPedido(new Date(), lote,"auto","Pedido 1"));

        pedidos.add(ana.crearPedido(new Date(), lote,"camioneta","Pedido 2"));
        pedidos.add(ana.crearPedido(new Date(), lote,"camion", "Pedido 3"));
        // paso cada solicitud
        ArrayList<OrdenRetiro> ordenes = new ArrayList<>();
        for (PedidosDonacion p : pedidos) {
            ordenes.add(ong.gestionarSolRet(p));
        }
        // simular asignaciones
        OrdenRetiro o1 = ordenes.get(0); // Juan (pendiente)
        OrdenRetiro o2 = ordenes.get(1); // Juan nuevamente
        OrdenRetiro o3 = ordenes.get(2); // Rodrigo
        // paso orden 2 a estado en ejecucion
        o2.comenzar();
        ArrayList<Bien> bVisita = new ArrayList<>();
        bVisita.add(new Bien("ropa", 1, "baja"));

        o2.agregarVisita(new Visita(fecha(2025, 3, 20, 8, 30),
                "No se encontraba en el domicilio", bVisita));
        
        o2.agregarVisita(new Visita(fecha(2025, 3, 25, 9, 0),
                "Se retiraron donaciones pero resta completar el traslado", bVisita));

        // finalizo la orden
        o3.finalizar();
        o3.agregarVisita(new Visita(fecha(2025, 3, 15, 22, 0),
                "Se recolectaron todas las donaciones", bVisita));

        // imprimir detalle de las ordenes
        System.out.println("\n DETALLE DE VISITAS \n");
        System.out.println(o1.imprimirDetalle(1));
        System.out.println(o2.imprimirDetalle(2));
        System.out.println(o3.imprimirDetalle(3));

        // cuarto pedido para mostrar a Maria
        PedidosDonacion p4 = ana.crearPedido(new Date(), lote,"auto", "Pedido 4");
        OrdenRetiro o4 = ong.gestionarSolRet(p4); // deberia asignarse a maria
        o4.comenzar();
        o4.agregarVisita(new Visita(new Date(),"Visita extra de prueba", bVisita));
        System.out.println(o4.imprimirDetalle(4));

    }

    // Helper de fecha
    private static Date fecha(int anio, int mes, int dia, int hora, int minuto) {
        return new Date(anio - 1900, mes - 1, dia, hora, minuto);// deprecated pero funciona
    }
}
