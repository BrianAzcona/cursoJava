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
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b){
        /*this es un operador que apunta al objeto que está en ejecucion, es decir a la
        direccion de memoria del objeto*/
        //Permite acceder a los atibutos o metodos del objeto que se está ejecutando en este momento
        /*El operador this solo se puede utilizar dentro de la clase
        donde se está trabajando*/
        //También permite diferenciar los atributos de la clase de los argumentos
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();

    }
}
