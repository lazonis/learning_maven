package org.iesps.service;
import org.iesps.api.Pelicula;
import org.iesps.service.*;
import org.iesps.utils.*;
import org.iesps.domain.*;

public class AppService {
    private AppValidator validador = new AppValidator();

    public Pelicula alquilarPelicula(String tituloSucio, int dias) {

        // 1. Usamos Dependencia Utils para formatear
        String formatTitle = AppUtils.formatText(tituloSucio);

        // 2. Usamos Dependencia Domain para validar
        if (!validador.hayStock(formatTitle)) {
            System.out.println("Error: No hay stock o título inválido.");
            return null;
        }

        // 3. Usamos Utils para calcular
        double precio = AppUtils.calcularPrecio(dias);

        // 4. Creamos y devolvemos el objeto de la API
        return new Pelicula(formatTitle, precio);
    }
}

