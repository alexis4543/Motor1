public class Motor {
    //Atributos
    public String nombre;
    public double potencia;

    //Acceso por defecto

    double velocidad;
    boolean encendido;

    //metodos
    public void mostrarInformacion(){
        System.out.println("El nombre del motor es: "+nombre);
        System.out.println("La potencia del motor es: "+potencia);
        System.out.println("La velocidad es: "+velocidad);
        System.out.println("El estado del motor es: " + (encendido ? "encendido" : "apagado"));
    }
    public void encender(){
        encendido = true;
        System.out.println("---Encendiendo Motor---");
        //System.out.println("El Motor " +nombre+ " se ha encendido correctamente");
    }

    void apagar(){
        encendido = false;
        System.out.println("---Apagando motor---");
        //System.out.println("El motor " +nombre+ " se ha apagado correctamente");
    }
    void mostrarEstado(){
        System.out.println("El estado del motor es : " + (encendido ? "encendido" : "apagado"));
    }
}
