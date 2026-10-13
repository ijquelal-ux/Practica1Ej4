/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

int op;
        Empleado empleados[] = null;
        System.out.println("Cuantos empleados desea registrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("\n====SISTEMA DE SALARIOS DE EMPLEADOS====");
            System.out.println("1. Ingresar empleados");
            System.out.println("2. Mostrar datos y salario total");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    empleados = new Empleado[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nDatos del empleado Nº" + (i + 1) + ": ");
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Salario base (Sugerido $460): ");
                        double salarioBase = sc.nextDouble();
                        System.out.print("Horas extras: ");
                        int horasExtras = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer

                        empleados[i] = new Empleado(nombre, salarioBase, horasExtras);
                    }
                    break;
                case 2:
                    if (empleados != null) {
                        for (int i = 0; i < n; i++) {
                            System.out.println();
                            empleados[i].mostrarDatos();
                        }
                    } else {
                        System.out.println("Primero debe registrar a los empleados en la opción 1.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 3);
    }   
}
