package ejerciciosEnum.ejercicio4;

enum Genero{Rock, Pop, Electronica, Reggaeton}

public class Disco {
    String codigo;
    String autor;
    String titulo;
    Genero genero;
    int duracion;
    public Disco(){
        this.codigo = "LIBRE";
    }
    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = Genero.valueOf(genero);
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = Genero.valueOf(genero);
    }

    @Override
    public String toString() {
        return "Disco{" +
                "codigo='" + codigo + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
