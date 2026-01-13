package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@MappedSuperclass
public abstract class Read
{
    @Id
    private Integer id;

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
    private ReadingStatus readingStatus;

    private String notes;
}
