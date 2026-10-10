//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Motor m1 = new Motor();
    Motor m2 = new Motor();
    Motor m3 = new Motor();

    m1.setNombre("Motor v8");
    m1.setPotencia(450);
    m1.setVelocidad(300);
    m1.setEncendido(false);

    m2.setNombre("Motor electrico");
    m2.setPotencia(3150);
    m2.setVelocidad(400);
    m2.setEncendido(false);


    m3.setNombre("Motor diesel");
    m3.setPotencia(250);
    m3.setVelocidad(200);
    m3.setEncendido(true);


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
