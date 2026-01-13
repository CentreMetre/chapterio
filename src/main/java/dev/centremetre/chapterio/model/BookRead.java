package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * An instance of reading a book.
 *
 * A book read is made up of multiple chapter reads.
 * A book read can be part of a series read or a universe read, but not both,
 * or could be a part of neither a series nor a universe.
 */
@Table(name = "book_reads")
@Entity
public class BookRead extends Read
{
    /**
     * The book that this is a read of.
     */
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    /**
     * The series the book belongs to, if any.
     * A book can be part of a series or a universe, but not both at the same time.
     * If a book is part of a universe but not a series, use {@link #universeRead} instead, and leave this empty.
     */
    @ManyToOne(optional = true)
    @JoinColumn(name = "book_reads_id", nullable = true)
    private SeriesRead seriesRead;

    /**
     * The universe the book belongs to, if any.
     * A book can be part of a series or a universe, but not both at the same time.
     * If a book is part series, use {@link #seriesRead} instead, and leave this empty.
     */
    @ManyToOne(optional = true)
    @JoinColumn(name = "universe_id", nullable = true)
    private UniverseRead universeRead;
}
