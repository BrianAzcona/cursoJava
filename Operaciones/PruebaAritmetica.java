package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("Resultado usando args: " + resultado);
        
        System.out.println(aritmetica1.a + " " + aritmetica1.b);
    }
}
