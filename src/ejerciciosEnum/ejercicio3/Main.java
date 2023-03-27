package ejerciciosEnum.ejercicio3;

import ejercicios.ejercicio4.Articulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicios.ejercicio4.Articulo articulo = new Articulo("PC", 800, 10, 5);
        ejercicios.ejercicio4.Articulo articulo1 = new Articulo("Coca", 3, 10, 10);
        int opc;
        int cant = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Que desea hacer");
        System.out.println("1. Imprimir");
        System.out.println("2. Obtener precio de venta al público con iva incluido");
        System.out.println("3. Obtener precio de venta al público con descuento");
        System.out.println("4. Vender");
        System.out.println("5. Almacenar");
        opc = sc.nextInt();
        if (opc == 4 || opc == 5){
            System.out.println("Introduzca la cantidad de articulos");
            cant = sc.nextInt();
        }
        switch (opc){
            case 1:
                articulo.imprimir();
                break;
            case 2:
                articulo.getPVP();
                break;
            case 3:
                int desc;
                System.out.println("Introduzca el porcentaje de descuento");
                desc = sc.nextInt();
                articulo.getPVPDescuento(desc);
                break;
            case 4:
                articulo.vender(cant);
                break;
            case 5:
                articulo.almacenar(cant);
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
