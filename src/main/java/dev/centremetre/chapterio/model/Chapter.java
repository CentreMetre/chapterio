package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

/**
 * Represents a chapter of a book.
 *
 * A chapter is made up of an ID, the book the chapter is part of, a title for the chapter,
 * the index of the order the chapter comes in, and its display number.
 *
 * The use for display number and order index is for books with decimal chapters, such as in manga.
 * Order index is the absolute order, and display number is the number shown. E.g. <br>
 * | orderIndex | displayNumber | <br>
 * | 1          | 1             | <br>
 * | 2          | 1.5           | <br>
 * | 3          | 2             |
 *
 * 'Special' case for manga: the display will be the total, and the index will be of just that volume (book).
 */
@Entity
@Table(name = "chapters")
public class Chapter
{
    // Chapters could just be auto incrementing when it has the same book id.

    @Id
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    private String title;

    @Column(nullable = false)
    private int orderIndex;

    @Column(nullable = false)
    private String displayNumber;

    /*
    GETTERS AND SETTERS
    */


}
