package ejercicios1.ejercicio2;

public class Contador {
    int cont;
    public Contador(){
    }

    public Contador(int cont) {
        if (cont>=0){
            this.cont = cont;
        }else
            this.cont = 0;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    public void incrementar(){
        cont++;
    }
    public void decrementar(){
        if (cont-1 >= 0){
            cont--;
        }
    }
}
