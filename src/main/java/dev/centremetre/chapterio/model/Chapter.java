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
 */
@Entity
@Table(name = "chapters")
public class Chapter
{
    @Id
    private int id;

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
