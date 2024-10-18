public class PersonaPrivada {
    private String nombre;
    private int edad;
    private double altura;

    public PersonaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
