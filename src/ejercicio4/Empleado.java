/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;


/**
 *
 * @author labesp
 */
public class Empleado {
    //Atributos
    String nombre;
    double salarioBase;
    int horasExtras;
    //Constructores
    public Empleado(String nombre, double salarioBase, int horasExtras) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }
    //Métodos
    public void calcularSalarioTotal() {
        double total = salarioBase + (horasExtras * 10.0);
        System.out.println("Salario total calculado: $" + total);
    }
    public void mostrarDatos() {
        System.out.println("=== DATOS DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        calcularSalarioTotal();
    }
}