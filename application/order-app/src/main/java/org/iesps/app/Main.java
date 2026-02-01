package org.iesps.app;

import org.iesps.domain.AppValidator;
import org.iesps.utils.AppUtils;
import org.iesps.api.Pelicula;
import org.iesps.service.AppService;

public class Main {
    public static void main(String[] args) {
        // Leemos la propiedad del perfil Maven (dev/prod)
        String test = "SIN_PERFIL";

        System.out.println("Iniciando aplicación de pedidos...\n");

        AppService servicio = new AppService();

        // Simulamos un pedido
        Pelicula resultado = servicio.alquilarPelicula(" pulp fiction ", 3);

        if (resultado != null) {
            System.out.println("Retirando película:");
            System.out.println(resultado.getTitulo()+ " - " + resultado.getPrecio() + "€");
        }
    }
}
