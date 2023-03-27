package ejercicios.ejercicio3;

public class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void imprime(){
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void desplaza(int dx, int dy){
        this.x+=dx;
        this.y+=dy;
    }
    public double distancia(Punto p){
        double distancia = 0;
        distancia = Math.sqrt(Math.pow((p.x-this.x), 2) + Math.pow(p.y-this.y, 2));
        return distancia;
    }
}
