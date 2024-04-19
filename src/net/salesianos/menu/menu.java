package src.net.salesianos.menu;

public class Menu {
    public void mostrarMenu() {
        String menu = """
                Menú de publicaciones:
                1. Añadir restaurante
                2. Editar restaurante
                3. Mostrar restaurantes
                4. Eliminar restaurante
                Q. Salir del programa
                """;
        System.out.println(menu);
    }
}
