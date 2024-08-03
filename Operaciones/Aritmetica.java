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

    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();

    }
}
