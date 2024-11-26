package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private Book[] libros;

    public Biblioteca(String nombre, Book[] libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Book[] getLibros() {
        return libros;
    }

    public void setLibros(Book[] libros) {
        this.libros = libros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Objects.deepEquals(libros, that.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Arrays.hashCode(libros));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + Arrays.toString(libros) +
                '}';
    }
}
