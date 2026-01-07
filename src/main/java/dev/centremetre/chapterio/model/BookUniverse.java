package dev.centremetre.chapterio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_universes")
public class BookUniverse
{
    @Id
    private int id;

    private String name;
}
