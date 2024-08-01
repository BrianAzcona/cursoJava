package orientadaObjetos;

public class ejeUsuario {
    public static void main(String[] args) {
        //Modificafores de acceso

        Usuario codi = new Usuario();
        codi.username = "Codi";
        codi.password = "pass";

        System.out.println(codi.username);
        System.out.println(codi.password);

        codi.saluda();
    }
}
