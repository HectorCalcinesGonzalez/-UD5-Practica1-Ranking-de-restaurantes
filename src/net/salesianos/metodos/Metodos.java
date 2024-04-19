package src.net.salesianos.metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import src.net.salesianos.restaurantes.*;

public class Metodos {
    private ArrayList<Restaurante> listaRestaurante;

    public Metodos() {
        this.listaRestaurante = new ArrayList<>();
    }

    public void aniadirRestaurante(Restaurante nuevoRestaurante) {
        listaRestaurante.add(nuevoRestaurante);
    }

    public void eliminarRestaurante(int indiceEmpleado) {
        listaRestaurante.remove(indiceEmpleado);
    }

    public void mostrarRestaurante() {
        for (int i = 0; i < listaRestaurante.size(); i++) {
            if (listaRestaurante.get(i) != null) {
                System.out.println(listaRestaurante.get(i).toString());
            }
        }
    }

    public void editarRestaurante(int indice, String nombre, String localizacion, String horario, int puntuacion) {
        if (indice >= 0 && indice < listaRestaurante.size()) {
            Restaurante restaurante = listaRestaurante.get(indice);
            restaurante.setNombre(nombre);
            restaurante.setLocalizacion(localizacion);
            restaurante.setHorario(horario);
            restaurante.setPuntuacion(puntuacion);
            JOptionPane.showMessageDialog(null, "Restaurante editado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Índice de restaurante inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
