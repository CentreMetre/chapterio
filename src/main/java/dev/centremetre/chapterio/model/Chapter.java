package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "chapters")
public class Chapter
{
    @Id
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    private String title;

    @Column(nullable = false)
    private int orderIndex;

    @Column(nullable = false)
    private String displayNumber;

    /*
    GETTERS AND SETTERS
    */


}
