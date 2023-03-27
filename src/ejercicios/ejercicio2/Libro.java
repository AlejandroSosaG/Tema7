package ejercicios.ejercicio2;

public class Libro {
    String titulo, autor;
    int ejemplares, prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public boolean prestamo(){
        boolean disponible = false;
        if (ejemplares>prestados){
            prestados++;
            disponible = true;
        }
        return disponible;
    }
    public boolean devolucion(){
        boolean devuelto = false;
        if (prestados>0){
            prestados--;
            devuelto = true;
        }
        return devuelto;
    }
}
