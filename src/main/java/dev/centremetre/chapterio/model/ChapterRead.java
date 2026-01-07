package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.time.LocalDate;

@Entity
@Table(name = "chapter_reads")
public class ChapterRead
{
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapterId;

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
    private BookRead bookRead;

    @ManyToOne(optional = false)
    @JoinColumn(name = "reading_status")
    ReadingStatus readingStatus;

    String notes;
}
