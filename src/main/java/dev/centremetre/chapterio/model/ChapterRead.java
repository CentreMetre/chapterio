package dev.centremetre.chapterio.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.time.LocalDate;

/**
 * A chapter read is an instance of reading a chapter.
 *
 * A chapter read can be part of a book read, but doesn't have to be.
 * A chapter read is linked to the chapter itself.
 */
@Entity
@Table(name = "chapter_reads")
public class ChapterRead extends Read
{
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapterId;

    @ManyToOne(optional = true)
    @JoinColumn(name = "book_reads_id", nullable = true)
    private BookRead bookRead;
}
