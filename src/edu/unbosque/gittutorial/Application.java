package edu.unbosque.gittutorial;
import java.util.Scanner;

public class Application {

    public static void main (String[] args){
        
        Student Student = new Student(null);
        
        System.out.println("Bienvenido estudiante");
        System.out.println("Ingrese el nombre del estudiante");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Student.setName(name);
    }
}
