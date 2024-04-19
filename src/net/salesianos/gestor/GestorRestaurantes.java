package src.net.salesianos.gestor;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import src.net.salesianos.restaurantes.*;

public class GestorRestaurantes {
    private static ArrayList<Restaurante> listaRestaurante;

    public GestorRestaurantes() {
        listaRestaurante = new ArrayList<>();
    }

    public static void aniadirRestaurante(Restaurante nuevoRestaurante) {
        listaRestaurante.add(nuevoRestaurante);
    }

    public static void eliminarRestaurante(int indiceEmpleado) {
        listaRestaurante.remove(indiceEmpleado);
    }

    public static void mostrarRestaurante() {
        for (int i = 0; i < listaRestaurante.size(); i++) {
            if (listaRestaurante.get(i) != null) {
                System.out.println(listaRestaurante.get(i).toString());
            }
        }
    }

    public static void editarRestaurante(int indice, String nombre, String localizacion, String horario,
            float puntuacion) {
        if (indice >= 0 && indice < listaRestaurante.size()) {
            Restaurante restaurante = listaRestaurante.get(indice);
            restaurante.setNombre(nombre);
            restaurante.setLocalizacion(localizacion);
            restaurante.setHorario(horario);
            restaurante.setPuntuacion(puntuacion);
            JOptionPane.showMessageDialog(null, "Restaurante editado correctamente.", "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Índice de restaurante inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
