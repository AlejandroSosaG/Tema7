package ejercicios.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cant = 0;
        int opc;
        CuentaCorriente cuenta = new CuentaCorriente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea hacer");
        System.out.println("1. Sacar dinero");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Mostrar informacion");
        opc = sc.nextInt();
        if (opc==1 || opc==2){
            System.out.println("Introduzca la cantidad");
            cant = sc.nextInt();
        }
        switch (opc){
            case 1:
                cuenta.sacarDinero(cant);
                break;
            case 2:
                cuenta.ingresarDinero(cant);
                break;
            case 3:
                cuenta.mostrarInformacion();
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
