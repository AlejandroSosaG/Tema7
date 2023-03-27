package ejercicios1.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora(23,58,59);
        int cant;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de segundos que desea incrementar");
        cant = sc.nextInt();
        hora.incrementarSegundo(cant);
        System.out.println("Hora: " + hora.hora + ", minutos: " + hora.minuto + ", segundos: " + hora.segundo);
    }
}
