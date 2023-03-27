package ejerciciosEnum.ejercicio3;

enum Departamento{Electronica, Alimentacion, Drogeria}

public class Articulo {
    String nombre;
    int precio;
    int iva;
    int quedan;
    Departamento departamento;

    public Articulo(String nombre, int precio, int IVA, int quedan, Departamento departamento) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = 21;
        this.quedan = quedan;
        this.departamento = departamento;
    }
    public void imprimir(){
        System.out.println("Nombre: " + nombre + ", precio: " + precio + ",IVA: " + iva + ", quedan en almacén: " + quedan + ", departamento: " + departamento);
    }
    public int getPVP(){
        int num = (precio*iva)/100;
        precio += num;
        return precio;
    }
    public int getPVPDescuento(int descuento){
        int desc = (precio*descuento)/100;
        precio += desc;
        return precio;
    }
    public boolean vender(int x){
        boolean vendido = false;
        if (quedan-x>0){
            vendido = true;
            quedan-=x;
        }
        return vendido;
    }
    public void almacenar(int x){
        quedan+=x;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getQuedan() {
        return quedan;
    }

    public void setQuedan(int quedan) {
        this.quedan = quedan;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
