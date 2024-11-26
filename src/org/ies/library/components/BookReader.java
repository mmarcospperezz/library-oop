package org.ies.library.components;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AuthorReader authorReader;

    public BookReader(Scanner scanner, AuthorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read(){
        System.out.println("Introduce los datos del libro");
        System.out.println("ISBN:");
        String isbn = scanner.nextLine();
        System.out.println("Titulo");
        String tittle = scanner.nextLine();
        System.out.println("Año de publicacion:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuantos autores hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Autor[] autores = new Autor[size];
        for (int  i = 0; i < autores.length; i++) {
            autores[i] = authorReader.read();
        }


        return new Book(
                isbn,
                tittle,
                year,
                autores

        );
     }
}
