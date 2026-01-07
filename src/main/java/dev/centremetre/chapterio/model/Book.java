package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book
{
    @Id
    private int id;

    @ManyToOne(optional = true)
    @JoinColumn(name = "series_id", nullable = true)
    private BookSeries series;

    @Column(nullable = false)
    private String name;

    private String isbn;

    /*
    GETTERS AND SETTERS
    */


}
