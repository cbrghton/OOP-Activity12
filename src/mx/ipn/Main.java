package mx.ipn;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String flag = "S";
        Scanner scanner = new Scanner(System.in);

        while(flag.equals("S") || flag.equals("s")) {
            System.out.println("Bienvenido a la actividad 12");

            Vectores vectores = new Vectores();

            System.out.println("Lista de animales:");
            Map<String, Integer> data = vectores.vectorInformation();
            for (int i = 0; i < data.get("Size"); i++) {
                System.out.println("Posición " + (i+1) + ": " + vectores.getVector().elementAt(i));
            }
            System.out.println("Tamaño del Vector: " + data.get("Size") + "\n" +
                    "Capacidad del Vector: " + data.get("Capacity"));

            vectores.deleteElement(3);
            vectores.deleteElement(7);

            System.out.println("Lista de animales:");
            data = vectores.vectorInformation();
            for (int i = 0; i < data.get("Size"); i++) {
                System.out.println("Posición " + (i+1) + ": " + vectores.getVector().elementAt(i));
            }
            System.out.println("Tamaño del Vector: " + data.get("Size") + "\n" +
                    "Capacidad del Vector: " + data.get("Capacity"));

            System.out.println("¿Desea repetir? S/N");
            flag = scanner.nextLine();
        }
	}
}
