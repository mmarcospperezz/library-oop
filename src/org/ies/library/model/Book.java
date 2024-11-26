package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String titulo;
    private int year;
    private Autor[] autores;

    public Book(String isbn, String titulo, int year, Autor[] autores) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.year = year;
        this.autores = autores;
    }

    public boolean hasAutor (String nif){
            for (Autor autor : autores) {
                if (autor.getNif().equals(nif)) {
                    return true;
                }
            }
        return false;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(isbn, book.isbn) && Objects.equals(titulo, book.titulo) && Objects.deepEquals(autores, book.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titulo, year, Arrays.hashCode(autores));
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                ", autores=" + Arrays.toString(autores) +
                '}';
    }
}
