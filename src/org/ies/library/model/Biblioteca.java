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

    public boolean hasBook (String isbn){
        for (Book book : libros) {
            if (book.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAutor (String nif){
        for (Book book : libros) {
            for (Autor autor : book.getAutores()) {
                if (autor.getNif().equals(nif)){
                    return true;
                }
            }
        }
        return false;
    }

    public int countBooks (String nif){
         int numbooks = 0;
         for (Book book : libros){
             for (Autor autor : book.getAutores()){
                 if (autor.getNif().equals(nif)){
                      numbooks++;
                 }
             }
         }
        return numbooks;
    }

    public int countYearBooks (int year){
        int countyears = 0;
        for (Book book : libros){
            if (book.getYear()==(year)){
                countyears++;
            }
        }
        return countyears;
    }

    public Book findBook (String isbn){
        for ( Book book : libros){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
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
