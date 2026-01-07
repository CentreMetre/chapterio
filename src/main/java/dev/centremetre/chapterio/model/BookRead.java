package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "book_reads")
@Entity
public class BookRead
{
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book bookId;

    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "end_time")
    private LocalTime endTime;

    @ManyToOne(optional = true) // null/empty = not finished yet. Must be filled to be marked as completed, e.g. with completed, or stopped reading.
    @JoinColumn(name = "finish_reason")
    private FinishReason finishReason;

    @ManyToOne(optional = true)
    @JoinColumn(name = "book_reads_id", nullable = true)
    private BookSeriesRead bookSeriesRead;

    @ManyToOne(optional = false)
    @JoinColumn(name = "reading_status")
    private ReadingStatus readingStatus;

    private String notes;
}
