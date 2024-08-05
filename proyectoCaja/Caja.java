package proyectoCaja;

public class Caja {
    int ancho, alto, profundo;

    public Caja(){
        System.out.println("Constructor vacio\n");
    }
    public Caja(int pAncho, int pAlto, int pProfundo){
        this.ancho = pAncho;
        this.alto = pAlto;
        this.profundo = pProfundo;
    }

    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }
}
