
    public class main {
        public static void main(String[] args) {

            PersonaPrivada personaPrivada = new PersonaPrivada("pepito", 25, 1.70);
            personaPrivada.mostrarDatos();
            System.out.println("Es mayor de edad " + personaPrivada.esMayorDeEdad());


            PersonaPublica personaPublica = new PersonaPublica("Calle Falsa 123", "123456789", "correo@example.com");
            System.out.println("Dirección: " + personaPublica.direccion);
            System.out.println("Teléfono: " + personaPublica.telefono);
            System.out.println("Email: " + personaPublica.email);


            personaPublica.probarMetodosPrivados();
        }
    }



