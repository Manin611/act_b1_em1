package com.example;

public class Libro {
    // TODO: Declarar atributos privados para titulo, autor y precio
     private String titulo;
    private String autor;
    private double precio;

    // TODO: Crear constructor con todos los atributos (titulo, autor, precio)
     public Libro(String titulo, String autor, double precio) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            this.titulo = "Título inválido";
        }

        if (autor != null && !autor.isBlank()) {
            this.autor = autor;
        } else {
            this.autor = "Autor inválido";
        }

        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    // TODO: Crear constructor con solo titulo y autor (precio = 0.0)
    public Libro(String titulo, String autor) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            this.titulo = "Título inválido";
        }

        if (autor != null && !autor.isBlank()) {
            this.autor = autor;
        } else {
            this.autor = "Autor inválido";
        }

        this.precio = 0.0;
    }

    // TODO: Implementar métodos getter para cada atributo
     public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    // TODO: Implementar métodos setter para cada atributo
    // Nota: Validar que el precio no sea negativo
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        } else {
            this.titulo = "Título inválido";
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isBlank()) {
            this.autor = autor;
        } else {
            this.autor = "Autor inválido";
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    // TODO: Crear método aplicarDescuento que reciba porcentaje
    // Nota: Calcular descuento y actualizar precio
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100);
            this.precio -= descuento;
        }
    }

    // TODO: Crear método aplicarDescuento que reciba porcentaje y monto máximo
    // Nota: Aplicar descuento solo si no excede el monto máximo
    public void aplicarDescuento(double porcentaje, double montoMaximo) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100);
            if (descuento <= montoMaximo) {
                this.precio -= descuento;
            }
        }
    }

    // TODO: Crear método mostrarInformacion que imprima los datos del libro
     public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: $" + this.precio);
    }
}

    

