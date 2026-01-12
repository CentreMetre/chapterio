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
public class BookSeries
{
    @Id
    private int id;

    @ManyToOne(optional = true)
    @JoinColumn(name = "universe_id", nullable = true)
    private BookUniverse universe;
}
