package dev.centremetre.chapterio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a fictional universe.
 *
 * A universe can be made up of multiple series and/or books.
 */
@Entity
@Table(name = "book_universes")
public class Universe
{
    @Id
    private Integer id;

    private String name;
}
