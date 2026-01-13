package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

/**
 * Represents a book series.
 *
 * A book series is made up of multiple books.
 * A book series can optionally be part of a universe.
 */
@Entity
@Table(name = "book_series")
public class Series
{
    @Id
    private Integer id;

    @ManyToOne(optional = true)
    @JoinColumn(name = "universe_id", nullable = true)
    private Universe universe;
}
