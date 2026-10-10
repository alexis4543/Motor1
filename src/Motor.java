public class Motor {
    //Atributos
    private String nombre;
    private double potencia;

    //Acceso por defecto

    private double velocidad;
    private boolean encendido;

   //AÑADIMOS METODOS SET

    public void setNombre(String nombre){
        if (null == nombre || nombre.isBlank()){
            System.out.println("El nombre no puede ser nulo ni estar en blanco");
        }else
        {
            this.nombre=nombre;
        }
    }
    public void setPotencia(double potencia){
        this.potencia=potencia;
    }

    public void setVelocidad(double velocidad){
        this.velocidad=velocidad;
    }

    public void setEncendido(boolean encendido){
        this.encendido=encendido;
    }
    //AÑADIMOS METODOS GET
    public String getNombre(){
        return nombre;
    }

    public double getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    //metodos
    public void mostrarInformacion(){
        System.out.println("El nombre del motor es: "+nombre);
        System.out.println("La potencia del motor es: "+potencia);
        System.out.println("La velocidad es: "+velocidad);
        System.out.println("El estado del motor es: " + (encendido ? "encendido" : "apagado"));
    }
    public void encender(){
        this.encendido = true;
        System.out.println("---Encendiendo Motor---");
        //System.out.println("El Motor " +nombre+ " se ha encendido correctamente");
    }

    void apagar(){
        this.encendido = false;
        System.out.println("---Apagando motor---");
        //System.out.println("El motor " +nombre+ " se ha apagado correctamente");
    }
    void mostrarEstado(){
        System.out.println("El estado del motor es : " + (encendido ? "encendido" : "apagado"));
    }
}
