public class App {
    /** */
    public static void main(String[] args) throws Exception {
        final int MAYORIA_DE_EDAD= 18;
        /*Mensajes iniciales para el usuario
         * Saludamos al usuario y le decimos lo que vamos a hacer. 
         */
        System.out.println("Hello, World! My name is Falou");
        System.out.print("Vamos a aprender Java. ");
        System.out.println("Comenzamos con los elementos de lenguaje");
        int edad;
        edad = 18;

        double importe =123.56;
        char   letra = 'A';
        boolean mayorDeEdad;

        mayorDeEdad = edad >= MAYORIA_DE_EDAD;


        System.out.print("Tengo " + edad + " años ");   
        System.out.println("y " + importe + "euros");
        System.out.println("La mayoría de edad es a los " + MAYORIA_DE_EDAD); // Variable que alamcena si es mayor de dad o no
        System.out.println("Soy mayor de edad?");
        
    }
    }

