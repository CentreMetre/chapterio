package dev.centremetre.chapterio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "finish_reasons")
public class FinishReason
{
    @Id
    private int id;

    private String reason;
}
