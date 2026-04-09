import java.util.*;

public class RefugioAnimales {
    public static void main(String[] args) {
        // se llama la utilidad scanner
        Scanner scan = new Scanner(System.in);
        // aquí declaramos e iniciamos variables
        boolean activo = true;
        List<String> animales = new ArrayList<>();
        Map<String, String> estadoAnimal = new HashMap<>();
        Set<String> especies = new HashSet<>();
        Map<String, String> animalEspecie = new HashMap<>();
        String[] estados = { "Disponible", "Adoptado" };

        do {
            mostrarMenu();
            System.out.print("Ingrese una opcion: ");

            if (!scan.hasNextInt()) {
                System.out.println("Debe ingresar un número");
                scan.nextLine();
                continue;
            }

            opcion = scan.nextInt();
            scan.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1 -> registrarAnimal(scan);

                case 2 -> registrarEspecie(scan);

                case 3 -> marcarAdoptado(scan);

                case 4 -> mostrarDisponibles();

                case 5 -> mostrarAdoptados();

                case 6 -> mostrarReporte();

                case 7 -> activo = false;

                default -> System.out.println("Opcion no valida");
            }

        } while (activo);

        scan.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n=== REFUGIO DE ANIMALES ===");
        System.out.println("1. Registrar animal");
        System.out.println("2. Registrar especie");
        System.out.println("3. Marcar animal como adoptado");
        System.out.println("4. Mostrar animales disponibles");
        System.out.println("5. Mostrar animales adoptados");
        System.out.println("6. Mostrar reporte general");
        System.out.println("7. Salir");
    }
}