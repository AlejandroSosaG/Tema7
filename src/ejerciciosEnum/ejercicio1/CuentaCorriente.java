package ejerciciosEnum.ejercicio1;
enum Sexo{Femenino, Masculino}
public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    Sexo sexo;
    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }
    public CuentaCorriente(String dni, String nombre, double saldo, String sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.sexo = Sexo.valueOf(String.valueOf(sexo));
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
        System.out.println("Sexo del titular de la cuenta: " + this.sexo);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", sexo=" + sexo +
                '}';
    }
}
