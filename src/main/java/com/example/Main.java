package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
                Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Luis", 17, 9.2);
        // 2. Mostrar la información de ambos estudiantes
        System.out.println("Información del Estudiante 1:");
        estudiante1.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Estudiante 2:");
        estudiante2.mostrarInformacion();
        System.out.println();

        // 3. Modificar algún atributo usando un setter
                estudiante1.setPromedio(9.0);

        // 4. Mostrar la información actualizada
        System.out.println("Información actualizada del Estudiante 1:");
        estudiante1.mostrarInformacion();
                System.out.println("\n---------------------------\n");

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
                Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 50000);

        // 2. Crear un libro usando el constructor con solo titulo y autor
                Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        // 3. Mostrar información de ambos libros
        System.out.println("Información del Libro 1:");
         libro1.mostrarInformacion();
        System.out.println();
         System.out.println("Información del Libro 2:");
        libro2.mostrarInformacion();
        System.out.println();


        // 4. Aplicar descuento usando ambas versiones del método
         libro1.aplicarDescuento(10);
        libro2.aplicarDescuento(20, 5000);

        // 5. Mostrar información actualizada de los libros
         System.out.println("Información actualizada del Libro 1:");
        libro1.mostrarInformacion();
        System.out.println();

        System.out.println("Información actualizada del Libro 2:");
        libro2.mostrarInformacion();
    }
    }
