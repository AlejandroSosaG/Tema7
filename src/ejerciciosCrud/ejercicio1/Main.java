package ejerciciosCrud.ejercicio1;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        sc.close();
    }
    public static void menu(){
        Alumno[] grupo = new Alumno[30];
        int opc;
        System.out.println("ALUMNOS/AS\n" +
                "===================\n" +
                "1. Listado.\n" +
                "2. Nuevo Alumno.\n" +
                "3. Modificar.\n" +
                "4. Borrar.\n" +
                "5. Salir.");
        opc = sc.nextInt();
        switch (opc){
            case 1:
                listado(grupo);
                break;
            case 2:
                nuevoAlumno(grupo);
                break;
            case 3:
                modificar(grupo);
                break;
            case 4:
                borrar(grupo);
                break;
            case 5:
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
    public static void listado(Alumno[] grupo){
        for (int i = 0; i < grupo.length; i++) {
            if (!grupo[i].nombre.equals(null)){
                System.out.println(grupo[i].toString());
            }
        }
    }
    public static void nuevoAlumno(Alumno[] grupo){
        String nombre;
        double notaMedia;
        for (int i = 0; i < grupo.length; i++) {
            if (!grupo[i].nombre.equals(null)){
                System.out.println("Introduzca el nombre del nuevo alumno");
                nombre = sc.next();
                System.out.println("Introduzca su nota media");
                notaMedia = sc.nextDouble();
                grupo[i].nombre = nombre;
                grupo[i].notaMedia = notaMedia;
            }
        }
    }
    public static void modificar(Alumno[] grupo){
        String nombre;
        double notaMedia;
        System.out.println("Introduzca el nombre del alumno que desea modificar");
        nombre = sc.next();
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i].getNombre().equals(nombre)){
                System.out.println("Introduzca la nueva nota media");
                notaMedia = sc.nextDouble();
                grupo[i].setNotaMedia(notaMedia);
            }
        }
    }
    public static void borrar(Alumno[] grupo){
        String nombre;
        System.out.println("Introduzca el nombre del alumno que desea borrar");
        nombre = sc.next();
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i].getNombre().equals(nombre)){
                grupo[i].nombre = null;
                grupo[i].notaMedia = Double.parseDouble(null);
            }
        }
    }
}
