package ejercicios.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punto punto = new Punto(2,3);
        int opc;
        int x = 0,y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea hacer");
        System.out.println("1. Imprimir");
        System.out.println("2. Modificar x e y");
        System.out.println("3. Desplazar");
        System.out.println("4. Calcular distancia");
        opc = sc.nextInt();
        if (opc>=2 && opc<=4){
            System.out.println("Introduzca una coordenada X");
            x = sc.nextInt();
            System.out.println("Introduzca una coordenada Y");
            y = sc.nextInt();
        }
        switch (opc){
            case 1:
                punto.imprime();
                break;
            case 2:
                punto.setXY(x,y);
                break;
            case 3:
                punto.desplaza(x,y);
                break;
            case 4:
                Punto p = new Punto(x,y);
                System.out.println(punto.distancia(p));;
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
