package orientadaObjetos;

public class instanciar {
    public static void main(String[] args) {
    
        perro pericles = new perro();//Instancia:objeto creado

        //Asignar valores individualmente a los métodos
        pericles.nombre = "pericles";
        pericles.raza = "pastor";
        pericles.edad = 4;
        
        //Parámetros
        pericles.establecerAtributos("pericles", "pastor", 4);//Argumentos
        
        System.out.println("El nombre es:" + pericles.nombre);
        System.out.println("El raza es:" + pericles.raza);
        System.out.println("El edad es:" + pericles.edad);
        
        //MÉTODOS
        pericles.comer();
        pericles.dormir();
        pericles.ladrar();




       

       
    }
}
