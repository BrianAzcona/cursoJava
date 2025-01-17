package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    /*un contructor permite crear objetos con diferentes
     valores desde el momento de la creacion del objeto,
     pueden estar por defecto o parametrizado.
     Los constructores tienen el mismo nombre que nuestra clase.
     Si no se crea un constructor, el compilador creará
     de forma automatica uno por defecto.*/
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    //Constructor con args
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor con argumentos");
    }

    //Metodo
    public void sumar(){
        int resultado = this.a + this.b;
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
