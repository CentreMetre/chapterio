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
public class UniverseRead extends Read
{
    @ManyToOne
    @JoinColumn(name = "book_universe_id")
    private Universe universe;
}
