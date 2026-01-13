package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Represents a book series read.
 *
 * A book series read is made up of multiple book reads.
 * A book series read can optionally be part of a universe read.
 */
@Entity
@Table(name = "book_series_reads")
public class BookSeriesRead
{
    @Id
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book_series_id", nullable = false)
    private BookSeries bookSeries;

    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "end_time")
    private LocalTime endTime;

    @ManyToOne(optional = true)
    @JoinColumn(name = "book_reads_id", nullable = true)
    private BookUniverseRead bookUniverseRead;

    @ManyToOne(optional = false)
    @JoinColumn(name = "reading_status", nullable = false)
    ReadingStatus readingStatus;

    String notes;
}
