package com.example;

public class Estudiante {
    // TODO: Declarar atributos privados para nombre, edad y promedio
    private String nombre;
    private int edad;
    private double promedio;
    // TODO: Crear constructor que reciba nombre, edad y promedio como parámetros
    public Estudiante(String nombre, int edad, double promedio) {
        setNombre(nombre);
        setEdad(edad);
        setPromedio(promedio);
    }

    // TODO: Implementar métodos getter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }
    // TODO: Implementar métodos setter para cada atributo
    // Nota: En el setter de edad, validar que sea mayor o igual a 0
    // Nota: En el setter de promedio, validar que esté entre 0.0 y 10.0
     public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Desconocido";
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            this.promedio = 0.0;
        }
    }

    
    // TODO: Crear método mostrarInformacion que imprima los datos del estudiante
     public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}
    
   

