package org.ies.library.components;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class LibraryReader {

    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Biblioteca read(){
        System.out.println("Introduce los datos de la biblioteca");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuantos libros hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Book[] libros = new Book[size];
        for (int  i = 0; i < libros.length; i++) {
            libros[i] = bookReader.read();
        }


        return new Biblioteca(
                nombre,
                libros

        );
    }
}

