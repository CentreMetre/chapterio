package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book_series")
public class BookSeries
{
    @Id
    private int id;

    @ManyToOne(optional = true)
    @JoinColumn(name = "universe_id")
    private BookUniverse universe;
}
