package org.iesps.utils;

public class AppUtils {

    // Lógica matemática simple
    public static double calcularPrecio(int dias) {
        return dias * 3.0; // 3 euros por día
    }

    public static String formatText(String texto) {
        return (texto == null) ? "" : texto.trim().toUpperCase();
    }
}
