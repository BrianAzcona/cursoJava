package orientadaObjetos;

public class perro {
    String nombre;
    String raza;
    int edad;

    //ESTRUCTURA basica para crear un nuevo método
    void comer() {
        System.out.println("El perro se encuentra comiendo");

    }
    void dormir() {
        System.out.println("El perro se encuentra dormido");

    }
    void ladrar() {
        System.out.println("El perro se encuentra ladrando");

    }

    //Parámetros
    //Ocupando this para hacer al códogo más legible
    void establecerAtributos(String nombre, String raza, int edad) {
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
    }

    

}
