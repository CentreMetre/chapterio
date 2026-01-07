package dev.centremetre.chapterio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "reading_statuses")
@Entity
public class ReadingStatus
{
    @Id
    private int id;

    private String status;
}
