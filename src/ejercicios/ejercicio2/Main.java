package ejercicios.ejercicio2;

import ejercicios.ejercicio1.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro =new Libro();
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea hacer");
        System.out.println("1. Hacer un préstamo");
        System.out.println("2. Devolver un libro");
        opc = sc.nextInt();
        switch (opc){
            case 1:
                libro.prestamo();
                break;
            case 2:
                libro.devolucion();
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
