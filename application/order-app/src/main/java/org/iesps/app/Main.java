package org.iesps.app;

import org.iesps.domain.AppValidator;
import org.iesps.utils.AppUtils;
import org.iesps.api.Pelicula;
import org.iesps.service.AppService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando aplicación de pedidos...\n");

        AppService servicio = new AppService();

        // Simulamos un pedido accediendo a service -> que llama a utils para formatear el nombre
        // -> y a domain para validar el stock
        Pelicula resultado = servicio.alquilarPelicula(" pulp fiction ", 3);

        if (resultado != null) {
            System.out.println("Retirando película:");
            System.out.println(resultado.getTitulo()+ " - " + resultado.getPrecio() + "€");
        }
    }
}
