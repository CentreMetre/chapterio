package dev.centremetre.chapterio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents the current status of the book, for example 'Currently Reading', 'Finished', 'Stopped Reading'.
 */
@Table(name = "reading_statuses")
@Entity
public class ReadingStatus
{
    @Id
    private int id;

    private String status;
}
