package dev.centremetre.chapterio.service;

import dev.centremetre.chapterio.model.Book;

import java.util.List;

public interface BookService
{
    /*
    WRITE/CREATE
    */



    /*
    READ
    */

    /**
     * Retrieve a book with a specific ID.
     *
     * @param bookId The ID of the book to retrieve.
     * @return A {@link Book} object with the supplied ID.
     */
    Book retrieveBookById(int bookId);

    Book retrieveBookByIsbn(String isbn);

    List<Book> retrieveAllBooks();

    /**
     * Uses levenshtein distance to approximate what the user is searching for.
     * Levenshtein search will be done on the DB layer with SQL.
     *
     * @param searchTerm The search value to look for in the DB.
     * @param distance   The levenshtein distance to use when searching.
     * @return A list of books that are within the search term and levenshtein distance.
     */
    List<Book> searchBookByNameLevenshteinDistance(String searchTerm, int distance);
}
