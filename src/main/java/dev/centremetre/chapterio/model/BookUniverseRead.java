package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Represents a universe read.
 *
 * A universe read can be made up of multiple series reads and/or book reads.
 */
@Table(name = "book_universe_reads")
@Entity
public class BookUniverseRead
{
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_universe_id")
    private BookUniverse bookUniverse;

    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "end_time")
    private LocalTime endTime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "reading_status", nullable = false)
    ReadingStatus readingStatus;

    String notes;
}
