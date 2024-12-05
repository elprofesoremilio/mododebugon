package Gasolinera.v1;

import java.util.Scanner;

public class Gasolinera {
    public static float PRECIO_LITRO = 1.5f;

    public static void main(String[] args) {
        Surtidor surtidor = new Surtidor(Gasolinera.PRECIO_LITRO);
        Coche coche = new Coche(50, 25);
        Scanner scanner = new Scanner(System.in);

        String opciones = "---- OPCIONES DISPONIBLES ----\n" +
                "1. Llenar depósito\n" +
                "2. Indicar litros\n" +
                "3. Indicar importe";

        System.out.println(opciones);
        int eleccion = scanner.nextInt();
        int litrosLlenados = 0;

        switch (eleccion) {
            case 1:
                litrosLlenados = surtidor.llenarDeposito(coche);
                break;
            case 2:
                System.out.println("Introduzca litros a surtir: ");
                int litros = scanner.nextInt();
                litrosLlenados = surtidor.surtirCombustible(litros, coche);
                break;
            case 3:
                System.out.println("Introduzca el importe: ");
                float importe = scanner.nextFloat();
                litrosLlenados = surtidor.surtirCombustible(importe, coche);
                break;
        }

        System.out.println("Litros surtidos: " + litrosLlenados);
        System.out.println("Importe a pagar: " + Gasolinera.PRECIO_LITRO * litrosLlenados);
    }
}
