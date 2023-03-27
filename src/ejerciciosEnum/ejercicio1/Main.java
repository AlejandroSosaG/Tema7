package ejerciciosEnum.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dni,nombre, sexo;
        int saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Titular 1");
        System.out.println("Dni:");
        dni = sc.next();
        System.out.println("Nombre:");
        nombre = sc.next();
        System.out.println("Saldo:");
        saldo = sc.nextInt();
        System.out.println("Sexo:");
        sexo = sc.next();
        CuentaCorriente cuentaCorriente = new CuentaCorriente(dni, nombre, saldo, sexo);
        System.out.println("Titular 2:");
        dni = sc.next();
        nombre = sc.next();
        saldo = sc.nextInt();
        sexo = sc.next();
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(dni, nombre, saldo, sexo);
        cuentaCorriente.ingresarDinero(100);
        cuentaCorriente1.sacarDinero(50);
        cuentaCorriente.mostrarInformacion();
        System.out.println(cuentaCorriente1.toString());
    }
}
