package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }

    public int sumarConRetorno(){
        return a + b;
    }
}