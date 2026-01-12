package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

/**
 * Represents a book.
 *
 * A book has an ID, name/title, optional ISBN identifier,
 * and can optionally belong to a series or a universe, but not both.
 *
 * A book is made up of multiple {@link Chapter}s.
 * A book can be part of a series or a universe, but not both, or could be a part of neither a series nor a universe.
 * e.g. a one-off spin-off book, it can be part of a universe.
 */
@Entity
@Table(name = "books")
public class Book
{
    @Id
    private int id;

    /**
     * The series the book belongs to, if any.
     * A book can be part of a series or a universe, but not both at the same time.
     * If a book is part of a universe but not a series, use {@link #universe} instead, and leave this empty.
     */
    @ManyToOne(optional = true)
    @JoinColumn(name = "series_id", nullable = true)
    private BookSeries series;

    /**
     * The universe the book belongs to, if any.
     * A book can be part of a series or a universe, but not both at the same time.
     * If a book is part series, use {@link #series} instead, and leave this empty.
     */
    @ManyToOne(optional = true)
    @JoinColumn(name = "universe_id", nullable = true)
    private BookUniverse universe;

    /**
     * The title of the book.
     */
    @Column(nullable = false)
    private String name;

    /**
     * ISBN identifier of the book.
     */
    @Column(nullable = true)
    private String isbn;

    /*
    GETTERS AND SETTERS
    */


}
