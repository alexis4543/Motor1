//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Motor m1 = new Motor();
    Motor m2 = new Motor();
    Motor m3 = new Motor();

    m1.nombre="Motor v8";
    m1.potencia=450;
    m1.velocidad=300;
    m1.encendido = false;

    m2.nombre="Motor electrico";
    m2.potencia=3150;
    m2.velocidad=400;
    m2.encendido = true;


    m3.nombre="Motor diesel";
    m3.potencia=250;
    m3.velocidad=200;
    m3.encendido = true;


    System.out.println("----DATOS MOTOR 1----");
    m1.mostrarInformacion();
    System.out.println();
    m1.encender();
    m1.mostrarEstado();
    System.out.println();
    m1.apagar();
    m1.mostrarEstado();
    System.out.println();

    System.out.println("----DATOS MOTOR 2----");
    m2.mostrarInformacion();
    System.out.println();

    System.out.println("----DATOS MOTOR 3----");
    m3.mostrarInformacion();
    System.out.println();





}
