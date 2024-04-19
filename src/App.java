package src;

import javax.swing.JOptionPane;

import src.net.salesianos.gestor.GestorRestaurantes;
import src.net.salesianos.restaurantes.Restaurante;

public class App {
    public static void main(String[] args) {

        boolean cerrar = true;

        String option = "";
        while (cerrar) {
            String menu = """
                    Menú de publicaciones:
                    1. Añadir restaurante
                    2. Editar restaurante
                    3. Mostrar restaurantes
                    4. Eliminar restaurante
                    Q. Salir del programa
                    """;
            option = JOptionPane.showInputDialog(menu);
            switch (option) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Introduzca los datos del nuevo restaurante: ");
                    String localizacion = JOptionPane.showInputDialog("Introduca la localización del restaurante: ");
                    String horario = JOptionPane.showInputDialog("Introduzca el horario del restaurante: ");
                    String puntuacionStr = JOptionPane.showInputDialog("Introduzca la puntuacion del restaurante: ");
                    float puntuacion = Float.parseFloat(puntuacionStr);
                    GestorRestaurantes.aniadirRestaurante(new Restaurante(nombre, localizacion, horario, puntuacion));
                    break;
                case "2":
                    String indiceStr = JOptionPane
                            .showInputDialog("Introduzca el indice del restaurante que desee modificar: ");
                    int indice = Integer.parseInt(indiceStr);

                    String newNombre = JOptionPane.showInputDialog("Introduzca los datos del restaurante: ");
                    String newLocalizacion = JOptionPane.showInputDialog("Introduca la localización del restaurante: ");
                    String newHorario = JOptionPane.showInputDialog("Introduzca el horario del restaurante: ");
                    String newPuntuacionStr = JOptionPane.showInputDialog("Introduzca la puntuacion del restaurante: ");
                    float newPuntuacion = Float.parseFloat(newPuntuacionStr);
                    GestorRestaurantes.editarRestaurante(indice, newNombre, newLocalizacion, newHorario, newPuntuacion);
                    break;
                case "3":
                    GestorRestaurantes.mostrarRestaurantes();
                    break;
                case "4":
                    String indiceStrEliminar = JOptionPane
                            .showInputDialog("Introduzca el indice del restaurante que desee modificar: ");
                    int indiceEli = Integer.parseInt(indiceStrEliminar);
                    GestorRestaurantes.eliminarRestaurante(indiceEli);
                    break;
                case "Q":
                    cerrar = false;
                    break;

                default:
                    break;
            }
        }
    }
}
