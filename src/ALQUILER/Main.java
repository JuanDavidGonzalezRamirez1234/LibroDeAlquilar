package ALQUILER;
import ALQUILER.Libro;
import ALQUILER.LibroDigital;
import ALQUILER.LibroImpreso;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LibroImpreso libroimpreso1 = new LibroImpreso("100 Años de soledad", "Grabiel Garcia Marquez", 460, 136000);
        LibroImpreso libroImpreso2 = new LibroImpreso("La Brujeria", "Estaben cruz niño", 300, 60000);
        LibroDigital libroDigital1 = new LibroDigital("El mortal inmortal", "Mary W. Shelley",516, 15900 );
        LibroDigital libroDigital2 = new LibroDigital("Fobia", "Leornado Reales", 552,72900 );

        Libro[] librosImpresos = {libroimpreso1, libroImpreso2};
        Libro[] librosDigitales = {libroDigital1, libroDigital2};

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione el tipo de libro:");
        System.out.println("1. Libro Impreso");
        System.out.println("2. Libro Digital");
        int tipoLibro = scanner.nextInt();
        scanner.nextLine();

        if (tipoLibro == 1) {
            System.out.println("Seleccione un libro impreso de la lista:");
            for (int i = 0; i < librosImpresos.length; i++) {
                System.out.println((i + 1) + ". " + librosImpresos[i].toString());
            }

            int seleccion = scanner.nextInt();
            scanner.nextLine();

            if (seleccion < 1 || seleccion > librosImpresos.length) {
                System.out.println("Selección no válida");
            } else {
                Libro libroSeleccionado = librosImpresos[seleccion - 1];
                System.out.println("\nInformación del libro seleccionado:");
                libroSeleccionado.mostrarInfo();
            }
        } else if (tipoLibro == 2) {
            System.out.println("Seleccione un libro digital de la lista:");
            for (int i = 0; i < librosDigitales.length; i++) {
                System.out.println((i + 1) + ". " + librosDigitales[i].toString());
            }

            int seleccion = scanner.nextInt();
            scanner.nextLine();

            if (seleccion < 1 || seleccion > librosDigitales.length) {
                System.out.println("Selección no válida");
            } else {
                Libro libroSeleccionado = librosDigitales[seleccion - 1];
                System.out.println("\nInformación del libro seleccionado:");
                libroSeleccionado.mostrarInfo();
            }
        } else {
            System.out.println("Opción no válida");
        }

        scanner.close();
    }
}