package ejercicios1.ejercicio4;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Disco[] discos = new Disco[10];
        menu(discos);
    }
    public static void menu(Disco[] array){
        int opc;
        int cont = 1;
        do {
            System.out.println("COLECCIÓN DE DISCOS\n" +
                    "===================\n" +
                    "1. Listado.\n" +
                    "2. Nuevo Disco.\n" +
                    "3. Modificar.\n" +
                    "4. Borrar.\n" +
                    "5. Salir.");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    listado(array);
                    break;
                case 2:
                    nuevoDisco(array, cont);
                    break;
                case 3:
                    modificar(array);
                    break;
                case 4:
                    borrar(array, cont);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opc!=5);
    }
    public static void listado(Disco[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo != "LIBRE"){
                array[i].toString();
            }else
                System.out.println();
        }
    }
    public static void nuevoDisco(Disco[] array, int cont){
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo == "LIBRE"){
                array[i].codigo = String.valueOf(cont);
                cont++;
                System.out.println("Introduzca los datos del nuevo disco");
                array[i].autor = sc.nextLine();
                array[i].titulo = sc.nextLine();
                array[i].genero = sc.nextLine();
                array[i].duracion = sc.nextInt();
            }else
                System.out.println("No hay ningún disco libre");
        }
    }
    public static void modificar(Disco[] array){
        String codigo;
        System.out.println("Introduzca el codigo del disco que desea modificar");
        codigo = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo.equals(codigo)){
                System.out.println("Introduzca los nuevos datos del disco");
                array[i].autor = sc.nextLine();
                array[i].titulo = sc.nextLine();
                array[i].genero = sc.nextLine();
                array[i].duracion = sc.nextInt();
            }else
                System.out.println("No hay ningún disco con ese código");
        }
    }
    public static void borrar(Disco[] array, int cont){
        String codigo;
        System.out.println("Introduzca el codigo del disco que desea borrar");
        codigo = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].codigo.equals(codigo)){
                array[i].codigo = "LBRE";
                cont--;
            }else
                System.out.println("No hay ningún disco con ese código");
        }
    }
}
