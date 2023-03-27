package ejerciciosEnum.ejercicio2;

enum Genero{Narrativo, Lírico, Dramatico, Didactico, Poetico}

public class Libro {
    String titulo, autor;
    int ejemplares, prestados;
    Genero genero;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.genero = Genero.valueOf(genero);
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
