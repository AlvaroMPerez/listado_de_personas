package ListadoPersonas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListadoPersonas {
    public static void main(String[] args) {
        ArrayList<Personas> listaPersonas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Qué quieres hacer ahora?");
            System.out.println("1. Agregar \n2. Listar \n3. Salir");

            int eleccionUsuario;

            try {
                eleccionUsuario = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: por favor elige un valor válido");
                scanner.nextLine();
                continue;
            }

            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                System.out.println("Error, por favor introduce un número válido");
            } else {
                switch (eleccionUsuario) {
                    case 1:
                        agregarPersona(listaPersonas, scanner);
                        break;
                    case 2:
                        listarPersonas(listaPersonas);
                        break;
                    case 3:
                        System.out.println("Gracias por usar esta aplicación fea");
                        continuar = false;
                        break;
                }
            }
        }
    }

    // Método para agregar persona a la lista
    public static void agregarPersona(ArrayList<Personas> listaPersonas, Scanner scanner) {
        System.out.println("Ingrese la nueva persona");

        int id;
        while (true) {
            try {
                System.out.println("Ingrese ID");
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese ID válido");
                scanner.nextLine();
            }
        }

        String nombre;
        while (true) {
            try {
                System.out.println("Ingrese Nombre");
                nombre = scanner.nextLine();
                if (!nombre.trim().isEmpty()) {
                    break;
                } else {
                    System.out.println("Error: Ingrese un nombre válido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese nombre válido");
                scanner.nextLine();
            }
        }

        System.out.println("Ingrese email");
        String email = scanner.nextLine();

        System.out.println("Ingrese Teléfono");
        String tel = scanner.nextLine();

        Personas nuevaPersona = new Personas(id, nombre, email, tel);
        listaPersonas.add(nuevaPersona);

        System.out.println(nuevaPersona.getNombre() + " fue correctamente agregado.");
    }

    public static void listarPersonas(ArrayList<Personas> listaPersonas) {
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay personas en la lista");
        } else {
            System.out.println("\nListado de personas: ");
            for (Personas persona : listaPersonas) {
                System.out.println("ID: " + persona.getId() + "\nNombre: " + persona.getNombre() + "\nEmail: " + persona.getEmail() + "\nTeléfono: " + persona.getTel());
            }
        }
    }
}