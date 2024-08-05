package proyectoCaja;

public class EjecutarCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        Caja caja2 = new Caja(2, 4, 5);

        caja1.ancho = 2;
        caja1.alto = 3;
        caja1.profundo = 4;
        System.out.println("El volumen es: " + caja1.calcularVolumen());
        System.out.println("-----------------------------------------------");
        System.out.println("El volumen es: " + caja2.calcularVolumen());
    }
}
