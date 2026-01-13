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
public class SeriesRead extends Read
{
    @ManyToOne(optional = false)
    @JoinColumn(name = "book_series_id", nullable = false)
    private Series series;

    @ManyToOne(optional = true)
    @JoinColumn(name = "book_reads_id", nullable = true)
    private UniverseRead universeRead;
}
