package ejercicios.ejercicio1;

public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente() {

    }

    public void sacarDinero(double cant){
        if (saldo-cant>0){
            this.saldo-=cant;
        }else
            System.out.println("No se ha podido realizar la operación");
    }
    public void ingresarDinero(double cant){
        this.saldo+=cant;
    }
    public void mostrarInformacion(){
        System.out.println("DNI del titular de la cuenta: " + this.dni);
        System.out.println("Nombre del titular de la cuenta: " + this.nombre);
        System.out.println("Saldo de la cuenta: " + this.saldo);
    }
}
