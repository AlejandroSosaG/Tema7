package ejercicios.ejercicio4;

public class Articulo {
    String nombre;
    int precio;
    int iva;
    int quedan;

    public Articulo(String nombre, int precio, int IVA, int quedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = 21;
        this.quedan = quedan;
    }
    public void imprimir(){
        System.out.println("Nombre: " + nombre + ", precio: " + precio + ",IVA: " + iva + ", quedan en almacén: " + quedan);
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
}
