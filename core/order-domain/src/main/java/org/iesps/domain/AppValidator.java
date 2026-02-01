package org.iesps.domain;

public class AppValidator {

    public boolean hayStock(String titulo) {
        // Simulamos que SIEMPRE hay stock, excepto si el título está vacío
        return titulo != null && !titulo.isEmpty();
    }
}
