import java.util.Scanner;

public class MayorDeEdad {
public static void main(String[] args) {
    String nombre;
    int edad;
    final int MAYORIA_DE_EDAD =18;
    Scanner sc = new Scanner(System.in);

    System.out.println("Como te llamas? ");
    nombre= sc.nextLine();

    System.out.println(" Cuantos años tienes? ");
    edad = sc.nextInt();

    boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD;

    System.out.println("Hola " + nombre);
    System.out.println("Eres mayor de Edad?" + mayorDeEdad);
    
}
}
