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
public class BookRead
{
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "end_time")
    private LocalTime endTime;

    /**
     * The series the book belongs to, if any.
     * A book can be part of a series or a universe, but not both at the same time.
     * If a book is part of a universe but not a series, use {@link #universeRead} instead, and leave this empty.
     */
    @ManyToOne(optional = true)
    @JoinColumn(name = "book_reads_id", nullable = true)
    private BookSeriesRead seriesRead;

    /**
     * The universe the book belongs to, if any.
     * A book can be part of a series or a universe, but not both at the same time.
     * If a book is part series, use {@link #seriesRead} instead, and leave this empty.
     */
    @ManyToOne(optional = true)
    @JoinColumn(name = "universe_id", nullable = true)
    private BookUniverseRead universeRead;

    @ManyToOne(optional = false)
    @JoinColumn(name = "reading_status", nullable = false)
    private ReadingStatus readingStatus;

    private String notes;
}
